//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\adapter\\TeaBag.java

//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\adapter\\TeaBag.java

package br.gov.fnde.designpatterns.structuralpatterns.adapter;


public class TeaBag {
    boolean teaBagIsSteeped;
    
    /**
     * @roseuid 418A6B5703C8
     */
    public TeaBag() {
      teaBagIsSteeped = false;     
    }
    
    /**
     * @roseuid 418A6C2500AB
     */
    public void steepTeaInCup() {
       teaBagIsSteeped = true;
       System.out.println("tea bag is steeping in cup");     
    }
}
