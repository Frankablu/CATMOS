package org.eclipse.epsilon.examples.tools;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;
import java.io.*;
import java.net.*;

import java.lang.String;

import jpl.Atom;
import jpl.Query;
import jpl.Term;
import jpl.Variable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplate;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eml.EmlModule;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.types.EolPrimitiveType;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.flock.FlockModule;
import org.eclipse.epsilon.flock.IFlockContext;
import org.eclipse.epsilon.flock.execution.exceptions.FlockUnsupportedModelException;
import org.eclipse.epsilon.eol.types.EolPrimitiveType;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.gantt.*;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.Month;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.util.GregorianCalendar;
import org.jfree.chart.ChartUtilities.*;

import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RunTool {
	  
	public void createPieChart()
	{
		PieChart demo = new PieChart("Comparison", "Which operating system are you using?");
        demo.pack();
        demo.setVisible(true);
	}
	
	public ScatterChart ourScatterChart;
	
	public void createScatterChart()
	{
		ourScatterChart = new ScatterChart("Pareto Front", "");
		ourScatterChart.startPlotting();
	}
	
	public void scatterAddPoint(int x, int y)
	{
		ourScatterChart.addPoint(x, y);
	}
	
	public void runChart()
	{
		ourScatterChart.createChart();
		ourScatterChart.pack();
		ourScatterChart.setVisible(true);
	}
	
	ArrayList<String> seriesNames = new ArrayList<String>();
	ArrayList<Double> scatterX = new ArrayList<Double>();
	ArrayList<Double> scatterY = new ArrayList<Double>();
	
	String scatterName;
	public void setScatterChartName(String name)
	{
		scatterName = name;
	}
	
	String scatterSolutionNumber;
	public void setScatterSolutionNumber(String number)
	{
		scatterSolutionNumber = number;
	}
	
	public void addScatterPoint(String name, int x, int y)
	{	
	 	//Add new point
		seriesNames.add(name);
		scatterX.add((double)x);
		scatterY.add((double)y / 100.0);
	}
	
	public void createScatterPlot()
	{
		XYSeriesCollection dataSet = new XYSeriesCollection();
		ArrayList<String> doneList = new ArrayList<String>();
		
		for (int i = 0; i < seriesNames.size(); i++)
		{
			String seriesName = seriesNames.get(i);
			
			if (doneList.contains(seriesName) == false)
			{
			
			XYSeries series = new XYSeries(seriesName);
			double lastValue = 0.0;
			
			for (int j = 0; j < seriesNames.size(); j++)
			{
				if (seriesName.equals(seriesNames.get(j)))
				{
					series.add(scatterX.get(j)+0,lastValue); //Make discrete
					
					series.add(scatterX.get(j),scatterY.get(j));
					lastValue = scatterY.get(j);
				}
			}
			
			dataSet.addSeries(series);
			}
			
			doneList.add(seriesName);
			
		}
		
        //JFreeChart chart = ChartFactory.createScatterPlot("Capability Over Time","Time","Capability",dataSet,PlotOrientation.VERTICAL,true,true,false);
		JFreeChart chart = ChartFactory.createXYLineChart("Capability Over Time","Time","Capability",dataSet,PlotOrientation.VERTICAL,true,true,false);
		
        File myFile = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator()+scatterName+"/Results/CapOverTime"+scatterSolutionNumber+".png");
		
		try {
			org.jfree.chart.ChartUtilities.saveChartAsPNG(myFile,chart,1800,1200);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	String ganntName;
	public void setGanntChartName(String name)
	{
		ganntName = name;
	}
	
	String solutionNumber;
	public void setGanntSolutionNumber(String number)
	{
		solutionNumber = number;
	}
	
	ArrayList<String> componentNames = new ArrayList<String>();
	ArrayList<String> startTimes = new ArrayList<String>();
	ArrayList<String> stopTimes = new ArrayList<String>();
	
	public void addGanntComponent(String name, String startTime, String stopTime)
	{
		componentNames.add(name);
		startTimes.add(startTime);
		stopTimes.add(stopTime);
	}
	
	public void createGanntChart()
	{
		TaskSeriesCollection dataset = new TaskSeriesCollection();

		TaskSeries ourDataSet = new TaskSeries("Component Schedules");
		
		for (int i = 0; i < componentNames.size(); i++)
		{	
			int yearS = 0;
			int monthS = 0;
			int dayS = 0;
			
			int yearE = 0;
			int monthE = 0;
			int dayE = 0;
			
			String dateSplitStart[] = startTimes.get(i).split("/");
			String dateSplitEnd[] = stopTimes.get(i).split("/");
			
			if (dateSplitStart.length == 3)
			{
				yearS = Integer.parseInt(dateSplitStart[2]);
				monthS = Integer.parseInt(dateSplitStart[1]) - 1;
				dayS = Integer.parseInt(dateSplitStart[0]);
				
				yearE = Integer.parseInt(dateSplitEnd[2]);
				monthE = Integer.parseInt(dateSplitEnd[1]) - 1;
				dayE = Integer.parseInt(dateSplitEnd[0]);
			}
			else
			{
				dayS = Integer.parseInt(startTimes.get(i));
				dayE = Integer.parseInt(stopTimes.get(i));
			}
			
			if (dayS != -1)
			{
				Task ourTask = new Task(componentNames.get(i), 
					new GregorianCalendar(yearS, monthS, dayS, 0, 00).getTime(), 
					new GregorianCalendar(yearE, monthE, dayE, 0, 00).getTime());
				ourDataSet.add(ourTask);
			}
		}
		
		dataset.add(ourDataSet);

		JFrame frame = new JFrame(ganntName);	
		// title, domain axis, range axis, dataset, legend, tooltip, urls
		JFreeChart chart = ChartFactory.createGanttChart("", "Components", "Schedule", dataset, false, true, false);
		
		File myFile = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator()+ganntName+"/Results/Gannt"+solutionNumber+".png");
		
		try {
			org.jfree.chart.ChartUtilities.saveChartAsPNG(myFile,chart,1800,1200);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public long convertDateTime(String dateTime)
    {
    	try
    	{
    		Date newDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateTime);
        	return newDate.getTime();
    	}
    	catch (Exception e)
    	{
    		System.out.println("Date Parsing Error");
    		return -999999999; //Clear crash, please
    	}
    }
    
    public String convertDateTime(long dateTimeL)
    {
		Date newDate = new Date(dateTimeL);
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	String stringDate = df.format(newDate);
    	return stringDate;
    }
    
    public String convertDateTime(long dateTimeL, int dateTimeL2)
    {
    	long dateTimeL3 = dateTimeL2;
		Date newDate = new Date(dateTimeL+(dateTimeL3*1000 * 60 * 60 * 24));
    	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	String stringDate = df.format(newDate);
    	return stringDate;
    }
    
    public long getLong()
    {
    	Long a = new Long(0);
    	return a;
    }
	
		//Prolog - Union
		public String getSolution()
		{
			
			Query q1 = 
				    new Query( 
				        "consult", 
				        new Term[] {new Atom(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator()+"Tool/Models/union")} 
				    );
			
			System.out.println( "consult " + (q1.query() ? "succeeded" : "failed"));
			q1.rewind();
			
			Variable R = new Variable("R");
			
			Query q =
					new Query(
						"canMeetScenario",
						new Term[] {R}
							);
			
			Hashtable solution = q.oneSolution();
			String Result = new String(solution.get("R").toString());
			
			Result = Result.replaceAll("\\.", "");
			Result = Result.replaceAll("\\[", "");
			Result = Result.replaceAll("\\]", "");
			Result = Result.replaceAll("\\(", "");
			Result = Result.replaceAll("\\)", "");
			Result = Result.replaceAll("[ ',]*,[ ',]*", ",");
			Result = Result.replaceAll("^,","");
			
			return Result;
		}
		
		public String getSolutionUpgrades()
		{	
			Variable R = new Variable("R");
			
			Query q =
					new Query(
						"getUpgrades",
						new Term[] {R}
							);
			
			Hashtable solution = q.oneSolution();
			String Result = new String(solution.get("R").toString());
			
			Result = Result.replaceAll("\\.", "");
			Result = Result.replaceAll("\\[", "");
			Result = Result.replaceAll("\\]", "");
			Result = Result.replaceAll("\\(", "");
			Result = Result.replaceAll("\\)", "");
			Result = Result.replaceAll("[ ',]*,[ ',]*", ",");
			Result = Result.replaceAll("^,","");
			
			return Result;
			
		}
		
		//Prolog Scheduling
		public String getSchedule()
		{
			Query q2 = new Query("[library(clpfd)]");
			q2.hasSolution();
			
			Query q1 = 
				    new Query( 
				        "consult", 
				        new Term[] {new Atom(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator()+"Tool/Models/scheduling.pl")} 
				    );
			
			q1.hasSolution();
			
			Variable R = new Variable("R");
			
			Query q =
					new Query(
						"getSchedule",
						new Term[] {R}
							);
			
			Hashtable solution = q.oneSolution();
			String Result = new String(solution.get("R").toString());
			
			Result = Result.replaceAll("\\.", "");
			Result = Result.replaceAll("\\[", "");
			Result = Result.replaceAll("\\]", "");
			Result = Result.replaceAll("\\(", "");
			Result = Result.replaceAll("\\)", "");
			Result = Result.replaceAll("[ ',]*,[ ',]*", ",");
			Result = Result.replaceAll("^,","");
			
			return Result;
		}
		
		//Prolog Scheduling
				public String getMaxSchedule()
				{
					Query q2 = new Query("[library(clpfd)]");
					q2.hasSolution();
					
					Query q1 = 
						    new Query( 
						        "consult", 
						        new Term[] {new Atom(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator()+"Tool/Models/schedulingMax.pl")} 
						    );
					
					q1.hasSolution();
					
					Variable R = new Variable("R");
					
					Query q =
							new Query(
								"getSchedule",
								new Term[] {R}
									);
					
					Hashtable solution = q.oneSolution();
					String Result = new String(solution.get("R").toString());
					
					Result = Result.replaceAll("\\.", "");
					Result = Result.replaceAll("\\[", "");
					Result = Result.replaceAll("\\]", "");
					Result = Result.replaceAll("\\(", "");
					Result = Result.replaceAll("\\)", "");
					Result = Result.replaceAll("[ ',]*,[ ',]*", ",");
					Result = Result.replaceAll("^,","");
					
					return Result;
				}
	
		//GC
		private int GCcount = 0;
		
		private void gcCheck()
		{
			GCcount = GCcount + 1;
			
			if (GCcount > 4)
			{
				GCcount = 0;
				System.gc();
			}
		}
		
		//File Poke - Returns if exists
		public boolean pokeFile(String filename)
		{
			IPath file = new Path(filename);
			return ResourcesPlugin.getWorkspace().getRoot().exists(file);
			
		}
		
		public String readFileNoLineReturns(String filename) throws IOException
		{
			FileReader fr = new FileReader(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator() + filename);
			String fileContent = "";
			String currentLine;

			BufferedReader br = new BufferedReader(fr);
			 
			while ((currentLine = br.readLine()) != null) {
				if (currentLine.contains("--"))
				{
					//Skip Line it's a comment
				}
				else
				{
					fileContent = fileContent + currentLine + " ";
				}
			}
			
			String filteredScript = new String(fileContent);
			filteredScript = filteredScript.replaceAll("\n", " ");
			filteredScript = filteredScript.replaceAll("\r", " ");
			
			return filteredScript;
		}
		
		//Better run EGL
		private ArrayList<EmfModel> eglLoadedModels;
		
		public void setupEGL()
		{
			eglLoadedModels = new ArrayList<EmfModel>();
		}
		
		public void loadModel(String modelName, String modelFile, String metamodel)
		{
			EmfModel model = new EmfModel();
			model.setMetamodelUri(metamodel);
			model.setModelFileUri(URI.createPlatformResourceURI(modelFile, true));
			model.setName(modelName);
			model.setReadOnLoad(true);
			model.setStoredOnDisposal(false);
			
			try
			{
				model.load();
				eglLoadedModels.add(model);
			}
			catch (Exception e)
			{
				System.out.println("Model Load Error");
			}
		}
		
		private static EmfModel satScenModel;
		
		public void loadSatScenModel()
		{
			//System.out.println(satScenModel);
			eglLoadedModels.add(satScenModel);
		}
		
		public void runBetterEGL(String eglFile, String outputFile) throws EglRuntimeException, URISyntaxException
		{
			EglFileGeneratingTemplateFactory eglFileGen = new EglFileGeneratingTemplateFactory();
			eglFileGen.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
			
			for (int i = 0; i < eglLoadedModels.size(); i++)
			{
				eglFileGen.getContext().getModelRepository().addModel(eglLoadedModels.get(i));
			}
			
			EglFileGeneratingTemplate template = (EglFileGeneratingTemplate) eglFileGen.load(new java.net.URI(URI.createPlatformResourceURI(eglFile, true).toString()));
			template.generate(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator()+outputFile);
			
		}
		
		//Run EGL
		public void runEGL(String eglFile, String modelName, String modelFile, String metamodel, String outputFile) throws Exception
		{
			EmfModel model = new EmfModel();
			model.setMetamodelUri(metamodel);
			model.setModelFileUri(URI.createPlatformResourceURI(modelFile, true));
			model.setName(modelName);
			model.setReadOnLoad(true);
			model.setStoredOnDisposal(false);
			model.load();
			
			EglFileGeneratingTemplateFactory eglFileGen = new EglFileGeneratingTemplateFactory();
			eglFileGen.getContext().getModelRepository().addModel(model);
			EglFileGeneratingTemplate template = (EglFileGeneratingTemplate) eglFileGen.load(new java.net.URI(URI.createPlatformResourceURI(eglFile, true).toString()));
			template.generate(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator()+outputFile);
		}
		
	  //ETL
	  private ArrayList<EmfModel> etlLoadedModels;
	  
	  public void runETL(String etlFile) throws URISyntaxException, Exception
	  {
		  //mEtlModule.parse(URI.createPlatformResourceURI(etlFile, true));

		  mEtlModule.parse(new java.net.URI(URI.createPlatformResourceURI(etlFile, true).toString()));
		  
		  mEtlModule.execute();
		  
		  int lModel;
		  for (lModel = 0; lModel < etlLoadedModels.size(); lModel++)
		  {
			  etlLoadedModels.get(lModel).dispose();
		  }
		  
		  etlLoadedModels.clear();
		  mEtlModule = null; //Dealloc
		  
		  gcCheck();
		  
	  }
	  
	  public void setupETL()
	  {
		  mEtlModule = new EtlModule();
		  etlLoadedModels = new ArrayList<EmfModel>();
	  }
	  
	  private EtlModule mEtlModule;
	  
    public EmfModel etlLoadModel(String modelName, String modelPath, String metamodel, String rw) throws EolModelLoadingException {
		EmfModel model = new EmfModel();
		model.setMetamodelUri(metamodel);
		//IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(modelPath));
		
		model.setModelFileUri(URI.createPlatformResourceURI(modelPath, true));
		model.setName(modelName);
		
		model.setReadOnLoad(false);
		model.setStoredOnDisposal(false);
		
		if (rw.contains("r"))
		{
			model.setReadOnLoad(true);
		}
		if (rw.contains("w"))
		{
			model.setStoredOnDisposal(true);
		}
		
		//URI.createURI(getClass().getResource(modelPath).toExternalForm()));
		model.load();
		etlLoadedModels.add(model);
		mEtlModule.getContext().getModelRepository().addModel(model);
		return model;
    }
    
    //EOL
    
	  private ArrayList<EmfModel> eolLoadedModels;
	  
	  public void runEOL(String etlFile) throws URISyntaxException, Exception
	  {
		  runEOL(etlFile, null);
	  }
	  
	  public void runEOL(String etlFile, String passString) throws URISyntaxException, Exception
	  {
		  //Setup
		  mEolModule = new EolModule();
		  eolLoadedModels = new ArrayList<EmfModel>();
		  
		  //Load models here
		  int a;
		  for (a = 0; a < modelNames.size(); a++)
		  {
			  String modelName;
			  String alias;
			  String metamodel;
			  String modelPath;
			  String rw;
			 modelName = modelNames.get(a);
			 metamodel = metamodels.get(a);
			 alias = modelAlias.get(a);
			 modelPath = modelPaths.get(a);
			 rw = rws.get(a);
			 
			EmfModel model = new EmfModel();
			model.setMetamodelUri(metamodel);
			
			model.setModelFileUri(URI.createPlatformResourceURI(modelPath, true));
			model.setName(modelName);
			
			model.getAliases().add(alias);
	  		
	  		model.setReadOnLoad(false);
	  		model.setStoredOnDisposal(false);
	  		
	  		if (rw.contains("r"))
	  		{
	  			model.setReadOnLoad(true);
	  		}
	  		if (rw.contains("w"))
	  		{
	  			model.setStoredOnDisposal(true);
	  		}
			
			model.load();
			
			//System.out.println(modelName);
			if (modelName == "satScen")
			{
				satScenModel = model; //Speed Hack TL uses this
			}
			
			eolLoadedModels.add(model);
			mEolModule.getContext().getModelRepository().addModel(model);
			
			
		  }
		  
		  //Run EOL
		  try
		  {
		  
		  mEolModule.parse(new java.net.URI(URI.createPlatformResourceURI(etlFile, true).toString()));
		  
		  //Pass Exec String
		  if (passString != null)
		  {
			  mEolModule.getContext().getFrameStack().put(new org.eclipse.epsilon.eol.execute.context.Variable("passString",passString, EolPrimitiveType.String));
		  }
		  
		  mEolModule.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
		  
		  
			  mEolModule.execute();
		
		  int lModel;
		  for (lModel = 0; lModel < eolLoadedModels.size(); lModel++)
		  {
			  eolLoadedModels.get(lModel).dispose();
		  }
		  
		  eolLoadedModels.clear();
		  mEolModule = null; //Dealloc
		  gcCheck();
		  }
		  catch(Exception A){ 
			//Setup
			  mEolModule = new EolModule();
			  eolLoadedModels = new ArrayList<EmfModel>();
			  
			  //Load models here
			  for (a = 0; a < modelNames.size(); a++)
			  {
				  String modelName;
				  String metamodel;
				  String modelPath;
				  String alias;
				  String rw;
				 modelName = modelNames.get(a);
				 metamodel = metamodels.get(a);
				 modelPath = modelPaths.get(a);
				 alias = modelAlias.get(a);
				 rw = rws.get(a);
				 
				EmfModel model = new EmfModel();
				model.setMetamodelUri(metamodel);
				
				model.setModelFileUri(URI.createPlatformResourceURI(modelPath, true));
				model.setName(modelName);
				model.getAliases().add(alias);
		  		
		  		model.setReadOnLoad(false);
		  		model.setStoredOnDisposal(false);
		  		
		  		if (rw.contains("r"))
		  		{
		  			model.setReadOnLoad(true);
		  		}
		  		if (rw.contains("w"))
		  		{
		  			model.setStoredOnDisposal(true);
		  		}
				
				model.load();
				eolLoadedModels.add(model);
				mEolModule.getContext().getModelRepository().addModel(model);
			  }
				  mEolModule.parse(new java.net.URI(URI.createPlatformResourceURI(etlFile, true).toString()));
				  
				//Pass Exec String
				  if (passString != null)
				  {
					  mEolModule.getContext().getFrameStack().put(new org.eclipse.epsilon.eol.execute.context.Variable("passString",passString, EolPrimitiveType.String));
				  }
				  
				  mEolModule.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
				mEolModule.execute();
				
				  int lModel;
				  for (lModel = 0; lModel < eolLoadedModels.size(); lModel++)
				  {
					  eolLoadedModels.get(lModel).dispose();
				  }
				  
				  eolLoadedModels.clear();
				  mEolModule = null; //Dealloc
			  
		  }
		  
		 
	  }
	  
	  Socket ourSocket;
	  PrintWriter out;
	  BufferedReader in;
	  String serverHost;
	  Integer serverPort;
	  
	  public void connectToNetworkClient(String host, Integer port)
	  {
		  ourSocket = null;
	      PrintWriter out = null;
	      BufferedReader in = null;
	      
	      serverHost = host;
	      serverPort = port;
	      
	      try {
			ourSocket = new Socket(serverHost,serverPort);
			out = new PrintWriter(ourSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
			out.println("reset");
			//out.println("link");
			
			//System.out.println(in.readLine());
			out.close();
			in.close();
			ourSocket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  public void createComponent(String name)
	  {
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("createComponent");
				out.println(name);
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public void sendCommand(String command)
	  {
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println(command);
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public void createCost(String name, String amount)
	  {
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("createCost");
				out.println(name);
				out.println(amount);
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public ArrayList<String> commandList;
	  
	  public void startCommandList()
	  {
		  commandList = new ArrayList<String>();
	  }
	  
	  public void addCommand(String command)
	  {
		  commandList.add(command);
	  }
	  
	  public void sendCommands()
	  {
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				for (String command : commandList)
				{
					out.println(command);
				}
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  
	  
	  public void createCapabilityProvision(String name, String reuse)
	  {
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("createCapabilityProvision");
				out.println(name);
				out.println(reuse);
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public void createQVD(String greater, String lessThan)
	  {
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("addQVD");
				out.println(greater);
				out.println(lessThan);
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public void sendRaw(String rawData)
	  {
		  try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.print(rawData);
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public void createCapabilityUpgrade(String name, String targetComponent)
	  {
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("createCapabilityUpgrade");
				System.out.println(name);
				out.println(name);
				out.println(targetComponent);
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public void createCapability(String name, boolean searchObjective, boolean standAlone, boolean seq)
	  {
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				if (searchObjective)
				{
					out.println("createCapabilitySO");
				}
				else
				{
					if (seq == false)
					{
						out.println("createCapability");
					}
					else
					{
						out.println("createCapabilitySeq");
					}
				}
				
				out.println(name);
				if (standAlone)
				{
					out.println("true");
				}
				else
				{
					out.println("false");
				}
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public void createMeasurement(String name, String critical, String benchmark, String provided, String script, boolean acc)
	  {
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				if (acc == false)
				{
					out.println("createMeasure");
				}
				else
				{
					out.println("createMeasureAcc");
				}
				out.println(name);
				out.println(critical);
				out.println(benchmark);
				out.println(provided);
				
				String filteredScript = new String(script);
				filteredScript = filteredScript.replaceAll("\n", " ");
				filteredScript = filteredScript.replaceAll("\r", " ");
				out.println(filteredScript);
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public void setUpgrade(String source, String upgrade, String target)
	  {
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("upgrade");
				out.println(source);
				out.println(upgrade);
				out.println(target);
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public void createLink(String source, String cap, String target)
	  {
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("link");
				out.println(source);
				out.println(cap);
				out.println(target);
				
				out.close();
				in.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
	  public String networkEvaluate()
	  {
		  String response = new String();
		    
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("evaluate");
				
				String serverResponse;
				serverResponse = in.readLine();
				response = serverResponse;
				
				while (serverResponse.startsWith("Done") != true)
				{	
					serverResponse = in.readLine();	
					response = response.concat("%").concat(serverResponse);
				}
				
				in.close();
				out.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			return response;
	  }
	  
	  public String networkFullEvaluate()
	  {
		  String response = new String();
		    
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("full");
				
				String serverResponse;
				serverResponse = in.readLine();
				response = serverResponse;
				
				while (serverResponse.startsWith("Done") != true)
				{	
					serverResponse = in.readLine();	
					response = response.concat("%").concat(serverResponse);
				}
				
				in.close();
				out.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			return response;
	  }
	  
	  public String getParetoFront()
	  {
		  String response = new String();
		    
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("getParetoFront");
				
				String serverResponse;
				serverResponse = in.readLine();
				response = serverResponse;
				
				while (serverResponse.startsWith("Done") != true)
				{	
					serverResponse = in.readLine();	
					response = response.concat("%").concat(serverResponse);
				}
				
				in.close();
				out.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			return response;
	  }
	  
	  public String getParetoFrontAt(String place)
	  {
		  String response = new String();
		    
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("getParetoFrontAt");
				out.println(place);
				
				String serverResponse;
				serverResponse = in.readLine();
				response = serverResponse;
				
				while (serverResponse.startsWith("Done") != true)
				{	
					serverResponse = in.readLine();	
					response = response.concat("%").concat(serverResponse);
				}
				
				in.close();
				out.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			return response;
	  }
	  
	  public String getParetoFrontAtTL(String place)
	  {
		  String response = new String();
		    
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("getParetoFrontAtTL");
				out.println(place);
				
				String serverResponse;
				serverResponse = in.readLine();
				response = serverResponse;
				
				while (serverResponse.startsWith("Done") != true)
				{	
					serverResponse = in.readLine();	
					response = response.concat("%").concat(serverResponse);
				}
				
				in.close();
				out.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			return response;
	  }
	  
	  public String getParetoFrontSize()
	  {
		  String response = new String();
		    
		    try {
				ourSocket = new Socket(serverHost,serverPort);
				out = new PrintWriter(ourSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(ourSocket.getInputStream()));
				
				out.println("getParetoFrontSize");
				
				String serverResponse;
				serverResponse = in.readLine();
				response = serverResponse;
				
				in.close();
				out.close();
				ourSocket.close();
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			return response;
	  }
	  
	  
	  
	  public void setupEOL()
	  {
		  modelNames = new ArrayList<String>();
		  modelAlias = new ArrayList<String>();
		  modelPaths = new ArrayList<String>();
		  metamodels = new ArrayList<String>();
		  rws = new ArrayList<String>();
	  }
	  
	  private EolModule mEolModule;
	  private ArrayList<String> modelNames;
	  private ArrayList<String> modelAlias;
	  private ArrayList<String> modelPaths;
	  private ArrayList<String> metamodels;
	  private ArrayList<String> rws;
	  
      public void eolLoadModel(String modelName, String modelPath, String metamodel, String rw) throws EolModelLoadingException {
    	modelNames.add(modelName);
    	modelAlias.add(modelName);
    	modelPaths.add(modelPath);
    	metamodels.add(metamodel);
    	rws.add(rw);
      }

      public void eolLoadModelAlias(String modelName, String modelPath, String metamodel, String rw, String alias) throws EolModelLoadingException {
    	modelNames.add(modelName);
    	modelAlias.add(alias);
      	modelPaths.add(modelPath);
      	metamodels.add(metamodel);
      	rws.add(rw);
      }
      
      //EML
      private EmlModule mEmlModule;
      private EclModule mEclModule;
      private ArrayList<EmfModel> emlLoadedModels;
      
      public void setupEML()
      {
    	  mEmlModule = new EmlModule();
    	  mEclModule = new EclModule();
    	  emlLoadedModels = new ArrayList<EmfModel>();
      }
      
      public void emlLoadModel(String modelName, String modelPath, String metamodel, String rw) throws EolModelLoadingException
      {
    	EmfModel model = new EmfModel();
  		model.setMetamodelUri(metamodel);
  		//IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(modelPath));
  		
  		model.setModelFileUri(URI.createPlatformResourceURI(modelPath, true));
  		model.setName(modelName);
  		
    		model.setModelFileUri(URI.createPlatformResourceURI(modelPath, true));
    		model.setName(modelName);
    		
    		model.setReadOnLoad(false);
    		model.setStoredOnDisposal(false);
    		
    		if (rw.contains("r"))
    		{
    			model.setReadOnLoad(true);
    		}
    		if (rw.contains("w"))
    		{
    			model.setStoredOnDisposal(true);
    		}
  		
  		//URI.createURI(getClass().getResource(modelPath).toExternalForm()));
  		model.load();
  		emlLoadedModels.add(model);
  		mEmlModule.getContext().getModelRepository().addModel(model);
      }
      
      public void runEML(String eclFile, String emlFile) throws Exception
      {
    	  mEclModule.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
    	  mEclModule.getContext().setOutputStream(mEmlModule.getContext().getOutputStream());
    	  mEclModule.getContext().setErrorStream(mEmlModule.getContext().getErrorStream());
    	  
    	  mEmlModule.parse(new java.net.URI(URI.createPlatformResourceURI(emlFile, true).toString()));
    	  mEclModule.parse(new java.net.URI(URI.createPlatformResourceURI(eclFile, true).toString()));
    	  
    	  mEclModule.getContext().setModelRepository(mEmlModule.getContext().getModelRepository());
    	  mEclModule.getContext().setIntrospectionManager(mEmlModule.getContext().getIntrospectionManager());
    	  mEclModule.getContext().setNativeTypeDelegates(mEmlModule.getContext().getNativeTypeDelegates());
    	  
    	  mEclModule.execute();
    	 
    	  mEmlModule.getContext().setMatchTrace(mEclModule.getContext().getMatchTrace().getReduced());
    	  
    	  mEmlModule.execute();
    	  
		  int lModel;
		  for (lModel = 0; lModel < emlLoadedModels.size(); lModel++)
		  {
			  emlLoadedModels.get(lModel).dispose();
		  }
		  
		  emlLoadedModels.clear();
		  mEmlModule = null; //Dealloc
		  mEclModule = null;
		  gcCheck();
      }
      
      //Flock
	  private EmfModel flockOriginal;
	  private EmfModel flockMigrated;
	  private ArrayList<EmfModel> flockExtra;
	  private int called = 0;

	  public void setupFlock() throws FlockUnsupportedModelException 
	  {
		  called = 0;
		  flockExtra = new ArrayList<EmfModel>();
	  }
	  
	  public EmfModel flockLoadModel(String modelName, String modelPath, String metamodel, String rw) throws EolModelLoadingException
	  {
		  if (called == 0)
		  {
			  called = called + 1;
			  return flockLoadModelOriginal(modelName, modelPath, metamodel, rw);
		  }
		  
		  if (called == 1)
		  {
			  called = called + 1;
			  return flockLoadModelMigrated(modelName, modelPath, metamodel, rw);
		  }
		  
		  return flockLoadModelExtra(modelName, modelPath, metamodel, rw);
		  
	  }
	  
      public EmfModel flockLoadModelOriginal(String modelName, String modelPath, String metamodel, String rw) throws EolModelLoadingException {
		EmfModel model = new EmfModel();
		model.setMetamodelUri(metamodel);
		//IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(modelPath));
		
  		model.setModelFileUri(URI.createPlatformResourceURI(modelPath, true));
  		model.setName(modelName);
  		model.setReadOnLoad(false);
  		model.setStoredOnDisposal(false);
  		
  		if (rw.contains("r"))
  		{
  			model.setReadOnLoad(true);
  		}
  		if (rw.contains("w"))
  		{
  			model.setStoredOnDisposal(true);
  		}
  		
		model.load();
		flockOriginal = model;
		return model;
      }
      
      public EmfModel flockLoadModelMigrated(String modelName, String modelPath, String metamodel, String rw) throws EolModelLoadingException {
		EmfModel model = new EmfModel();
		model.setMetamodelUri(metamodel);
		//IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(modelPath));
		
  		model.setModelFileUri(URI.createPlatformResourceURI(modelPath, true));
  		model.setName(modelName);
  		model.setReadOnLoad(false);
  		model.setStoredOnDisposal(false);
  		
  		if (rw.contains("r"))
  		{
  			model.setReadOnLoad(true);
  		}
  		if (rw.contains("w"))
  		{
  			model.setStoredOnDisposal(true);
  		}
  		
		model.load();
		flockMigrated = model;
		return model;
      }
      
      public EmfModel flockLoadModelExtra(String modelName, String modelPath, String metamodel, String rw) throws EolModelLoadingException {
  		EmfModel model = new EmfModel();
  		model.setMetamodelUri(metamodel);
  		//IFile modelFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(modelPath));
  		
    		model.setModelFileUri(URI.createPlatformResourceURI(modelPath, true));
    		model.setName(modelName);
    		model.setReadOnLoad(false);
    		model.setStoredOnDisposal(false);
    		
    		if (rw.contains("r"))
    		{
    			model.setReadOnLoad(true);
    		}
    		if (rw.contains("w"))
    		{
    			model.setStoredOnDisposal(true);
    		}
    		
  		model.load();
  		flockExtra.add(model);
  		return model;
        }
	  
	  public void runFlock(String flockFile) throws URISyntaxException, Exception
	  {
		 FlockModule ourFlockModule = new FlockModule();
		 IFlockContext context = (IFlockContext) ourFlockModule.getContext();
		 context.getModelRepository().addModel(flockOriginal);
		 context.getModelRepository().addModel(flockMigrated);
		 context.setOriginalModel(0);
		 context.setMigratedModel(1);
		 
		 int extramodels;
		 for (extramodels = 0; extramodels < flockExtra.size(); extramodels++)
		 {
			 context.getModelRepository().addModel(flockExtra.get(extramodels));
		 }
		 
		// ourFlockModule.
		// ourFlockModule.getContext().execute(strategy)
		 
		 ourFlockModule.parse(new java.net.URI(URI.createPlatformResourceURI(flockFile, true).toString()));
		 ourFlockModule.buildModel();
		 
		 ourFlockModule.execute();
		 // mFlockModule.execute(flockLoadedModels.get(0), flockLoadedModels.get(1));
		  
		  flockOriginal.dispose();
		  flockMigrated.dispose();
		  
		  for (extramodels = 0; extramodels < flockExtra.size(); extramodels++)
		  {
			  flockExtra.get(extramodels).dispose();
		  }
		  
		  flockOriginal = null;
		  flockMigrated = null;
		  
		  flockExtra.clear();
		  ourFlockModule = null;
		  called = 0;
		  gcCheck();
	  }
	  
	  public void copyFile(String inputFilename, String outputFilename)
	  {
	      File inputFile = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator()+inputFilename);
	      File outputFile = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator()+outputFilename);
	      
			try {
	      FileReader in = new FileReader(inputFile);
	      FileWriter out = new FileWriter(outputFile);

	      int c;

	      while ((c = in.read()) != -1)
	      {
	        out.write(c);
	      }

	      in.close();
	      out.close();
	      
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
      
	  private ArrayList<String> componentScripts;
	  
	  public void collectScripts_start()
	  {
		  componentScripts = new ArrayList<String>();  
	  }
	  
	  public void collectScripts_addScript(String scriptName)
	  {
		  componentScripts.add(scriptName);
	  }
	  
	  public void collectScripts_generate() throws IOException
	  {
		  System.out.println(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator());  
		  
	        FileReader inputStream = null;
	        FileWriter outputStream = null;

	        try {
	            inputStream = new FileReader(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator() + "Tool/Transformations/basescripthead.eol");
	            outputStream = new FileWriter(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator() + "Tool/Transformations/tempscript.eol");

	            int c;
	            while ((c = inputStream.read()) != -1) {
	                outputStream.write(c);
	            }
	            
	            //Scripts
	            for (int n = 0; n < componentScripts.size(); n++)
	            {
	            	inputStream = new FileReader(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator() + componentScripts.get(n));
	            	
	            	while ((c = inputStream.read()) != -1) {
		                outputStream.write(c);
		            }
	            	
	            }
	            
	            inputStream = new FileReader(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator() + "Tool/Transformations/basescripttail.eol");
	            
	            while ((c = inputStream.read()) != -1) {
	                outputStream.write(c);
	            }
	            
	        } finally {
	            if (inputStream != null) {
	                inputStream.close();
	            }
	            if (outputStream != null) {
	                outputStream.close();
	            }
	        }
		  
	  }
	  
	  ArrayList<String> PFseriesNames = new ArrayList<String>();
	  ArrayList<Double> PFscatterX = new ArrayList<Double>();
	  ArrayList<Double> PFscatterY = new ArrayList<Double>();
	  String PFname;
	  
	  public void setPFname(String name)
	  {
		  PFname = name;
	  }
	  
	  public void addPFScatterPoint(String name, int x, int y)
		{
			PFseriesNames.add(name);
			PFscatterX.add((double)x / 1000.0);
			PFscatterY.add((double)y);
		}
		
		public void createPFScatterPlot()
		{
			XYSeriesCollection dataSet = new XYSeriesCollection();
			ArrayList<String> doneList = new ArrayList<String>();
			
			for (int i = 0; i < PFseriesNames.size(); i++)
			{
				String seriesName = PFseriesNames.get(i);
				
				if (doneList.contains(seriesName) == false)
				{
				
				XYSeries series = new XYSeries(seriesName);
				
				for (int j = 0; j < PFseriesNames.size(); j++)
				{
					if (seriesName.equals(PFseriesNames.get(j)))
					{
						series.add(PFscatterX.get(j),PFscatterY.get(j));						
					}
				}
				
				dataSet.addSeries(series);
				}
				
				doneList.add(seriesName);
				
			}
			
	        JFreeChart chart = ChartFactory.createScatterPlot("Pareto Front","Capability","Cost",dataSet,PlotOrientation.VERTICAL,true,true,false);
	        
	        File myFile = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().addTrailingSeparator()+PFname+"/Results/2DParetoFront.png");
			
			try {
				org.jfree.chart.ChartUtilities.saveChartAsPNG(myFile,chart,1800,1200);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
		}
	  
}
