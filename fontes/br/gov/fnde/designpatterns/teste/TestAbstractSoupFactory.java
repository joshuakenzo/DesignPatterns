//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestAbstractSoupFactory.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.BostonClamChowder;
import br.gov.fnde.designpatterns.BostonFishChowder;
import br.gov.fnde.designpatterns.Soup;
import br.gov.fnde.designpatterns.creationalpatterns.abstractfactory.AbstractSoupFactory;
import br.gov.fnde.designpatterns.creationalpatterns.abstractfactory.BostonConcreteSoupFactory;
import br.gov.fnde.designpatterns.creationalpatterns.abstractfactory.HonoluluConcreteSoupFactory;

import java.util.Calendar;

/**
 * An abstract factory has varous methods to make various objects various ways. 
 * 
 * In this example the AbstractSoupFactory defines the method names and return 
 * types to make various kinds of soup. 
 * 
 * The BostonConcreteSoupFactory and the HonoluluConcreteSoupFactory both extend 
 * the AbstractSoupFactory. 
 * 
 * An object can be defined as an AbstractSoupFactory, and instantiated as either 
 * a BostonConcreteSoupFactory (BCSF) or a HonoluluConcreteSoupFactory (HCSF). 
 * Both BCSF or HCSF have the makeFishChowder method, and both return a 
 * FishChowder type class. However, the BCSF returns a FishChowder subclass of 
 * BostonFishChowder, while the HCSF returns a FishChowder subclass of 
 * HonoluluFishChowder.
 */
public class TestAbstractSoupFactory {
    
    /**
     * @param concreteSoupFactory
     * @return br.gov.fnde.desingpatterns.Soup
     * @roseuid 41895F1201B5
     */
    public static Soup makeSoupOfTheDay(AbstractSoupFactory concreteSoupFactory) {
       Calendar todayCalendar = Calendar.getInstance();
       int dayOfWeek = todayCalendar.get(Calendar.DAY_OF_WEEK);
       
       if (dayOfWeek == Calendar.MONDAY)
       {return concreteSoupFactory.makeChickenSoup();}
       else if (dayOfWeek == Calendar.TUESDAY)
       {return concreteSoupFactory.makeClamChowder();}
       else if (dayOfWeek == Calendar.WEDNESDAY)
       {return concreteSoupFactory.makeFishChowder();}       
       else if (dayOfWeek == Calendar.THURSDAY)
       {return concreteSoupFactory.makeMinnestrone();}
       else if (dayOfWeek == Calendar.TUESDAY)
       {return concreteSoupFactory.makePastaFazoule();}
       else if (dayOfWeek == Calendar.WEDNESDAY)
       {return concreteSoupFactory.makeTofuSoup();}
       else {return concreteSoupFactory.makeVegetableSoup();}     
    }
    
    /**
     * @param args
     * @roseuid 41895F1201F4
     */
    public static void main(String[] args) {
       AbstractSoupFactory concreteSoupFactory = new BostonConcreteSoupFactory();
       Soup soupOfTheDay = makeSoupOfTheDay(concreteSoupFactory);
       System.out.println("The Soup of the day in " + concreteSoupFactory.getFactoryLocation() + " is " + soupOfTheDay.getSoupName());
 
       concreteSoupFactory = new HonoluluConcreteSoupFactory();
       soupOfTheDay = makeSoupOfTheDay(concreteSoupFactory);
       System.out.println("The Soup of the day in " + concreteSoupFactory.getFactoryLocation() + " is " + soupOfTheDay.getSoupName());     
    }
}
