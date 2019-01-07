/*
 * generated by Xtext 2.16.0
 */
package org.unipampa.lesse.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.unipampa.lesse.parser.antlr.internal.InternalXCanopusParser;
import org.unipampa.lesse.services.XCanopusGrammarAccess;

public class XCanopusParser extends AbstractAntlrParser {

	@Inject
	private XCanopusGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalXCanopusParser createParser(XtextTokenStream stream) {
		return new InternalXCanopusParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public XCanopusGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XCanopusGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
