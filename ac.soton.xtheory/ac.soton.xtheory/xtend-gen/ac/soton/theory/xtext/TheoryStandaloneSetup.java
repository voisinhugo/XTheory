/**
 * generated by Xtext 2.14.0
 */
package ac.soton.theory.xtext;

import ac.soton.theory.xtext.TheoryStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TheoryStandaloneSetup extends TheoryStandaloneSetupGenerated {
  public static void doSetup() {
    new TheoryStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
