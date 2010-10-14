//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\factorymethod\\HonoluluSoupFactoryMethodSubclass.java

package br.gov.fnde.designpatterns.creationalpatterns.factorymethod;

import br.gov.fnde.designpatterns.ClamChowder;
import br.gov.fnde.designpatterns.FishChowder;
import br.gov.fnde.designpatterns.HonoluluClamChowder;
import br.gov.fnde.designpatterns.HonoluluFishChowder;

public class HonoluluSoupFactoryMethodSubclass extends SoupFactoryMethod {
    
    /**
     * @return java.lang.String
     * @roseuid 4182CC20023F
     */
    public String makeBuffetName() {return "Honolulu Soup Buffet";     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.ClamChowder
     * @roseuid 4182CC20029C
     */
    public ClamChowder makeClamChowder() {return new HonoluluClamChowder();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.FishChowder
     * @roseuid 4182CC200319
     */
    public FishChowder makeFishChowder() {return new HonoluluFishChowder();     
    }
}
