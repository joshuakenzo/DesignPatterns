//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\bridge\\SuperSizeSoda.java

package br.gov.fnde.designpatterns.structuralpatterns.bridge;


public class SuperSizeSoda extends Soda {
    
    /**
     * @roseuid 418A70300399
     */
    public SuperSizeSoda() {
      setSodaImp();     
    }
    
    /**
     * @roseuid 418A730302AF
     */
    public void pourSoda() {
       SodaImp sodaImp = this.getSodaImp();
       for (int i = 0; i < 5; i++)
       {
           System.out.print("...glug...");
           sodaImp.pourSodaImp();
       }
       System.out.println(" ");     
    }
}
