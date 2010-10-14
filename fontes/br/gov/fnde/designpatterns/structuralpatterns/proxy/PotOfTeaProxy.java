//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\proxy\\PotOfTeaProxy.java

package br.gov.fnde.designpatterns.structuralpatterns.proxy;


public class PotOfTeaProxy implements PotOfTeaInterface {
    PotOfTea potOfTea;
    
    /**
     * @roseuid 418A8FC000AB
     */
    public PotOfTeaProxy() {
     
    }
    
    /**
     * @roseuid 418A90E1030D
     */
    public void pourTea() {
       potOfTea = new PotOfTea();
       potOfTea.pourTea();     
    }
}
