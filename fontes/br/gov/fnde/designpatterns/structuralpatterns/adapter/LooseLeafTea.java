//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\adapter\\LooseLeafTea.java

//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\adapter\\LooseLeafTea.java

package br.gov.fnde.designpatterns.structuralpatterns.adapter;


public class LooseLeafTea {
    boolean teaIsSteeped;
    
    /**
     * @roseuid 418A6B57034B
     */
    public LooseLeafTea() {
       teaIsSteeped = false;     
    }
    
    /**
     * @roseuid 418A6D3C0000
     */
    public void steepTea() {
       teaIsSteeped = true;
       System.out.println("tea is steeping");     
    }
}
