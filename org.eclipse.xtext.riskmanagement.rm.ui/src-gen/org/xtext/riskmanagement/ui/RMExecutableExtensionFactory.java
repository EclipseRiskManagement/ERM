/*
 * generated by Xtext 2.16.0
 */
package org.xtext.riskmanagement.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.riskmanagement.rm.ui.internal.RmActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RMExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(RmActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		RmActivator activator = RmActivator.getInstance();
		return activator != null ? activator.getInjector(RmActivator.ORG_XTEXT_RISKMANAGEMENT_RM) : null;
	}

}
