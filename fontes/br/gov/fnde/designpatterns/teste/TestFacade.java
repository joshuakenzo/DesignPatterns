//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestFacade.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.structuralpatterns.facade.FacadeCuppaMaker;
import br.gov.fnde.designpatterns.structuralpatterns.facade.FacadeTeaBag;
import br.gov.fnde.designpatterns.structuralpatterns.facade.FacadeTeaCup;
import br.gov.fnde.designpatterns.structuralpatterns.facade.FacadeWater;

/**
 * One class has a method that performs a complex process calling several other 
 * classes.
 */
public class TestFacade {
    
    /**
     * @param args
     * @roseuid 418A88C5033C
     */
    public static void main(String[] args) {
       FacadeCuppaMaker cuppaMaker = new FacadeCuppaMaker();
       FacadeTeaCup teaCup = cuppaMaker.makeACuppa(); 
       System.out.println(teaCup);     
    }
}
