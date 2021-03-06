/*
 * generated by Xtext 2.16.0
 */
package org.xtext.riskmanagement.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.riskmanagement.ide.contentassist.antlr.internal.InternalRMParser;
import org.xtext.riskmanagement.services.RMGrammarAccess;

public class RMParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RMGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RMGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getRiskAccess().getAlternatives(), "rule__Risk__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getViewAccess().getAlternatives(), "rule__View__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getAssetBasedModelAccess().getGroup(), "rule__AssetBasedModel__Group__0");
			builder.put(grammarAccess.getScenarioBasedModelAccess().getGroup(), "rule__ScenarioBasedModel__Group__0");
			builder.put(grammarAccess.getScenarioBasedModelAccess().getGroup_6(), "rule__ScenarioBasedModel__Group_6__0");
			builder.put(grammarAccess.getAssetAccess().getGroup(), "rule__Asset__Group__0");
			builder.put(grammarAccess.getAssetAccess().getGroup_6(), "rule__Asset__Group_6__0");
			builder.put(grammarAccess.getAssetAccess().getGroup_8(), "rule__Asset__Group_8__0");
			builder.put(grammarAccess.getAssetAccess().getGroup_8_3(), "rule__Asset__Group_8_3__0");
			builder.put(grammarAccess.getVulnerableAccess().getGroup(), "rule__Vulnerable__Group__0");
			builder.put(grammarAccess.getVulnerableAccess().getGroup_6(), "rule__Vulnerable__Group_6__0");
			builder.put(grammarAccess.getRisk_ImplAccess().getGroup(), "rule__Risk_Impl__Group__0");
			builder.put(grammarAccess.getRisk_ImplAccess().getGroup_12(), "rule__Risk_Impl__Group_12__0");
			builder.put(grammarAccess.getConsequenceAccess().getGroup(), "rule__Consequence__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getOpportunityAccess().getGroup(), "rule__Opportunity__Group__0");
			builder.put(grammarAccess.getOpportunityAccess().getGroup_12(), "rule__Opportunity__Group_12__0");
			builder.put(grammarAccess.getUncertaintyAccess().getGroup(), "rule__Uncertainty__Group__0");
			builder.put(grammarAccess.getUncertaintyAccess().getGroup_12(), "rule__Uncertainty__Group_12__0");
			builder.put(grammarAccess.getThreatAccess().getGroup(), "rule__Threat__Group__0");
			builder.put(grammarAccess.getThreatAccess().getGroup_12(), "rule__Threat__Group_12__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup_3(), "rule__Scenario__Group_3__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup_3_3(), "rule__Scenario__Group_3_3__0");
			builder.put(grammarAccess.getScenarioAccess().getGroup_7(), "rule__Scenario__Group_7__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup_4(), "rule__Action__Group_4__0");
			builder.put(grammarAccess.getActionAccess().getGroup_4_3(), "rule__Action__Group_4_3__0");
			builder.put(grammarAccess.getModelAccess().getNameAssignment_2(), "rule__Model__NameAssignment_2");
			builder.put(grammarAccess.getAssetBasedModelAccess().getNameAssignment_1(), "rule__AssetBasedModel__NameAssignment_1");
			builder.put(grammarAccess.getAssetBasedModelAccess().getAssetAssignment_4(), "rule__AssetBasedModel__AssetAssignment_4");
			builder.put(grammarAccess.getScenarioBasedModelAccess().getNameAssignment_1(), "rule__ScenarioBasedModel__NameAssignment_1");
			builder.put(grammarAccess.getScenarioBasedModelAccess().getScenarioAssignment_5(), "rule__ScenarioBasedModel__ScenarioAssignment_5");
			builder.put(grammarAccess.getScenarioBasedModelAccess().getScenarioAssignment_6_1(), "rule__ScenarioBasedModel__ScenarioAssignment_6_1");
			builder.put(grammarAccess.getAssetAccess().getNameAssignment_1(), "rule__Asset__NameAssignment_1");
			builder.put(grammarAccess.getAssetAccess().getHasAssignment_5(), "rule__Asset__HasAssignment_5");
			builder.put(grammarAccess.getAssetAccess().getHasAssignment_6_1(), "rule__Asset__HasAssignment_6_1");
			builder.put(grammarAccess.getAssetAccess().getCausesAssignment_8_2(), "rule__Asset__CausesAssignment_8_2");
			builder.put(grammarAccess.getAssetAccess().getCausesAssignment_8_3_1(), "rule__Asset__CausesAssignment_8_3_1");
			builder.put(grammarAccess.getVulnerableAccess().getNameAssignment_1(), "rule__Vulnerable__NameAssignment_1");
			builder.put(grammarAccess.getVulnerableAccess().getIndicatesAssignment_5(), "rule__Vulnerable__IndicatesAssignment_5");
			builder.put(grammarAccess.getVulnerableAccess().getIndicatesAssignment_6_1(), "rule__Vulnerable__IndicatesAssignment_6_1");
			builder.put(grammarAccess.getRisk_ImplAccess().getNameAssignment_1(), "rule__Risk_Impl__NameAssignment_1");
			builder.put(grammarAccess.getRisk_ImplAccess().getViewAssignment_4(), "rule__Risk_Impl__ViewAssignment_4");
			builder.put(grammarAccess.getRisk_ImplAccess().getOccurrenceAssignment_6(), "rule__Risk_Impl__OccurrenceAssignment_6");
			builder.put(grammarAccess.getRisk_ImplAccess().getImpactAssignment_8(), "rule__Risk_Impl__ImpactAssignment_8");
			builder.put(grammarAccess.getRisk_ImplAccess().getProducesAssignment_11(), "rule__Risk_Impl__ProducesAssignment_11");
			builder.put(grammarAccess.getRisk_ImplAccess().getProducesAssignment_12_1(), "rule__Risk_Impl__ProducesAssignment_12_1");
			builder.put(grammarAccess.getConsequenceAccess().getNameAssignment_2(), "rule__Consequence__NameAssignment_2");
			builder.put(grammarAccess.getOpportunityAccess().getNameAssignment_1(), "rule__Opportunity__NameAssignment_1");
			builder.put(grammarAccess.getOpportunityAccess().getViewAssignment_4(), "rule__Opportunity__ViewAssignment_4");
			builder.put(grammarAccess.getOpportunityAccess().getOccurrenceAssignment_6(), "rule__Opportunity__OccurrenceAssignment_6");
			builder.put(grammarAccess.getOpportunityAccess().getImpactAssignment_8(), "rule__Opportunity__ImpactAssignment_8");
			builder.put(grammarAccess.getOpportunityAccess().getProducesAssignment_11(), "rule__Opportunity__ProducesAssignment_11");
			builder.put(grammarAccess.getOpportunityAccess().getProducesAssignment_12_1(), "rule__Opportunity__ProducesAssignment_12_1");
			builder.put(grammarAccess.getUncertaintyAccess().getNameAssignment_1(), "rule__Uncertainty__NameAssignment_1");
			builder.put(grammarAccess.getUncertaintyAccess().getViewAssignment_4(), "rule__Uncertainty__ViewAssignment_4");
			builder.put(grammarAccess.getUncertaintyAccess().getOccurrenceAssignment_6(), "rule__Uncertainty__OccurrenceAssignment_6");
			builder.put(grammarAccess.getUncertaintyAccess().getImpactAssignment_8(), "rule__Uncertainty__ImpactAssignment_8");
			builder.put(grammarAccess.getUncertaintyAccess().getProducesAssignment_11(), "rule__Uncertainty__ProducesAssignment_11");
			builder.put(grammarAccess.getUncertaintyAccess().getProducesAssignment_12_1(), "rule__Uncertainty__ProducesAssignment_12_1");
			builder.put(grammarAccess.getThreatAccess().getNameAssignment_1(), "rule__Threat__NameAssignment_1");
			builder.put(grammarAccess.getThreatAccess().getViewAssignment_4(), "rule__Threat__ViewAssignment_4");
			builder.put(grammarAccess.getThreatAccess().getOccurrenceAssignment_6(), "rule__Threat__OccurrenceAssignment_6");
			builder.put(grammarAccess.getThreatAccess().getImpactAssignment_8(), "rule__Threat__ImpactAssignment_8");
			builder.put(grammarAccess.getThreatAccess().getProducesAssignment_11(), "rule__Threat__ProducesAssignment_11");
			builder.put(grammarAccess.getThreatAccess().getProducesAssignment_12_1(), "rule__Threat__ProducesAssignment_12_1");
			builder.put(grammarAccess.getScenarioAccess().getNameAssignment_1(), "rule__Scenario__NameAssignment_1");
			builder.put(grammarAccess.getScenarioAccess().getSubscenarioAssignment_3_2(), "rule__Scenario__SubscenarioAssignment_3_2");
			builder.put(grammarAccess.getScenarioAccess().getSubscenarioAssignment_3_3_1(), "rule__Scenario__SubscenarioAssignment_3_3_1");
			builder.put(grammarAccess.getScenarioAccess().getActionAssignment_6(), "rule__Scenario__ActionAssignment_6");
			builder.put(grammarAccess.getScenarioAccess().getActionAssignment_7_1(), "rule__Scenario__ActionAssignment_7_1");
			builder.put(grammarAccess.getActionAccess().getNameAssignment_2(), "rule__Action__NameAssignment_2");
			builder.put(grammarAccess.getActionAccess().getAssetAssignment_4_2(), "rule__Action__AssetAssignment_4_2");
			builder.put(grammarAccess.getActionAccess().getAssetAssignment_4_3_1(), "rule__Action__AssetAssignment_4_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RMGrammarAccess grammarAccess;

	@Override
	protected InternalRMParser createParser() {
		InternalRMParser result = new InternalRMParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RMGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
