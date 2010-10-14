//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestFlyweight.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.structuralpatterns.flyweight.TeaFlavor;
import br.gov.fnde.designpatterns.structuralpatterns.flyweight.TeaFlavorFactory;
import br.gov.fnde.designpatterns.structuralpatterns.flyweight.TeaOrder;
import br.gov.fnde.designpatterns.structuralpatterns.flyweight.TeaOrderContext;

/**
 * The reusable and variable parts of a class are broken into two classes to save 
 * resources.
 * Notes:
 * In this example a single class could have held both the tea flavor and table 
 * number.
 * However, we will have a limited number of instances of tea flavors, and so that 
 * is broken into a it's own flyweight class.
 * Table number is less limited, so it goes into the context.
 * The factory is responsible for only making one instance of each flyweight.
 * The client is responsible for keeping both halves matched up, and passing the 
 * context into the flyweight.
 * References:
 * Online                                 
 * Portland Pattern Repository
 * Books (available from Amazon.com)
 * Desgin Patterns The "Gang of Four" Pattern Bible!
 * Java Design Patterns
 */
public class TestFlyweight {
    
    /**
     * the tables for the orders
     */
    static int ordersMade = 0;
    static TeaFlavor flavors[] = new TeaFlavor [100] ;
    
    /**
     * the flavors ordered
     */
    static TeaOrderContext tables[] = new TeaOrderContext [100] ;
    static TeaFlavorFactory teaFlavorFactory;
    
    /**
     * @param args
     * @roseuid 418A8CAA02AF
     */
    public static void main(String[] args) {
       teaFlavorFactory = new TeaFlavorFactory();          
       
       takeOrders("chai", 2);    
       takeOrders("chai", 2); 
       takeOrders("camomile", 1);
       takeOrders("camomile", 1);    
       takeOrders("earl grey", 1); 
       takeOrders("camomile", 897); 
       takeOrders("chai", 97);          
       takeOrders("chai", 97);          
       takeOrders("camomile", 3);   
       takeOrders("earl grey", 3);     
       takeOrders("chai", 3); 
       takeOrders("earl grey", 96);        
       takeOrders("camomile", 552);     
       takeOrders("chai", 121);          
       takeOrders("earl grey", 121);         
      
       for (int i = 0; i < ordersMade; i++)
       {
           flavors[i].serveTea(tables[i]);
       }  
       System.out.println(" ");       
       System.out.println("total teaFlavor objects made: " + teaFlavorFactory.getTotalTeaFlavorsMade());     
    }
    
    /**
     * @param flavorIn
     * @param table
     * @roseuid 418A8CAA0128
     */
    static void takeOrders(String flavorIn, int table) {
       flavors[ordersMade] = teaFlavorFactory.getTeaFlavor(flavorIn);
       tables[ordersMade++] = new TeaOrderContext(table);     
    }
}
