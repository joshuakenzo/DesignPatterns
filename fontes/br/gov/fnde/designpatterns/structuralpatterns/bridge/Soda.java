//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\bridge\\Soda.java

package br.gov.fnde.designpatterns.structuralpatterns.bridge;


abstract class Soda {
    SodaImp sodaImp;
    
    /**
     * @roseuid 418A70300213
     */
    public Soda() {
     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.structuralpatterns.bridge.SodaImp
     * @roseuid 418A726B038A
     */
    public SodaImp getSodaImp() {
      return this.sodaImp;     
    }
    
    /**
     * @roseuid 418A726C0000
     */
    public abstract void pourSoda();
    
    /**
     * @roseuid 418A726B032C
     */
    public void setSodaImp() {
      this.sodaImp = SodaImpSingleton.getTheSodaImp();     
    }
}
