/*
 * generated by Xtext 2.14.0
 */
package ac.soton.xtheory.ide.contentassist.antlr;

import ac.soton.xtheory.ide.contentassist.antlr.internal.InternalTheoryParser;
import ac.soton.xtheory.services.TheoryGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class TheoryParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TheoryGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TheoryGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTheoryAccess().getAlternatives_4(), "rule__Theory__Alternatives_4");
			builder.put(grammarAccess.getTypeAccess().getCommentAlternatives_0_0(), "rule__Type__CommentAlternatives_0_0");
			builder.put(grammarAccess.getConstructorAccess().getCommentAlternatives_0_0(), "rule__Constructor__CommentAlternatives_0_0");
			builder.put(grammarAccess.getDestructorAccess().getCommentAlternatives_0_0(), "rule__Destructor__CommentAlternatives_0_0");
			builder.put(grammarAccess.getOperatorAccess().getCommentAlternatives_0_0(), "rule__Operator__CommentAlternatives_0_0");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives_6_1(), "rule__Operator__Alternatives_6_1");
			builder.put(grammarAccess.getArgumentAccess().getCommentAlternatives_0_0(), "rule__Argument__CommentAlternatives_0_0");
			builder.put(grammarAccess.getAxiomAccess().getCommentAlternatives_0_0(), "rule__Axiom__CommentAlternatives_0_0");
			builder.put(grammarAccess.getTheoremAccess().getCommentAlternatives_0_0(), "rule__Theorem__CommentAlternatives_0_0");
			builder.put(grammarAccess.getVariableAccess().getCommentAlternatives_0_0(), "rule__Variable__CommentAlternatives_0_0");
			builder.put(grammarAccess.getRuleAccess().getCommentAlternatives_0_0(), "rule__Rule__CommentAlternatives_0_0");
			builder.put(grammarAccess.getRuleAccess().getAlternatives_4(), "rule__Rule__Alternatives_4");
			builder.put(grammarAccess.getRewriteRuleAccess().getAlternatives_2(), "rule__RewriteRule__Alternatives_2");
			builder.put(grammarAccess.getNotationAccess().getAlternatives(), "rule__Notation__Alternatives");
			builder.put(grammarAccess.getTheoryAccess().getGroup(), "rule__Theory__Group__0");
			builder.put(grammarAccess.getTheoryAccess().getGroup_2(), "rule__Theory__Group_2__0");
			builder.put(grammarAccess.getTheoryAccess().getGroup_3(), "rule__Theory__Group_3__0");
			builder.put(grammarAccess.getTheoryAccess().getGroup_4_0(), "rule__Theory__Group_4_0__0");
			builder.put(grammarAccess.getTheoryAccess().getGroup_4_1(), "rule__Theory__Group_4_1__0");
			builder.put(grammarAccess.getTheoryAccess().getGroup_4_2(), "rule__Theory__Group_4_2__0");
			builder.put(grammarAccess.getTheoryAccess().getGroup_4_3(), "rule__Theory__Group_4_3__0");
			builder.put(grammarAccess.getTheoryAccess().getGroup_4_4(), "rule__Theory__Group_4_4__0");
			builder.put(grammarAccess.getTheoryAccess().getGroup_4_4_1(), "rule__Theory__Group_4_4_1__0");
			builder.put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_2(), "rule__Type__Group_2__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_2_5(), "rule__Type__Group_2_5__0");
			builder.put(grammarAccess.getConstructorAccess().getGroup(), "rule__Constructor__Group__0");
			builder.put(grammarAccess.getConstructorAccess().getGroup_2(), "rule__Constructor__Group_2__0");
			builder.put(grammarAccess.getConstructorAccess().getGroup_2_2(), "rule__Constructor__Group_2_2__0");
			builder.put(grammarAccess.getDestructorAccess().getGroup(), "rule__Destructor__Group__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup(), "rule__Operator__Group__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup_2(), "rule__Operator__Group_2__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup_2_2(), "rule__Operator__Group_2_2__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup_3_0(), "rule__Operator__Group_3_0__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup_3_2(), "rule__Operator__Group_3_2__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup_4(), "rule__Operator__Group_4__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup_5(), "rule__Operator__Group_5__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup_6(), "rule__Operator__Group_6__0");
			builder.put(grammarAccess.getOperatorAccess().getGroup_6_1_1(), "rule__Operator__Group_6_1_1__0");
			builder.put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
			builder.put(grammarAccess.getCaseAccess().getGroup(), "rule__Case__Group__0");
			builder.put(grammarAccess.getAxiomAccess().getGroup(), "rule__Axiom__Group__0");
			builder.put(grammarAccess.getTheoremAccess().getGroup(), "rule__Theorem__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getRewriteRuleAccess().getGroup(), "rule__RewriteRule__Group__0");
			builder.put(grammarAccess.getInferenceRuleAccess().getGroup(), "rule__InferenceRule__Group__0");
			builder.put(grammarAccess.getGivenAccess().getGroup(), "rule__Given__Group__0");
			builder.put(grammarAccess.getConditionalRewriteAccess().getGroup(), "rule__ConditionalRewrite__Group__0");
			builder.put(grammarAccess.getConditionalRewriteRuleAccess().getGroup(), "rule__ConditionalRewriteRule__Group__0");
			builder.put(grammarAccess.getTheoryAccess().getNameAssignment_1(), "rule__Theory__NameAssignment_1");
			builder.put(grammarAccess.getTheoryAccess().getParametersAssignment_2_1(), "rule__Theory__ParametersAssignment_2_1");
			builder.put(grammarAccess.getTheoryAccess().getImportsAssignment_3_1(), "rule__Theory__ImportsAssignment_3_1");
			builder.put(grammarAccess.getTheoryAccess().getImportsAssignment_3_2(), "rule__Theory__ImportsAssignment_3_2");
			builder.put(grammarAccess.getTheoryAccess().getTypesAssignment_4_0_1(), "rule__Theory__TypesAssignment_4_0_1");
			builder.put(grammarAccess.getTheoryAccess().getOperatorsAssignment_4_1_1(), "rule__Theory__OperatorsAssignment_4_1_1");
			builder.put(grammarAccess.getTheoryAccess().getAxiomsAssignment_4_2_1(), "rule__Theory__AxiomsAssignment_4_2_1");
			builder.put(grammarAccess.getTheoryAccess().getTheoremsAssignment_4_3_1(), "rule__Theory__TheoremsAssignment_4_3_1");
			builder.put(grammarAccess.getTheoryAccess().getVariablesAssignment_4_4_1_1(), "rule__Theory__VariablesAssignment_4_4_1_1");
			builder.put(grammarAccess.getTheoryAccess().getRulesAssignment_4_4_2(), "rule__Theory__RulesAssignment_4_4_2");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment(), "rule__Parameter__NameAssignment");
			builder.put(grammarAccess.getTypeAccess().getCommentAssignment_0(), "rule__Type__CommentAssignment_0");
			builder.put(grammarAccess.getTypeAccess().getNameAssignment_1(), "rule__Type__NameAssignment_1");
			builder.put(grammarAccess.getTypeAccess().getParametersAssignment_2_1(), "rule__Type__ParametersAssignment_2_1");
			builder.put(grammarAccess.getTypeAccess().getConstructorsAssignment_2_4(), "rule__Type__ConstructorsAssignment_2_4");
			builder.put(grammarAccess.getTypeAccess().getConstructorsAssignment_2_5_1(), "rule__Type__ConstructorsAssignment_2_5_1");
			builder.put(grammarAccess.getConstructorAccess().getCommentAssignment_0(), "rule__Constructor__CommentAssignment_0");
			builder.put(grammarAccess.getConstructorAccess().getNameAssignment_1(), "rule__Constructor__NameAssignment_1");
			builder.put(grammarAccess.getConstructorAccess().getDestructorsAssignment_2_1(), "rule__Constructor__DestructorsAssignment_2_1");
			builder.put(grammarAccess.getConstructorAccess().getDestructorsAssignment_2_2_1(), "rule__Constructor__DestructorsAssignment_2_2_1");
			builder.put(grammarAccess.getDestructorAccess().getCommentAssignment_0(), "rule__Destructor__CommentAssignment_0");
			builder.put(grammarAccess.getDestructorAccess().getNameAssignment_1(), "rule__Destructor__NameAssignment_1");
			builder.put(grammarAccess.getDestructorAccess().getTypeAssignment_3(), "rule__Destructor__TypeAssignment_3");
			builder.put(grammarAccess.getOperatorAccess().getCommentAssignment_0(), "rule__Operator__CommentAssignment_0");
			builder.put(grammarAccess.getOperatorAccess().getNameAssignment_1(), "rule__Operator__NameAssignment_1");
			builder.put(grammarAccess.getOperatorAccess().getArgumentsAssignment_2_1(), "rule__Operator__ArgumentsAssignment_2_1");
			builder.put(grammarAccess.getOperatorAccess().getArgumentsAssignment_2_2_1(), "rule__Operator__ArgumentsAssignment_2_2_1");
			builder.put(grammarAccess.getOperatorAccess().getTypeAssignment_3_0_1(), "rule__Operator__TypeAssignment_3_0_1");
			builder.put(grammarAccess.getOperatorAccess().getNotationAssignment_3_1(), "rule__Operator__NotationAssignment_3_1");
			builder.put(grammarAccess.getOperatorAccess().getAssociativeAssignment_3_2_0(), "rule__Operator__AssociativeAssignment_3_2_0");
			builder.put(grammarAccess.getOperatorAccess().getCommutativeAssignment_3_2_1(), "rule__Operator__CommutativeAssignment_3_2_1");
			builder.put(grammarAccess.getOperatorAccess().getPrecedentAssignment_4_1(), "rule__Operator__PrecedentAssignment_4_1");
			builder.put(grammarAccess.getOperatorAccess().getWdAssignment_5_1(), "rule__Operator__WdAssignment_5_1");
			builder.put(grammarAccess.getOperatorAccess().getDefinitionAssignment_6_1_0(), "rule__Operator__DefinitionAssignment_6_1_0");
			builder.put(grammarAccess.getOperatorAccess().getCaseAssignment_6_1_1_1(), "rule__Operator__CaseAssignment_6_1_1_1");
			builder.put(grammarAccess.getOperatorAccess().getCasesAssignment_6_1_1_2(), "rule__Operator__CasesAssignment_6_1_1_2");
			builder.put(grammarAccess.getArgumentAccess().getCommentAssignment_0(), "rule__Argument__CommentAssignment_0");
			builder.put(grammarAccess.getArgumentAccess().getNameAssignment_1(), "rule__Argument__NameAssignment_1");
			builder.put(grammarAccess.getArgumentAccess().getTypeAssignment_3(), "rule__Argument__TypeAssignment_3");
			builder.put(grammarAccess.getCaseAccess().getPatternAssignment_0(), "rule__Case__PatternAssignment_0");
			builder.put(grammarAccess.getCaseAccess().getFormulaAssignment_2(), "rule__Case__FormulaAssignment_2");
			builder.put(grammarAccess.getAxiomAccess().getCommentAssignment_0(), "rule__Axiom__CommentAssignment_0");
			builder.put(grammarAccess.getAxiomAccess().getNameAssignment_2(), "rule__Axiom__NameAssignment_2");
			builder.put(grammarAccess.getAxiomAccess().getPredicateAssignment_4(), "rule__Axiom__PredicateAssignment_4");
			builder.put(grammarAccess.getTheoremAccess().getCommentAssignment_0(), "rule__Theorem__CommentAssignment_0");
			builder.put(grammarAccess.getTheoremAccess().getNameAssignment_2(), "rule__Theorem__NameAssignment_2");
			builder.put(grammarAccess.getTheoremAccess().getPredicateAssignment_4(), "rule__Theorem__PredicateAssignment_4");
			builder.put(grammarAccess.getVariableAccess().getCommentAssignment_0(), "rule__Variable__CommentAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
			builder.put(grammarAccess.getVariableAccess().getTypeAssignment_3(), "rule__Variable__TypeAssignment_3");
			builder.put(grammarAccess.getRuleAccess().getCommentAssignment_0(), "rule__Rule__CommentAssignment_0");
			builder.put(grammarAccess.getRuleAccess().getNameAssignment_2(), "rule__Rule__NameAssignment_2");
			builder.put(grammarAccess.getRuleAccess().getRruleAssignment_4_0(), "rule__Rule__RruleAssignment_4_0");
			builder.put(grammarAccess.getRuleAccess().getIruleAssignment_4_1(), "rule__Rule__IruleAssignment_4_1");
			builder.put(grammarAccess.getRewriteRuleAccess().getPatternAssignment_0(), "rule__RewriteRule__PatternAssignment_0");
			builder.put(grammarAccess.getRewriteRuleAccess().getUruleAssignment_2_0(), "rule__RewriteRule__UruleAssignment_2_0");
			builder.put(grammarAccess.getRewriteRuleAccess().getCruleAssignment_2_1(), "rule__RewriteRule__CruleAssignment_2_1");
			builder.put(grammarAccess.getInferenceRuleAccess().getGivenAssignment_0(), "rule__InferenceRule__GivenAssignment_0");
			builder.put(grammarAccess.getInferenceRuleAccess().getInferAssignment_2(), "rule__InferenceRule__InferAssignment_2");
			builder.put(grammarAccess.getGivenAccess().getExpressionAssignment_0(), "rule__Given__ExpressionAssignment_0");
			builder.put(grammarAccess.getGivenAccess().getRequiredAssignment_1(), "rule__Given__RequiredAssignment_1");
			builder.put(grammarAccess.getInferAccess().getExpressionAssignment(), "rule__Infer__ExpressionAssignment");
			builder.put(grammarAccess.getUnconditionalRewriteAccess().getRhsAssignment(), "rule__UnconditionalRewrite__RhsAssignment");
			builder.put(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_0(), "rule__ConditionalRewrite__RewritesAssignment_0");
			builder.put(grammarAccess.getConditionalRewriteAccess().getRewritesAssignment_1(), "rule__ConditionalRewrite__RewritesAssignment_1");
			builder.put(grammarAccess.getConditionalRewriteRuleAccess().getLhsAssignment_0(), "rule__ConditionalRewriteRule__LhsAssignment_0");
			builder.put(grammarAccess.getConditionalRewriteRuleAccess().getRhsAssignment_2(), "rule__ConditionalRewriteRule__RhsAssignment_2");
			builder.put(grammarAccess.getOperatorAccess().getUnorderedGroup_3(), "rule__Operator__UnorderedGroup_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TheoryGrammarAccess grammarAccess;

	@Override
	protected InternalTheoryParser createParser() {
		InternalTheoryParser result = new InternalTheoryParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS" };
	}

	public TheoryGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TheoryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}