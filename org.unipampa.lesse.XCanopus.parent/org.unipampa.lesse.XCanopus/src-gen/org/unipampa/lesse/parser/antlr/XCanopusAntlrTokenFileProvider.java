/*
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XCanopusAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/unipampa/lesse/parser/antlr/internal/InternalXCanopus.tokens");
	}
}
