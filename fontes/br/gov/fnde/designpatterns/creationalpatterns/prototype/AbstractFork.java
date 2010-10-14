//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\prototype\\AbstractFork.java

package br.gov.fnde.designpatterns.creationalpatterns.prototype;


public class AbstractFork implements Cloneable {
    String forkName;
    
    /**
     * @param forkName
     * @roseuid 418A4E7F01B5
     */
    public void setForkName(String forkName) {this.forkName = forkName;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A4E7F0271
     */
    public String getForkName() {return this.forkName;     
    }
    
    /**
     * @return java.lang.Object
     * @roseuid 418A4E7F02EE
     */
    public Object clone() {
       Object object = null;
       try {
           object = super.clone();
       } catch (CloneNotSupportedException exception) {
           System.err.println("AbstractFork is not Cloneable");
       }
       return object;     
    }
}
