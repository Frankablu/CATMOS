package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.services.ScenarioGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractScenarioSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ScenarioGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Cost_Impl___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_4__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ScenarioGrammarAccess) access;
		match_Cost_Impl___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCost_ImplAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getCost_ImplAccess().getRightCurlyBracketKeyword_4_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Cost_Impl___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_4__q.equals(syntax))
				emit_Cost_Impl___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Cost_Impl___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
