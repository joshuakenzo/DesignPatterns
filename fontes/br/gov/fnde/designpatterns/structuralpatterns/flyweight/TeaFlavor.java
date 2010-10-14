//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\flyweight\\TeaFlavor.java

package br.gov.fnde.designpatterns.structuralpatterns.flyweight;


public class TeaFlavor extends TeaOrder {
    String teaFlavor;
    
    /**
     * @param teaFlavor
     * @roseuid 418A8B96034B
     */
    TeaFlavor(String teaFlavor) {this.teaFlavor = teaFlavor;     
    }
    
    /**
     * @roseuid 418A8AF1034B
     */
    public TeaFlavor() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A8B97009C
     */
    public String getFlavor() {return this.teaFlavor;     
    }
    
    /**
     * @param teaOrderContext
     * @roseuid 418A8B970148
     */
    public void serveTea(TeaOrderContext teaOrderContext) {
        System.out.println("Serving tea flavor " + teaFlavor + " to table number " + teaOrderContext.getTable());     
    }
}
