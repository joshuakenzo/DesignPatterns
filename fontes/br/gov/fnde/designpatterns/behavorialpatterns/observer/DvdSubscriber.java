//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\observer\\DvdSubscriber.java

package br.gov.fnde.designpatterns.behavorialpatterns.observer;


public class DvdSubscriber {
    private String subscriberName;
    
    /**
     * @param subscriberNameIn
     * @roseuid 418B77510192
     */
    public DvdSubscriber(String subscriberNameIn) {this.subscriberName = subscriberNameIn;     
    }
    
    /**
     * @roseuid 418B6B9E0059
     */
    public DvdSubscriber() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418B775101C1
     */
    public String getSubscriberName() {return this.subscriberName;     
    }
    
    /**
     * @param newDvdRelease
     * @param subscriptionListName
     * @roseuid 418B775101D0
     */
    public void newDvdRelease(DvdRelease newDvdRelease, String subscriptionListName) {
       System.out.println("");
       System.out.println("Hello " + this.getSubscriberName() + ", subscriber to the " + subscriptionListName + " DVD release list.");
       System.out.println("The new Dvd " + newDvdRelease.getDvdName() + " will be released on " + newDvdRelease.getDvdReleaseMonth() + "/" + newDvdRelease.getDvdReleaseDay() + "/" + newDvdRelease.getDvdReleaseYear() + ".");     
    }
    
    /**
     * @param newDvdRelease
     * @param subscriptionListName
     * @roseuid 418B7751022E
     */
    public void updateDvdRelease(DvdRelease newDvdRelease, String subscriptionListName) {
       System.out.println("");
       System.out.println("Hello " + this.getSubscriberName() + ", subscriber to the " + subscriptionListName + " DVD release list.");
       System.out.println("The following DVDs release has been revised: " + newDvdRelease.getDvdName() + " will be released on " + newDvdRelease.getDvdReleaseMonth() + "/" + newDvdRelease.getDvdReleaseDay() + "/" + newDvdRelease.getDvdReleaseYear() + ".");     
    }
}
