/*
 * generated by Xtext 2.15.0
 */
package org.unipampa.lesse


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class XCanopusStandaloneSetup extends XCanopusStandaloneSetupGenerated {

	def static void doSetup() {
		new XCanopusStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
