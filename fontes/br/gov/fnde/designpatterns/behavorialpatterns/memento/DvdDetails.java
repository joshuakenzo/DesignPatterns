//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\memento\\DvdDetails.java

package br.gov.fnde.designpatterns.behavorialpatterns.memento;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdDetails {
    private char encodingRegion;
    private ArrayList stars;
    private String titleName;
    
    /**
     * @param titleName
     * @param stars
     * @param encodingRegion
     * @roseuid 418ABEDB02DD
     */
    public DvdDetails(String titleName, ArrayList stars, char encodingRegion) {
        this.setTitleName(titleName);
        this.setStars(stars);
        this.setEncodingRegion(encodingRegion);     
    }
    
    /**
     * @param starIn
     * @roseuid 418ABEDC0166
     */
    public void addStar(String starIn) {stars.add(starIn);     
    }
    
    /**
     * save current state of DvdDetails in a DvdMemento
     * 
     * @return 
     * br.gov.fnde.desingpatterns.behavorialpatterns.memento.DvdDetails.DvdMemento
     * @roseuid 418ABEDC02ED
     */
    public DvdDetails.DvdMemento createDvdMemento() {
       DvdMemento mementoToReturn = new DvdMemento();
       mementoToReturn.setState();
       return mementoToReturn;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418ABEDC0241
     */
    public String formatDvdDetails() {
       return ("DVD: " + this.getTitleName() + ", starring: " + getStarsString(getStars()) + ", encoding region: " + this.getEncodingRegion());     
    }
    
    /**
     * @return char
     * @roseuid 418ABE0E0166
     */
    private char getEncodingRegion() {return this.encodingRegion;     
    }
    
    /**
     * @return java.util.ArrayList
     * @roseuid 418ABE0E007C
     */
    private ArrayList getStars() {return this.stars;     
    }
    
    /**
     * @param starsIn
     * @return java.lang.String
     * @roseuid 418ABEDC01B4
     */
    private static String getStarsString(ArrayList starsIn) {
        int count = 0;
        StringBuffer sb = new StringBuffer();
        ListIterator starsIterator = starsIn.listIterator();
        while (starsIterator.hasNext())
        {
            if (count++ > 0) {sb.append(", ");} 
            sb.append((String) starsIterator.next());
        }
        return sb.toString();     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418ABEDC00E9
     */
    private String getTitleName() {return this.titleName;     
    }
    
    /**
     * sets current state to what DvdMemento has
     * 
     * @param dvdMementoIn
     * @roseuid 418ABEDC0260
     */
    public void setDvdMemento(DvdDetails.DvdMemento dvdMementoIn) {
       dvdMementoIn.getState();     
    }
    
    /**
     * @param encodingRegionIn
     * @roseuid 418ABE0E00DA
     */
    private void setEncodingRegion(char encodingRegionIn) {this.encodingRegion = encodingRegionIn;     
    }
    
    /**
     * @param starsIn
     * @roseuid 418ABE0D0399
     */
    private void setStars(ArrayList starsIn) {
      this.stars = starsIn;     
    }
    
    /**
     * @param titleNameIn
     * @roseuid 418ABEDC001E
     */
    private void setTitleName(String titleNameIn) {this.titleName = titleNameIn;     
    }
    
    /**
     * an inner class for the memento
     */
    public class DvdMemento {
        private char mementoEncodingRegion;
        private ArrayList mementoStars;
        private String mementoTitleName;
        
        /**
         * resets DvdDetails to DvdMementoData
         * @roseuid 418ABEDC033B
         */
        public void getState() {
            setTitleName(mementoTitleName);
            setStars(mementoStars);
            setEncodingRegion(mementoEncodingRegion);         
        }
        
        /**
         * sets DvdMementoData to DvdDetails
         * @roseuid 418ABEDC032B
         */
        public void setState() {
            //Because String are immutable we can just set the DvdMemento Strings to = the DvdDetail Strings.
            mementoTitleName = getTitleName();
            mementoEncodingRegion = getEncodingRegion();
            //However, ArrayLists are not immutable, so we need to instantiate a new ArrayList. 
            mementoStars = new ArrayList(getStars());         
        }
        
        /**
         * only useful for testing
         * 
         * @return java.lang.String
         * @roseuid 418ABEDC035A
         */
        public String showMemento() {
            return ("DVD: " + mementoTitleName + ", starring: " + getStarsString(mementoStars) + ", encoding region: " + mementoEncodingRegion);         
        }
    }
}
