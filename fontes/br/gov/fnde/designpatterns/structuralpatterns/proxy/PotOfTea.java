//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\proxy\\PotOfTea.java

package br.gov.fnde.designpatterns.structuralpatterns.proxy;


public class PotOfTea implements PotOfTeaInterface {
    
    /**
     * @roseuid 418A8FBF034B
     */
    public PotOfTea() {
       System.out.println("Making a pot of tea");     
    }
    
    /**
     * @roseuid 418A90E002EE
     */
    public void pourTea() {
       System.out.println("Pouring tea");     
    }
}
