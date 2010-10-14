//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\prototype\\AbstractSpoon.java

package br.gov.fnde.designpatterns.creationalpatterns.prototype;


public class AbstractSpoon implements Cloneable {
    String spoonName;
    
    /**
     * @param spoonName
     * @roseuid 418A4E28000F
     */
    public void setSpoonName(String spoonName) {this.spoonName = spoonName;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A4E28009C
     */
    public String getSpoonName() {return this.spoonName;     
    }
    
    /**
     * @return java.lang.Object
     * @roseuid 418A4E280119
     */
    public Object clone() {
       Object object = null;
       try {
           object = super.clone();
       } catch (CloneNotSupportedException exception) {
           System.err.println("AbstractSpoon is not Cloneable");
       }
       return object;     
    }
}
