//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\composite\\OneTeaBag.java

package br.gov.fnde.designpatterns.structuralpatterns.composite;

import java.util.ListIterator;

public class OneTeaBag extends TeaBags {
    
    /**
     * @param nameIn
     * @roseuid 418A8062031C
     */
    public OneTeaBag(String nameIn) {
      this.setName(nameIn);     
    }
    
    /**
     * @roseuid 418A7EA40261
     */
    public OneTeaBag() {
     
    }
    
    /**
     * @param teaBagsToAdd
     * @return boolean
     * @roseuid 418A806203C8
     */
    public boolean add(TeaBags teaBagsToAdd) {return false;     
    }
    
    /**
     * @return int
     * @roseuid 418A80040000
     */
    public int countTeaBags() {return 1;     
    }
    
    /**
     * @return java.util.ListIterator
     * @roseuid 418A8004003E
     */
    public ListIterator createListIterator() {
     return null;
    }
    
    /**
     * @param teaBagsToRemove
     * @return boolean
     * @roseuid 418A8063009C
     */
    public boolean remove(TeaBags teaBagsToRemove) {return false;     
    }
}
