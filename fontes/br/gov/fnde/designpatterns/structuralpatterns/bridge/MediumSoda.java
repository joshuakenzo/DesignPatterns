//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\bridge\\MediumSoda.java

package br.gov.fnde.designpatterns.structuralpatterns.bridge;


public class MediumSoda extends Soda {
    
    /**
     * @roseuid 418A70300128
     */
    public MediumSoda() {
      setSodaImp();     
    }
    
    /**
     * @roseuid 418A72CB007D
     */
    public void pourSoda() {
       SodaImp sodaImp = this.getSodaImp();
       for (int i = 0; i < 2; i++)
       {
           System.out.print("...glug...");
           sodaImp.pourSodaImp();
       }
       System.out.println(" ");     
    }
}
