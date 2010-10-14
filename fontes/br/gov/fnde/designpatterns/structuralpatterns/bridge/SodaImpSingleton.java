//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\bridge\\SodaImpSingleton.java

package br.gov.fnde.designpatterns.structuralpatterns.bridge;


public class SodaImpSingleton {
    private static SodaImp sodaImp;
    
    /**
     * @roseuid 418A792B0109
     */
    public SodaImpSingleton() {
     
    }
    
    /**
     * @param sodaImpIn
     * @roseuid 418A7030031C
     */
    public SodaImpSingleton(SodaImp sodaImpIn) {
      this.sodaImp = sodaImpIn;     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.structuralpatterns.bridge.SodaImp
     * @roseuid 418A797602EE
     */
    public static SodaImp getTheSodaImp() {
        return sodaImp;     
    }
}
