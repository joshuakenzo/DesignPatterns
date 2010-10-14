//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\prototype\\PrototypeFactory.java

package br.gov.fnde.designpatterns.creationalpatterns.prototype;


public class PrototypeFactory {
    private AbstractFork prototypeFork;
    private AbstractSpoon prototypeSpoon;
    
    /**
     * @roseuid 418A47D80000
     */
    public PrototypeFactory() {
     
    }
    
    /**
     * @param spoon
     * @param fork
     * @roseuid 418A46F3034B
     */
    public PrototypeFactory(AbstractSpoon spoon, AbstractFork fork) {
       prototypeSpoon = spoon;
       prototypeFork = fork;     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.prototype.AbstractFork
     * @roseuid 418A4DE1008C
     */
    public AbstractFork makeFork() {
      return (AbstractFork)prototypeFork.clone();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.prototype.AbstractSpoon
     * @roseuid 418A4DE10000
     */
    public AbstractSpoon makeSpoon() {
      return (AbstractSpoon)prototypeSpoon.clone();     
    }
}
