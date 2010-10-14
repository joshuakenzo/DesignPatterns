//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\flyweight\\TeaOrderContext.java

package br.gov.fnde.designpatterns.structuralpatterns.flyweight;


public class TeaOrderContext {
    int tableNumber;
    
    /**
     * @param tableNumber
     * @roseuid 418A8BC801C5
     */
    public TeaOrderContext(int tableNumber) {
      // Esse contrutor na pagina estava assim: TeaOrderContext(int tableNumber) {this.tableNumber = tableNumber;}
       this.tableNumber = tableNumber;     
    }
    
    /**
     * @roseuid 418A8AF201A5
     */
    public TeaOrderContext() {
     
    }
    
    /**
     * @return int
     * @roseuid 418A8BC8033C
     */
    public int getTable() {
        return this.tableNumber;     
    }
}
