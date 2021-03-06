/*
 * generated by Xtext 2.16.0
 */
package org.xtext.riskmanagement.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.model.riskmanagement.Asset;
import org.eclipse.model.riskmanagement.AssetBasedModel;
import org.eclipse.model.riskmanagement.Consequence;
import org.eclipse.model.riskmanagement.Model;
import org.eclipse.model.riskmanagement.Opportunity;
import org.eclipse.model.riskmanagement.Risk;
import org.eclipse.model.riskmanagement.RiskmanagementPackage;
import org.eclipse.model.riskmanagement.Scenario;
import org.eclipse.model.riskmanagement.ScenarioBasedModel;
import org.eclipse.model.riskmanagement.Threat;
import org.eclipse.model.riskmanagement.Uncertainty;
import org.eclipse.model.riskmanagement.Vulnerable;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.riskmanagement.services.RMGrammarAccess;

@SuppressWarnings("all")
public class RMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RMGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RiskmanagementPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RiskmanagementPackage.ACTION:
				sequence_Action(context, (org.eclipse.model.riskmanagement.Action) semanticObject); 
				return; 
			case RiskmanagementPackage.ASSET:
				sequence_Asset(context, (Asset) semanticObject); 
				return; 
			case RiskmanagementPackage.ASSET_BASED_MODEL:
				sequence_AssetBasedModel(context, (AssetBasedModel) semanticObject); 
				return; 
			case RiskmanagementPackage.CONSEQUENCE:
				sequence_Consequence(context, (Consequence) semanticObject); 
				return; 
			case RiskmanagementPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RiskmanagementPackage.OPPORTUNITY:
				sequence_Opportunity(context, (Opportunity) semanticObject); 
				return; 
			case RiskmanagementPackage.RISK:
				sequence_Risk_Impl(context, (Risk) semanticObject); 
				return; 
			case RiskmanagementPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case RiskmanagementPackage.SCENARIO_BASED_MODEL:
				sequence_ScenarioBasedModel(context, (ScenarioBasedModel) semanticObject); 
				return; 
			case RiskmanagementPackage.THREAT:
				sequence_Threat(context, (Threat) semanticObject); 
				return; 
			case RiskmanagementPackage.UNCERTAINTY:
				sequence_Uncertainty(context, (Uncertainty) semanticObject); 
				return; 
			case RiskmanagementPackage.VULNERABLE:
				sequence_Vulnerable(context, (Vulnerable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (name=EString (asset+=Asset asset+=Asset*)?)
	 */
	protected void sequence_Action(ISerializationContext context, org.eclipse.model.riskmanagement.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AssetBasedModel returns AssetBasedModel
	 *
	 * Constraint:
	 *     (name=EString asset=Asset)
	 */
	protected void sequence_AssetBasedModel(ISerializationContext context, AssetBasedModel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RiskmanagementPackage.Literals.MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RiskmanagementPackage.Literals.MODEL__NAME));
			if (transientValues.isValueTransient(semanticObject, RiskmanagementPackage.Literals.ASSET_BASED_MODEL__ASSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RiskmanagementPackage.Literals.ASSET_BASED_MODEL__ASSET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssetBasedModelAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssetBasedModelAccess().getAssetAssetParserRuleCall_4_0(), semanticObject.getAsset());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Asset returns Asset
	 *
	 * Constraint:
	 *     (name=EString has+=[Vulnerable|EString] has+=[Vulnerable|EString]* (causes+=Risk causes+=Risk*)?)
	 */
	protected void sequence_Asset(ISerializationContext context, Asset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Consequence returns Consequence
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Consequence(ISerializationContext context, Consequence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RiskmanagementPackage.Literals.CONSEQUENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RiskmanagementPackage.Literals.CONSEQUENCE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConsequenceAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RiskmanagementPackage.Literals.MODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RiskmanagementPackage.Literals.MODEL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Risk returns Opportunity
	 *     Opportunity returns Opportunity
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         view=View 
	 *         occurrence=EInt 
	 *         impact=EInt 
	 *         produces+=Consequence 
	 *         produces+=Consequence*
	 *     )
	 */
	protected void sequence_Opportunity(ISerializationContext context, Opportunity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Risk returns Risk
	 *     Risk_Impl returns Risk
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         view=View 
	 *         occurrence=EInt 
	 *         impact=EInt 
	 *         produces+=Consequence 
	 *         produces+=Consequence*
	 *     )
	 */
	protected void sequence_Risk_Impl(ISerializationContext context, Risk semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ScenarioBasedModel returns ScenarioBasedModel
	 *
	 * Constraint:
	 *     (name=EString scenario+=Scenario scenario+=Scenario*)
	 */
	protected void sequence_ScenarioBasedModel(ISerializationContext context, ScenarioBasedModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scenario returns Scenario
	 *
	 * Constraint:
	 *     (name=EString (subscenario+=Scenario subscenario+=Scenario*)? action+=Action action+=Action*)
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Risk returns Threat
	 *     Threat returns Threat
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         view=View 
	 *         occurrence=EInt 
	 *         impact=EInt 
	 *         produces+=Consequence 
	 *         produces+=Consequence*
	 *     )
	 */
	protected void sequence_Threat(ISerializationContext context, Threat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Risk returns Uncertainty
	 *     Uncertainty returns Uncertainty
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         view=View 
	 *         occurrence=EInt 
	 *         impact=EInt 
	 *         produces+=Consequence 
	 *         produces+=Consequence*
	 *     )
	 */
	protected void sequence_Uncertainty(ISerializationContext context, Uncertainty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Vulnerable returns Vulnerable
	 *
	 * Constraint:
	 *     (name=EString indicates+=[Consequence|EString] indicates+=[Consequence|EString]*)
	 */
	protected void sequence_Vulnerable(ISerializationContext context, Vulnerable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
