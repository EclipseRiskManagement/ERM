/*
 * generated by Xtext 2.16.0
 */
package org.xtext.riskmanagement.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.riskmanagement.rm.ui.internal.RmActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class RMUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RmActivator.getInstance().getInjector("org.xtext.riskmanagement.RM");
	}

}
