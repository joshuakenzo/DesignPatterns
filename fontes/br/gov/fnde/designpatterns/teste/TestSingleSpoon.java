//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestSingleSpoon.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.creationalpatterns.singleton.SingleSpoon;

/**
 * A class distributes the only instance of itself. 
 * In this example SingleSpoon class holds one instance of SingleSpoon in "private 
 * static SingleSpoon theSpoon;". The SingleSpoon class determines the spoons 
 * availability using "private static boolean theSpoonIsAvailable = true;" The 
 * first time SingleSpoon.getTheSpoon() is called it creates an instance of a 
 * SingleSpoon. The SingleSpoon can not be distributed again until it is returned 
 * with SingleSpoon.returnTheSpoon(). 
 * If you were to create a spoon "pool" you would have the same basic logic as 
 * shown, however multiple spoons would be distributed. The variable theSpoon 
 * would hold an array or collection of spoons. The variable theSpoonIsAvaialable 
 * would become a counter of the number of available spoons. 
 * Please also note that this example is not thread safe. I think that to make it 
 * thread safe all you would need is to make the getTheSpoon() method 
 * synchronized. Many thanks to Brian K. for pointing this out.
 */
public class TestSingleSpoon {
    
    /**
     * @param args
     * @roseuid 418A676E0271
     */
    public static void main(String[] args) {
       System.out.println("First person getting the spoon");
       SingleSpoon spoonForFirstPerson = SingleSpoon.getSpoon();       
       if (spoonForFirstPerson != null)
           System.out.println(spoonForFirstPerson);
       else
           System.out.println("No spoon was available");
       
       System.out.println("");       
       
       System.out.println("Second person getting a spoon");
       SingleSpoon spoonForSecondPerson = SingleSpoon.getSpoon();        
       if (spoonForSecondPerson != null)
           System.out.println(spoonForSecondPerson);
       else
           System.out.println("No spoon was available"); 
       
       System.out.println("");       
       
       System.out.println("First person returning the spoon");
       spoonForFirstPerson.returnSpoon();       
       spoonForFirstPerson = null;
       System.out.println("The spoon was returned");       
       
       System.out.println("");       
       
       System.out.println("Second person getting a spoon");
       spoonForSecondPerson = SingleSpoon.getSpoon();        
       if (spoonForSecondPerson != null)
           System.out.println(spoonForSecondPerson);
       else
           System.out.println("No spoon was available");     
    }
}
