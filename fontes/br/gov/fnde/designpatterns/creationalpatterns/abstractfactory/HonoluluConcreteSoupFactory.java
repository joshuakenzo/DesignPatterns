//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\abstractfactory\\HonoluluConcreteSoupFactory.java

package br.gov.fnde.designpatterns.creationalpatterns.abstractfactory;

import br.gov.fnde.designpatterns.ClamChowder;
import br.gov.fnde.designpatterns.FishChowder;
import br.gov.fnde.designpatterns.HonoluluClamChowder;
import br.gov.fnde.designpatterns.HonoluluFishChowder;

public class HonoluluConcreteSoupFactory extends AbstractSoupFactory {
    
    /**
     * @roseuid 41895A9D0241
     */
    public HonoluluConcreteSoupFactory() {
      factoryLocation = "Honolulu";     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.ClamChowder
     * @roseuid 41895DB101E4
     */
    public ClamChowder makeClamChowder() {return new HonoluluClamChowder();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.FishChowder
     * @roseuid 41895DB10212
     */
    public FishChowder makeFishChowder() {return new HonoluluFishChowder();     
    }
}
