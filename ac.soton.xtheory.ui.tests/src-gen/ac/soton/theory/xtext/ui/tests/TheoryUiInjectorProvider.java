/*
 * generated by Xtext 2.14.0
 */
package ac.soton.theory.xtext.ui.tests;

import ac.soton.xtheory.ui.internal.XtheoryActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class TheoryUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtheoryActivator.getInstance().getInjector("ac.soton.theory.xtext.Theory");
	}

}
