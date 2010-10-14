//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestBridge.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.structuralpatterns.bridge.CherrySodaImp;
import br.gov.fnde.designpatterns.structuralpatterns.bridge.GrapeSodaImp;
import br.gov.fnde.designpatterns.structuralpatterns.bridge.MediumSoda;
import br.gov.fnde.designpatterns.structuralpatterns.bridge.OrangeSodaImp;
import br.gov.fnde.designpatterns.structuralpatterns.bridge.SodaImpSingleton;
import br.gov.fnde.designpatterns.structuralpatterns.bridge.SuperSizeSoda;

/**
 * An abstraction and implementation are in different class hierarchies.
 */
public class TestBridge {
    
    /**
     * @roseuid 418A7B4701D4
     */
    public static void testCherryPlatform() {
       SodaImpSingleton sodaImpSingleton = new SodaImpSingleton(new CherrySodaImp());
       System.out.println("testing medium soda on the cherry platform");
       MediumSoda mediumSoda = new MediumSoda();
       mediumSoda.pourSoda();
       System.out.println("testing super size soda on the cherry platform");
       SuperSizeSoda superSizeSoda = new SuperSizeSoda();
       superSizeSoda.pourSoda();     
    }
    
    /**
     * @roseuid 418A7B4701E4
     */
    public static void testGrapePlatform() {
       SodaImpSingleton sodaImpSingleton = new SodaImpSingleton(new GrapeSodaImp());
       System.out.println("testing medium soda on the grape platform");
       MediumSoda mediumSoda = new MediumSoda();
       mediumSoda.pourSoda();
       System.out.println("testing super size soda on the grape platform");
       SuperSizeSoda superSizeSoda = new SuperSizeSoda();
       superSizeSoda.pourSoda();     
    }
    
    /**
     * @roseuid 418A7B470251
     */
    public static void testOrangePlatform() {
       SodaImpSingleton sodaImpSingleton = new SodaImpSingleton(new OrangeSodaImp());
       System.out.println("testing medium soda on the orange platform");
       MediumSoda mediumSoda = new MediumSoda();
       mediumSoda.pourSoda();
       System.out.println("testing super size soda on the orange platform");
       SuperSizeSoda superSizeSoda = new SuperSizeSoda();
       superSizeSoda.pourSoda();     
    }
    
    /**
     * @param args
     * @roseuid 418A7B470290
     */
    public static void main(String[] args) {
        testCherryPlatform();
        testGrapePlatform();
        testOrangePlatform();     
    }
}
