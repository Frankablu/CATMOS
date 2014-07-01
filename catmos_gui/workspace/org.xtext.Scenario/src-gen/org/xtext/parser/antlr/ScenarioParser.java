/*
* generated by Xtext
*/
package org.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.services.ScenarioGrammarAccess;

public class ScenarioParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ScenarioGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.parser.antlr.internal.InternalScenarioParser createParser(XtextTokenStream stream) {
		return new org.xtext.parser.antlr.internal.InternalScenarioParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Scenario";
	}
	
	public ScenarioGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ScenarioGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}