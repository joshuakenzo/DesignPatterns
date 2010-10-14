//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestProxy.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.structuralpatterns.proxy.PotOfTea;
import br.gov.fnde.designpatterns.structuralpatterns.proxy.PotOfTeaInterface;
import br.gov.fnde.designpatterns.structuralpatterns.proxy.PotOfTeaProxy;

/**
 * One class controls the creation of and access to objects in another class. 
 * Notes:
 * There are four types of proxies, all taking the same basic format: 
 * 1. Virtual Proxy - The proxy won't create an "expensive" subject object until 
 * it is actually needed. 
 * 2. Remote Proxy - A local proxy object controls access to a remote subject 
 * object. 
 * 3. Protection proxy - The proxy insures that the object creating/calling the 
 * subject has authorization to do so. 
 * 4. Smart reference - The proxy will perform "additional actions" when the 
 * subject is called. 
 * Reference Desgin Patterns pages 208-209.
 */
public class TestProxy {
    
    /**
     * @param args
     * @roseuid 418A91C30203
     */
    public static void main(String[] args) {
       System.out.println("TestProxy: instantiating PotOfTeaProxy");
       PotOfTeaInterface potOfTeaProxy = new PotOfTeaProxy();
       System.out.println(" ");          
       System.out.println("TestProxy: pouring tea");       
       potOfTeaProxy.pourTea();     
    }
}
