//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\builder\\SoupBuffetBuilder.java

package br.gov.fnde.designpatterns.creationalpatterns.builder;

import br.gov.fnde.designpatterns.ChickenSoup;
import br.gov.fnde.designpatterns.ClamChowder;
import br.gov.fnde.designpatterns.FishChowder;
import br.gov.fnde.designpatterns.Minnestrone;
import br.gov.fnde.designpatterns.PastaFazoule;
import br.gov.fnde.designpatterns.SoupBuffet;
import br.gov.fnde.designpatterns.TofuSoup;
import br.gov.fnde.designpatterns.VegetableSoup;

public abstract class SoupBuffetBuilder {
    SoupBuffet soupBuffet;
    
    /**
     * @return br.gov.fnde.desingpatterns.SoupBuffet
     * @roseuid 418965A70244
     */
    public SoupBuffet getSoupBuffet() {return soupBuffet;     
    }
    
    /**
     * @roseuid 418965A70270
     */
    public void buildSoupBuffet() {soupBuffet = new SoupBuffet();     
    }
    
    /**
     * @roseuid 418965A70280
     */
    public abstract void setSoupBuffetName();
    
    /**
     * @roseuid 4189671E03A9
     */
    public void buildChickenSoup() {soupBuffet.setChickenSoup(new ChickenSoup());     
    }
    
    /**
     * @roseuid 4189671E03B8
     */
    public void buildClamChowder() {soupBuffet.setClamChowder(new ClamChowder());     
    }
    
    /**
     * @roseuid 4189671E03C8
     */
    public void buildFishChowder() {soupBuffet.setFishChowder(new FishChowder());     
    }
    
    /**
     * @roseuid 4189671E03E7
     */
    public void buildMinnestrone() {soupBuffet.setMinnestrone(new Minnestrone());     
    }
    
    /**
     * @roseuid 4189671F000F
     */
    public void buildPastafazul() {soupBuffet.setPastafazoule(new PastaFazoule());     
    }
    
    /**
     * @roseuid 4189671F002E
     */
    public void buildTofuSoup() {soupBuffet.setTofuSoup(new TofuSoup());     
    }
    
    /**
     * @roseuid 4189671F003E
     */
    public void buildVegetableSoup() {soupBuffet.setVegetableSoup(new VegetableSoup());     
    }
}
