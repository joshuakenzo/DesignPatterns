//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\factorymethod\\SoupFactoryMethod.java

package br.gov.fnde.designpatterns.creationalpatterns.factorymethod;

import br.gov.fnde.designpatterns.ChickenSoup;
import br.gov.fnde.designpatterns.ClamChowder;
import br.gov.fnde.designpatterns.FishChowder;
import br.gov.fnde.designpatterns.Minnestrone;
import br.gov.fnde.designpatterns.PastaFazoule;
import br.gov.fnde.designpatterns.SoupBuffet;
import br.gov.fnde.designpatterns.TofuSoup;
import br.gov.fnde.designpatterns.VegetableSoup;

public class SoupFactoryMethod {
    
    /**
     * @roseuid 4182C30F01BD
     */
    public SoupFactoryMethod() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 4182C7740302
     */
    public String makeBuffetName() {return "Soup Buffet";     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.ChickenSoup
     * @roseuid 4182C774019B
     */
    public ChickenSoup makeChickenSoup() {return new ChickenSoup();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.ClamChowder
     * @roseuid 4182C77401C9
     */
    public ClamChowder makeClamChowder() {return new ClamChowder();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.FishChowder
     * @roseuid 4182C77401F8
     */
    public FishChowder makeFishChowder() {return new FishChowder();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.Minnestrone
     * @roseuid 4182C7740227
     */
    public Minnestrone makeMinnestrone() {return new Minnestrone();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.PastaFazoule
     * @roseuid 4182C7740266
     */
    public PastaFazoule makePastaFazoule() {return new PastaFazoule();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.SoupBuffet
     * @roseuid 4182C774015C
     */
    public SoupBuffet makeSoupBuffet() {return new SoupBuffet();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.TofuSoup
     * @roseuid 4182C7740295
     */
    public TofuSoup makeTofuSoup() {return new TofuSoup();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.VegetableSoup
     * @roseuid 4182C77402C3
     */
    public VegetableSoup makeVegetableSoup() {return new VegetableSoup();     
    }
}
