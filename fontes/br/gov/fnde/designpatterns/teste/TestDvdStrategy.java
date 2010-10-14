//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestDvdStrategy.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.behavorialpatterns.strategy.DvdNameContext;

/**
 * An object controls which of a family of methods is called. Each method is in 
 * its' own class that extends a common base class.
 */
public class TestDvdStrategy {
    
    /**
     * @param args
     * @roseuid 418BAC69021E
     */
    public static void main(String[] args) {
       DvdNameContext allCapContext = new DvdNameContext('C');
       DvdNameContext theEndContext = new DvdNameContext('E');
       DvdNameContext spacesContext = new DvdNameContext('S');       
       
       String dvdNames[] = new String[3];
       dvdNames[0] = "Jay and Silent Bob Strike Back";
       dvdNames[1] = "The Fast and the Furious";
       dvdNames[2] = "The Others";
       
       char replaceChar = '*';       
       
       System.out.println("Testing formatting with all caps");
       String[] dvdCapNames = allCapContext.formatDvdNames(dvdNames);
       
       System.out.println(" ");         
       System.out.println("Testing formatting with beginning the at end");
       String[] dvdEndNames = theEndContext.formatDvdNames(dvdNames);     
       
       System.out.println(" ");       
       System.out.println("Testing formatting with all spaces replaced with " + replaceChar);
       String[] dvdSpcNames = spacesContext.formatDvdNames(dvdNames, replaceChar);     
    }
}
