//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\abstractfactory\\BostonConcreteSoupFactory.java

package br.gov.fnde.designpatterns.creationalpatterns.abstractfactory;

import br.gov.fnde.designpatterns.BostonClamChowder;
import br.gov.fnde.designpatterns.BostonFishChowder;
import br.gov.fnde.designpatterns.ClamChowder;
import br.gov.fnde.designpatterns.FishChowder;

public class BostonConcreteSoupFactory extends AbstractSoupFactory {
    
    /**
     * @roseuid 41895A9D0203
     */
    public BostonConcreteSoupFactory() {
      factoryLocation = "Boston";     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.ClamChowder
     * @roseuid 41895D2602CE
     */
    public ClamChowder makeClamChowder() {return new BostonClamChowder();     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.FishChowder
     * @roseuid 41895D2602ED
     */
    public FishChowder makeFishChowder() {return new BostonFishChowder();     
    }
}
