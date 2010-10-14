//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\abstractfactory\\AbstractSoupFactory.java

package br.gov.fnde.designpatterns.creationalpatterns.abstractfactory;

import br.gov.fnde.designpatterns.ChickenSoup;
import br.gov.fnde.designpatterns.ClamChowder;
import br.gov.fnde.designpatterns.FishChowder;
import br.gov.fnde.designpatterns.Minnestrone;
import br.gov.fnde.designpatterns.PastaFazoule;
import br.gov.fnde.designpatterns.TofuSoup;
import br.gov.fnde.designpatterns.VegetableSoup;

public abstract class AbstractSoupFactory {
    String factoryLocation;
    
    /**
     * @return java.lang.String
     * @roseuid 41895BC40176
     */
    public String getFactoryLocation() {return factoryLocation;     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.ChickenSoup
     * @roseuid 41895BC40186
     */
    public ChickenSoup makeChickenSoup() {return new ChickenSoup();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.ClamChowder
     * @roseuid 41895BC401A5
     */
    public ClamChowder makeClamChowder() {return new ClamChowder();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.FishChowder
     * @roseuid 41895BC401B5
     */
    public FishChowder makeFishChowder() {return new FishChowder();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.Minnestrone
     * @roseuid 41895BC401D4
     */
    public Minnestrone makeMinnestrone() {return new Minnestrone();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.PastaFazoule
     * @roseuid 41895BC401F3
     */
    public PastaFazoule makePastaFazoule() {return new PastaFazoule();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.TofuSoup
     * @roseuid 41895BC40212
     */
    public TofuSoup makeTofuSoup() {return new TofuSoup();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.VegetableSoup
     * @roseuid 41895BC40232
     */
    public VegetableSoup makeVegetableSoup() {return new VegetableSoup();     
    }
}
