//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\decorator\\ChaiDecorator.java

package br.gov.fnde.designpatterns.structuralpatterns.decorator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ChaiDecorator extends Tea {
    private ArrayList chaiIngredients = new ArrayList ();
    private Tea teaToMakeChai;
    
    /**
     * @param teaToMakeChai
     * @roseuid 418A84DB0000
     */
    public ChaiDecorator(Tea teaToMakeChai) {
        this.addTea(teaToMakeChai);
        chaiIngredients.add("bay leaf");
        chaiIngredients.add("cinnamon stick");          
        chaiIngredients.add("ginger");
        chaiIngredients.add("honey");  
        chaiIngredients.add("soy milk");        
        chaiIngredients.add("vanilla bean");     
    }
    
    /**
     * @roseuid 418A836C0222
     */
    public ChaiDecorator() {
     
    }
    
    /**
     * @roseuid 418A840E0128
     */
    public void steepTea() {
        this.steepChai();     
    }
    
    /**
     * @param teaToMakeChaiIn
     * @roseuid 418A84DB007D
     */
    private void addTea(Tea teaToMakeChaiIn) {
        this.teaToMakeChai = teaToMakeChaiIn;     
    }
    
    /**
     * @roseuid 418A84DB0119
     */
    public void steepChai() {
        teaToMakeChai.steepTea();
        this.steepChaiIngredients();
        System.out.println("tea is steeping with chai");     
    }
    
    /**
     * @roseuid 418A84DB0167
     */
    public void steepChaiIngredients() {
        ListIterator listIterator = chaiIngredients.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(((String)(listIterator.next())) + " is steeping");
        }
        System.out.println("chai ingredients are steeping");     
    }
}
