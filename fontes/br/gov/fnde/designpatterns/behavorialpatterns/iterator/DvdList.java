//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\iterator\\DvdList.java

package br.gov.fnde.designpatterns.behavorialpatterns.iterator;


public class DvdList {
    
    /**
     * title count is always a real count of titles, but one ahead of 
     * itself as a subscript
     */
    private int arraySize;
    
    /**
     * Yes, it would be easier to do this whole example with ArrayList
     * and ListIterator, but it certainly wouldn't be as much fun!
     */
    private int titleCount;
    private String titles[];
    
    /**
     * @roseuid 418AB49002AE
     */
    public DvdList() {
        titles = new String[3];
        //using 3 to demonstrate array expansion more easily, not for efficency        
        titleCount = 0;
        arraySize = 3;     
    }
    
    /**
     * @param titleIn
     * @roseuid 418AB6320109
     */
    public void append(String titleIn) {
       if (titleCount >= arraySize) 
       {
           String[] tempArray = new String[arraySize];
           for (int i = 0; i < arraySize; i++)
           {tempArray[i] = titles[i];}
           titles = null;
           arraySize = arraySize + 3;           
           titles = new String[arraySize];
           for (int i = 0; i < (arraySize - 3); i++)
           {titles[i] = tempArray[i];}           
       }
       titles[titleCount++] = titleIn;     
    }
    
    /**
     * @return int
     * @roseuid 418AB63200AB
     */
    public int count() {return titleCount;     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.behavorialpatterns.iterator.DvdListIterator
     * @roseuid 418AB6320260
     */
    public DvdListIterator createIterator() {return new InnerIterator();     
    }
    
    /**
     * @param titleIn
     * @roseuid 418AB6320231
     */
    public void delete(String titleIn) {
       boolean found = false;
       for (int i = 0; i < (titleCount -1); i++)
       {
           if (found == false)
           {
               if (titles[i].equals(titleIn))
               {
                   found = true;
                   titles[i] = titles[i + 1];
               }
           }
           else
           {
               if (i < (titleCount -1))
               {titles[i] = titles[i + 1];}
               else
               {titles[i] = null;}
           }
       }
       
       if (found == true) {--titleCount;}     
    }
    
    /**
     * note: This example shows the Concrete Iterator as an inner class.
     * The Iterator Pattern in GoF does allow for multiple types of 
     * iterators for a given list or "Aggregate".  This could be 
     * accomplished with multiple Iterators in multiple inner classes.
     * The createIterator class would then have multiple variations.
     * This, however, assumes that you will have a limited number of
     * iterator variants - which is normally the case.  If you do want
     * more flexibility in iterator creation, the iterators should not
     * be in inner classes, and perhaps some sort factory should be 
     * employed to create them.
     */
    private class InnerIterator implements DvdListIterator {
        private int currentPosition = 0;
        
        /**
         * @roseuid 418AB633002E
         */
        private InnerIterator() {
         
        }
        
        /**
         * @return java.lang.String
         * @roseuid 418AB63301D4
         */
        public String currentItem() {return titles[currentPosition];         
        }
        
        /**
         * @roseuid 418AB633008C
         */
        public void first() {currentPosition = 0;         
        }
        
        /**
         * @return boolean
         * @roseuid 418AB6330137
         */
        public boolean isDone() {
           if (currentPosition >= (titleCount))
           {return true;}
           else
           {return false;}         
        }
        
        /**
         * @roseuid 418AB63300CA
         */
        public void next() {
           if (currentPosition < (titleCount))
           {
               ++currentPosition;
           }         
        }
    }
}
