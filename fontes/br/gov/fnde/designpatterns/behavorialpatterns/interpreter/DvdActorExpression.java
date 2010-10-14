//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\interpreter\\DvdActorExpression.java

package br.gov.fnde.designpatterns.behavorialpatterns.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdActorExpression extends DvdAbstractExpression {
    
    /**
     * @param dvdInterpreterContext
     * @return java.lang.String
     * @roseuid 418AAF7C028F
     */
    public String interpret(DvdInterpreterContext dvdInterpreterContext) {
       ArrayList actors = dvdInterpreterContext.getAllActors();
       ListIterator actorsIterator = actors.listIterator();
       StringBuffer titleBuffer = new StringBuffer("");
       boolean first = true;
       while (actorsIterator.hasNext())
       {
           if (!first) {titleBuffer.append(", ");}
           else {first = false;}
               
           titleBuffer.append((String)actorsIterator.next());
       }
       return titleBuffer.toString();     
    }
}
