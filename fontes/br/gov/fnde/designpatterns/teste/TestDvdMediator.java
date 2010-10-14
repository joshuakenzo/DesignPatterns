//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestDvdMediator.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.behavorialpatterns.mediator.DvdLowercaseTitle;
import br.gov.fnde.designpatterns.behavorialpatterns.mediator.DvdMediator;
import br.gov.fnde.designpatterns.behavorialpatterns.mediator.DvdTitle;
import br.gov.fnde.designpatterns.behavorialpatterns.mediator.DvdUpcaseTitle;

/**
 * Passes communication between two or more objects.
 */
public class TestDvdMediator {
    
    /**
     * @param args
     * @roseuid 418ABC6401C4
     */
    public static void main(String[] args) {
       DvdMediator dvdMediator = new DvdMediator();
       DvdLowercaseTitle dvdLower = new DvdLowercaseTitle("Mulholland Dr.", dvdMediator);
       DvdUpcaseTitle dvdUp = new DvdUpcaseTitle(dvdLower, dvdMediator);
       
       System.out.println("Lowercase LC title :" + dvdLower.getLowercaseTitle());
       System.out.println("Lowercase super title :" + dvdLower.getTitle());   
       System.out.println("Upcase UC title :" + dvdUp.getUpcaseTitle());
       System.out.println("Upcase super title :" + dvdUp.getTitle());   
       
       dvdLower.setSuperTitleLowercase();
       
       System.out.println(" ");         
       System.out.println("After Super set to LC");    
       System.out.println("Lowercase LC title :" + dvdLower.getLowercaseTitle());
       System.out.println("Lowercase super title :" + dvdLower.getTitle());   
       System.out.println("Upcase UC title :" + dvdUp.getUpcaseTitle());
       System.out.println("Upcase super title :" + dvdUp.getTitle());     
    }
}
