package org.eclipse.epsilon.examples.tools;

import java.util.Random;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class ScatterChart extends JFrame {

	  private static final long serialVersionUID = 1L;

	  public ScatterChart(String applicationTitle, String chartTitle) {
	        super(applicationTitle);
	        // This will create the dataset 
	        //PieDataset dataset = createDataset();
	        // based on the dataset we create the chart
	        //JFreeChart chart = createChart(dataset, chartTitle);
	    }
	  
	  public XYSeriesCollection result;
	  public XYSeries series;
	  public void startPlotting()
	  {
		  result = new XYSeriesCollection();
		  series = new XYSeries("Random");
	  }
	  
	  public void addPoint(int x, int y)
	  {
		  series.add(x,y);
	  }
	  
	  public void createChart()
	  {
		  result.addSeries(series);
		  
		  JFreeChart chart = ChartFactory.createScatterPlot(
		            "Pareto Front", // chart title
		            "Average Cost", // x axis label
		            "Average Capability", // y axis label
		            result,
		            PlotOrientation.VERTICAL,
		            true, // include legend
		            true, // tooltips
		            false // urls
		            );
	        
	        // we put the chart into a panel
	        ChartPanel chartPanel = new ChartPanel(chart);
	        // default size
	        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
	        // add it to our application
	        setContentPane(chartPanel);
	  }
	    
}
