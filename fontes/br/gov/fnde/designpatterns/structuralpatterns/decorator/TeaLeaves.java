//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\decorator\\TeaLeaves.java

package br.gov.fnde.designpatterns.structuralpatterns.decorator;


public class TeaLeaves extends Tea {
    
    /**
     * @roseuid 418A836C035B
     */
    public TeaLeaves() {
      teaIsSteeped = false;     
    }
    
    /**
     * @roseuid 418A840E01B5
     */
    public void steepTea() {
     teaIsSteeped = true;
     System.out.println("tea leaves are steeping");     
    }
}
