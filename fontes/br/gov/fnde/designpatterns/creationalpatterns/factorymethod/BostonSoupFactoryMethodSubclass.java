//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\factorymethod\\BostonSoupFactoryMethodSubclass.java

package br.gov.fnde.designpatterns.creationalpatterns.factorymethod;

import br.gov.fnde.designpatterns.BostonClamChowder;
import br.gov.fnde.designpatterns.BostonFishChowder;
import br.gov.fnde.designpatterns.ClamChowder;
import br.gov.fnde.designpatterns.FishChowder;

public class BostonSoupFactoryMethodSubclass extends SoupFactoryMethod {
    
    /**
     * @return java.lang.String
     * @roseuid 4182C8FB0040
     */
    public String makeBuffetName() {return "Boston Soup Buffet";     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.ClamChowder
     * @roseuid 4182C8FB0060
     */
    public ClamChowder makeClamChowder() {return new BostonClamChowder();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.FishChowder
     * @roseuid 4182C8FB008E
     */
    public FishChowder makeFishChowder() {return new BostonFishChowder();     
    }
}
