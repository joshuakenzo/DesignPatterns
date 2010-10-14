//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\builder\\HonoluluSoupBuffetBuilder.java

package br.gov.fnde.designpatterns.creationalpatterns.builder;

import br.gov.fnde.designpatterns.HonoluluClamChowder;
import br.gov.fnde.designpatterns.HonoluluFishChowder;

public class HonoluluSoupBuffetBuilder extends SoupBuffetBuilder {
    
    /**
     * @roseuid 41896972027C
     */
    public void setSoupBuffetName() {
      soupBuffet.setSoupBuffetName("Honolulu Soup Buffet");     
    }
    
    /**
     * @roseuid 418BC586020F
     */
    public void buildClamChowder() {soupBuffet.setClamChowder(new HonoluluClamChowder());     
    }
    
    /**
     * @roseuid 418BC586021E
     */
    public void buildFishChowder() {soupBuffet.setFishChowder(new HonoluluFishChowder());     
    }
}
