//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\interpreter\\DvdTitleActorExpression.java

package br.gov.fnde.designpatterns.behavorialpatterns.interpreter;

import java.util.ListIterator;
import java.util.ArrayList;

public class DvdTitleActorExpression extends DvdAbstractExpression {
    String title;
    
    /**
     * @param title
     * @roseuid 418AB0160186
     */
    public DvdTitleActorExpression(String title) {this.title = title;     
    }
    
    /**
     * @param dvdInterpreterContext
     * @return java.lang.String
     * @roseuid 418AB01602DD
     */
    public String interpret(DvdInterpreterContext dvdInterpreterContext) {
       ArrayList titlesAndActors = dvdInterpreterContext.getTitlesForActor(title);
       ListIterator titlesAndActorsIterator = titlesAndActors.listIterator();
       StringBuffer titleBuffer = new StringBuffer("");
       boolean first = true;
       while (titlesAndActorsIterator.hasNext())
       {
           if (!first) {titleBuffer.append(", ");}
           else {first = false;}
           titleBuffer.append((String)titlesAndActorsIterator.next());
       }
       return titleBuffer.toString();     
    }
}
