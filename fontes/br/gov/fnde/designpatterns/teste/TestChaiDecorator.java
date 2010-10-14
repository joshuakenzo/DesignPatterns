//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestChaiDecorator.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.structuralpatterns.decorator.ChaiDecorator;
import br.gov.fnde.designpatterns.structuralpatterns.decorator.Tea;
import br.gov.fnde.designpatterns.structuralpatterns.decorator.TeaLeaves;

/**
 * One class takes in another class, both of which extend the same abstract class, 
 * and adds functionality.
 */
public class TestChaiDecorator {
    
    /**
     * @param args
     * @roseuid 418A85270251
     */
    public static void main(String[] args) {
       Tea teaLeaves = new TeaLeaves();       
       Tea chaiDecorator = new ChaiDecorator(teaLeaves);
       chaiDecorator.steepTea();     
    }
}
