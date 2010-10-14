//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestTeaBagAdapter.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.structuralpatterns.adapter.LooseLeafTea;
import br.gov.fnde.designpatterns.structuralpatterns.adapter.TeaBag;
import br.gov.fnde.designpatterns.structuralpatterns.adapter.TeaBall;
import br.gov.fnde.designpatterns.structuralpatterns.adapter.TeaCup;

/**
 * A class extends another class and takes in an object, and makes the taken 
 * object behave like the extended class. 
 * 
 * Notes:
 * 
 * The basic premise of the adapter is that you either can not or do not want to 
 * change the adaptee. This might be because you purchased the adaptee, and do not 
 * have the source code. 
 * 
 * There are two GoF versions of the adapter. 
 * 
 * The First is the inheriting version, in which the adapter inherits from both 
 * "the adaptee" and "the class that adapter will make the adaptee adapt to". 
 * 
 * The Second is the object version, which is shown here. 
 * 
 * Reference Desgin Patterns pages 139-141.
 */
public class TestTeaBagAdapter {
    
    /**
     * @roseuid 418A6B5702CE
     */
    public TestTeaBagAdapter() {
     
    }
    
    /**
     * @param args
     * @roseuid 418A6DCC0148
     */
    public static void main(String[] args) {
       TeaCup teaCup = new TeaCup();
       
       System.out.println("Steeping tea bag");
       TeaBag teaBag = new TeaBag();       
       teaCup.steepTeaBag(teaBag);
       
       System.out.println("Steeping loose leaf tea");
       LooseLeafTea looseLeafTea = new LooseLeafTea();
       TeaBall teaBall = new TeaBall(looseLeafTea);
       teaCup.steepTeaBag(teaBall);     
    }
}
