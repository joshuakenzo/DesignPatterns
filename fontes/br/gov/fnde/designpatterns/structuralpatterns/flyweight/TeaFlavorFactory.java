//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\flyweight\\TeaFlavorFactory.java

package br.gov.fnde.designpatterns.structuralpatterns.flyweight;


public class TeaFlavorFactory {
    
    /**
     * no more than 10 flavors can be made
     */
    int teasMade = 0;
    TeaFlavor flavors[] = new TeaFlavor [10] ;
    
    /**
     * @roseuid 418A8AF2007D
     */
    public TeaFlavorFactory() {
     
    }
    
    /**
     * @param flavorToGet
     * @return br.gov.fnde.desingpatterns.structuralpatterns.flyweight.TeaFlavor
     * @roseuid 418A8C07033C
     */
    public TeaFlavor getTeaFlavor(String flavorToGet) {
       if (teasMade > 0)
       {
           for (int i = 0; i < teasMade; i++)
           {
               if (flavorToGet.equals((flavors[i]).getFlavor()))
               {
                   return flavors[i];
               }
           }
       }
       flavors[teasMade] = new TeaFlavor(flavorToGet);
       return flavors[teasMade++];     
    }
    
    /**
     * @return int
     * @roseuid 418A8C08004E
     */
    public int getTotalTeaFlavorsMade() {return teasMade;     
    }
}
