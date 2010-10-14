//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\observer\\DvdReleaseByCategory.java

package br.gov.fnde.designpatterns.behavorialpatterns.observer;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdReleaseByCategory {
    String categoryName;
    ArrayList dvdReleaseList = new ArrayList ();
    ArrayList subscriberList = new ArrayList ();
    
    /**
     * @param categoryNameIn
     * @roseuid 418B77500309
     */
    public DvdReleaseByCategory(String categoryNameIn) {categoryName = categoryNameIn;     
    }
    
    /**
     * @roseuid 418B6B9E000B
     */
    public DvdReleaseByCategory() {
     
    }
    
    /**
     * @param dvdSubscriber
     * @return boolean
     * @roseuid 418B77500357
     */
    public boolean addSubscriber(DvdSubscriber dvdSubscriber) {
       return subscriberList.add(dvdSubscriber);     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418B77500338
     */
    public String getCategoryName() {return this.categoryName;     
    }
    
    /**
     * @param dvdRelease
     * @roseuid 418B775003E4
     */
    public void newDvdRelease(DvdRelease dvdRelease) {
       dvdReleaseList.add(dvdRelease);
       notifySubscribersOfNewDvd(dvdRelease);     
    }
    
    /**
     * @param dvdRelease
     * @roseuid 418B77510088
     */
    private void notifySubscribersOfNewDvd(DvdRelease dvdRelease) {
       ListIterator listIterator = subscriberList.listIterator();
       while (listIterator.hasNext())
       {
           ((DvdSubscriber)(listIterator.next())).newDvdRelease(dvdRelease, this.getCategoryName());
       }     
    }
    
    /**
     * @param dvdRelease
     * @roseuid 418B775100D6
     */
    private void notifySubscribersOfUpdate(DvdRelease dvdRelease) {
       ListIterator listIterator = subscriberList.listIterator();
       while (listIterator.hasNext())
       {
           ((DvdSubscriber)(listIterator.next())).updateDvdRelease(dvdRelease, this.getCategoryName() );
       }     
    }
    
    /**
     * @param dvdSubscriber
     * @return boolean
     * @roseuid 418B77500395
     */
    public boolean removeSubscriber(DvdSubscriber dvdSubscriber) {
       ListIterator listIterator = subscriberList.listIterator();
       while (listIterator.hasNext())
       {
           if (dvdSubscriber == (DvdSubscriber)(listIterator.next()))
           {
               listIterator.remove();
               return true;
           }
       }
       return false;     
    }
    
    /**
     * @param dvdRelease
     * @roseuid 418B7751004A
     */
    public void updateDvd(DvdRelease dvdRelease) {
       boolean dvdUpdated = false;
       DvdRelease tempDvdRelease;
       ListIterator listIterator = dvdReleaseList.listIterator();
       while (listIterator.hasNext())
       {
           tempDvdRelease = (DvdRelease)listIterator.next();
           if (dvdRelease.getSerialNumber().equals(tempDvdRelease.getSerialNumber()))
           {
               listIterator.remove();
               listIterator.add(dvdRelease);
               dvdUpdated = true;
               break;
           }
       }
       if (dvdUpdated == true) {notifySubscribersOfUpdate(dvdRelease);}
       else { this.newDvdRelease(dvdRelease);}     
    }
}
