//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\composite\\TinOfTeaBags.java

package br.gov.fnde.designpatterns.structuralpatterns.composite;

import java.util.LinkedList;
import java.util.ListIterator;

public class TinOfTeaBags extends TeaBags {
    
    /**
     * @param nameIn
     * @roseuid 418A810E02BF
     */
    public TinOfTeaBags(String nameIn) {
       teaBagList = new LinkedList();
       this.setName(nameIn);     
    }
    
    /**
     * @roseuid 418A7EA402EE
     */
    public TinOfTeaBags() {
     
    }
    
    /**
     * @param teaBagsToAdd
     * @return boolean
     * @roseuid 418A810E033C
     */
    public boolean add(TeaBags teaBagsToAdd) {
       teaBagsToAdd.setParent(this);
       return teaBagList.add(teaBagsToAdd);     
    }
    
    /**
     * @return int
     * @roseuid 418A80D4003E
     */
    public int countTeaBags() {
       int totalTeaBags = 0;
       ListIterator listIterator = this.createListIterator();
       TeaBags tempTeaBags;
       while (listIterator.hasNext())
       {
           tempTeaBags = (TeaBags)listIterator.next();
           totalTeaBags += tempTeaBags.countTeaBags();
       }
       return totalTeaBags;     
    }
    
    /**
     * @return java.util.ListIterator
     * @roseuid 418A80D4007D
     */
    public ListIterator createListIterator() {
       ListIterator listIterator = teaBagList.listIterator();
       return listIterator;     
    }
    
    /**
     * @param teaBagsToRemove
     * @return boolean
     * @roseuid 418A810F001F
     */
    public boolean remove(TeaBags teaBagsToRemove) {
       ListIterator listIterator = this.createListIterator();
       TeaBags tempTeaBags;
       while (listIterator.hasNext())
       {
           tempTeaBags = (TeaBags)listIterator.next();
           if (tempTeaBags == teaBagsToRemove)
           {
               listIterator.remove();
               return true;
           }
       }
       return false;     
    }
}
