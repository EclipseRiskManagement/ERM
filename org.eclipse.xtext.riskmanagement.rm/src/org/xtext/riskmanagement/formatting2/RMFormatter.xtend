/*
 * generated by Xtext 2.16.0
 */
package org.xtext.riskmanagement.formatting2

import com.google.inject.Inject
import org.eclipse.model.riskmanagement.AssetBasedModel
import org.eclipse.model.riskmanagement.ScenarioBasedModel
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.riskmanagement.services.RMGrammarAccess

class RMFormatter extends AbstractFormatter2 {
	
	@Inject extension RMGrammarAccess

	def dispatch void format(AssetBasedModel assetBasedModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		assetBasedModel.asset.format
	}

	def dispatch void format(ScenarioBasedModel scenarioBasedModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (scenario : scenarioBasedModel.scenario) {
			scenario.format
		}
	}
	
	// TODO: implement for Asset, Risk, Opportunity, Uncertainty, Threat, Scenario, Action
}
