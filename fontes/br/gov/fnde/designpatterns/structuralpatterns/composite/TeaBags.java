//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\composite\\TeaBags.java

package br.gov.fnde.designpatterns.structuralpatterns.composite;

import java.util.LinkedList;
import java.util.ListIterator;

public abstract class TeaBags {
    String name;
    LinkedList teaBagList;
    br.gov.fnde.designpatterns.structuralpatterns.composite.TeaBags parent;
    
    /**
     * @param teaBagsToAdd
     * @return boolean
     * @roseuid 418A7FA60280
     */
    public abstract boolean add(TeaBags teaBagsToAdd);
    
    /**
     * @return int
     * @roseuid 418A7FA60232
     */
    public abstract int countTeaBags();
    
    /**
     * @return java.util.ListIterator
     * @roseuid 418A7FA6036B
     */
    public abstract ListIterator createListIterator();
    
    /**
     * @return java.lang.String
     * @roseuid 418A7FA700BB
     */
    public String getName() {return name;     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.structuralpatterns.composite.TeaBags
     * @roseuid 418A7FA7002E
     */
    public TeaBags getParent() {return parent;     
    }
    
    /**
     * @param teaBagsToRemove
     * @return boolean
     * @roseuid 418A7FA6030D
     */
    public abstract boolean remove(TeaBags teaBagsToRemove);
    
    /**
     * @param nameIn
     * @roseuid 418A7FA7006D
     */
    public void setName(String nameIn) {name = nameIn;     
    }
    
    /**
     * @param parentIn
     * @roseuid 418A7FA603C8
     */
    public void setParent(TeaBags parentIn) {parent = parentIn;     
    }
}
