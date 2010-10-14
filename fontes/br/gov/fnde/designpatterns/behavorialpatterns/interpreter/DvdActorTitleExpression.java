//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\interpreter\\DvdActorTitleExpression.java

package br.gov.fnde.designpatterns.behavorialpatterns.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdActorTitleExpression extends DvdAbstractExpression {
    String title;
    
    /**
     * @param title
     * @roseuid 418AAFB002BE
     */
    public DvdActorTitleExpression(String title) {this.title = title;     
    }
    
    /**
     * @param dvdInterpreterContext
     * @return java.lang.String
     * @roseuid 418AAFB003D7
     */
    public String interpret(DvdInterpreterContext dvdInterpreterContext) {
       ArrayList actorsAndTitles = dvdInterpreterContext.getActorsForTitle(title);
       ListIterator actorsAndTitlesIterator = actorsAndTitles.listIterator();
       StringBuffer actorBuffer = new StringBuffer("");
       boolean first = true;
       while (actorsAndTitlesIterator.hasNext())
       {
           if (!first) {actorBuffer.append(", ");}
           else {first = false;}
           actorBuffer.append((String)actorsAndTitlesIterator.next());
       }
       return actorBuffer.toString();     
    }
}
