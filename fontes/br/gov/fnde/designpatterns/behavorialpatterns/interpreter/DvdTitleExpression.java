//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\interpreter\\DvdTitleExpression.java

package br.gov.fnde.designpatterns.behavorialpatterns.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdTitleExpression extends DvdAbstractExpression {
    
    /**
     * @param dvdInterpreterContext
     * @return java.lang.String
     * @roseuid 418AAFEC0128
     */
    public String interpret(DvdInterpreterContext dvdInterpreterContext) {
       ArrayList titles = dvdInterpreterContext.getAllTitles();
       ListIterator titlesIterator = titles.listIterator();
       StringBuffer titleBuffer = new StringBuffer("");
       boolean first = true;
       while (titlesIterator.hasNext())
       {
           if (!first) {titleBuffer.append(", ");}
           else {first = false;}
               
           titleBuffer.append((String)titlesIterator.next());
       }
       return titleBuffer.toString();     
    }
}
