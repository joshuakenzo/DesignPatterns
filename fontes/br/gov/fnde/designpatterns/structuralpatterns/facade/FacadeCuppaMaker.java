//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\facade\\FacadeCuppaMaker.java

package br.gov.fnde.designpatterns.structuralpatterns.facade;


public class FacadeCuppaMaker {
    boolean teaBagIsSteeped;
    
    /**
     * @roseuid 418A86FA0399
     */
    public FacadeCuppaMaker() {
       System.out.println("FacadeCuppaMaker ready to make you a cuppa!");     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.structuralpatterns.facade.FacadeTeaCup
     * @roseuid 418A879C004E
     */
    public FacadeTeaCup makeACuppa() {
       FacadeTeaCup cup = new FacadeTeaCup();
       FacadeTeaBag teaBag = new FacadeTeaBag();
       FacadeWater water = new FacadeWater();
       cup.addFacadeTeaBag(teaBag);
       water.boilFacadeWater();
       cup.addFacadeWater(water);
       cup.steepTeaBag();
       return cup;     
    }
}
