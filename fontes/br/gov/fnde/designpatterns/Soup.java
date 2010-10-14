//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\Soup.java

package br.gov.fnde.designpatterns;

import java.util.ArrayList;
import java.util.ListIterator;

public abstract class Soup {
    ArrayList soupIngredients = new ArrayList ();
    String soupName;
    
    /**
     * @return java.lang.String
     * @roseuid 4182CA3C0119
     */
    public String getSoupName() {
       return soupName;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 4182CA3C0177
     */
    public String toString() {
        StringBuffer stringOfIngredients = new StringBuffer(soupName);
        stringOfIngredients.append(" Ingredients: ");
        ListIterator soupIterator = soupIngredients.listIterator();
        while (soupIterator.hasNext())
        {
            stringOfIngredients.append((String)soupIterator.next());
        }
        return stringOfIngredients.toString();     
    }
}
