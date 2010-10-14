//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\adapter\\TeaBall.java

//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\adapter\\TeaBall.java

package br.gov.fnde.designpatterns.structuralpatterns.adapter;


public class TeaBall extends TeaBag {
    LooseLeafTea looseLeafTea;
    
    /**
     * @roseuid 418A6C8D0261
     */
    public TeaBall() {
     
    }
    
    /**
     * @param looseLeafTeaIn
     * @roseuid 418A6B58004E
     */
    public TeaBall(LooseLeafTea looseLeafTeaIn) {
       looseLeafTea = looseLeafTeaIn;
       teaBagIsSteeped = looseLeafTea.teaIsSteeped;     
    }
    
    /**
     * @roseuid 418A6CFF01A5
     */
    public void steepTeaInCup() {
       looseLeafTea.steepTea();
       teaBagIsSteeped = true;     
    }
}
