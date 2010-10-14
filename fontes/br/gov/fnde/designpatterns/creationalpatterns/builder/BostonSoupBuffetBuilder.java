//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\builder\\BostonSoupBuffetBuilder.java

package br.gov.fnde.designpatterns.creationalpatterns.builder;

import br.gov.fnde.designpatterns.BostonClamChowder;
import br.gov.fnde.designpatterns.BostonFishChowder;

public class BostonSoupBuffetBuilder extends SoupBuffetBuilder {
    
    /**
     * @roseuid 4189656400AB
     */
    public void buildClamChowder() {
      soupBuffet.setClamChowder(new BostonClamChowder());     
    }
    
    /**
     * @roseuid 4189656400BB
     */
    public void buildFishChowder() {
      soupBuffet.setFishChowder(new BostonFishChowder());     
    }
    
    /**
     * @roseuid 4189656400DA
     */
    public void setSoupBuffetName() {
      soupBuffet.setSoupBuffetName("Boston Soup Buffet");     
    }
}
