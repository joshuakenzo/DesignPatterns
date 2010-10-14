//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestSoupBuffetBuilder.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.SoupBuffet;
import br.gov.fnde.designpatterns.creationalpatterns.builder.BostonSoupBuffetBuilder;
import br.gov.fnde.designpatterns.creationalpatterns.builder.HonoluluSoupBuffetBuilder;
import br.gov.fnde.designpatterns.creationalpatterns.builder.SoupBuffetBuilder;

/**
 * Make and return one object various ways. 
 * In this example the abstract SoupBuffetBuilder defines the methods necessary to 
 * create a SoupBuffet. 
 * BostonSoupBuffetBuilder and the HonoluluSoupBuffetBuilder both extend the 
 * SoupBuffetBuilder. 
 * An object can be defined as an SoupBuffetBuilder, and instantiated as either a 
 * BostonSoupBuffetBuilder (BSBB) or a HonoluluSoupBuffetBuilder (HSBB). Both BSBB 
 * or HSBB have a buildFishChowder method, and both return a FishChowder type 
 * class. However, the BSBB returns a FishChowder subclass of BostonFishChowder, 
 * while the HSBB returns a FishChowder subclass of HonoluluFishChowder.
 */
public class TestSoupBuffetBuilder {
    
    /**
     * @param soupBuffetBuilder
     * @return br.gov.fnde.desingpatterns.SoupBuffet
     * @roseuid 418968B9023E
     */
    public static SoupBuffet CreateSoupBuffet(SoupBuffetBuilder soupBuffetBuilder) { 
        soupBuffetBuilder.buildSoupBuffet();
        
        soupBuffetBuilder.setSoupBuffetName();        
        
        soupBuffetBuilder.buildChickenSoup();
        soupBuffetBuilder.buildClamChowder();
        soupBuffetBuilder.buildFishChowder();    
        soupBuffetBuilder.buildMinnestrone();
        soupBuffetBuilder.buildPastafazul();
        soupBuffetBuilder.buildTofuSoup();
        soupBuffetBuilder.buildVegetableSoup();
        
        return soupBuffetBuilder.getSoupBuffet();     
    }
    
    /**
     * @param args
     * @roseuid 418968B9026E
     */
    public static void main(String[] args) {
       SoupBuffet bostonSoupBuffet = CreateSoupBuffet(new BostonSoupBuffetBuilder());
       System.out.println("At the " + bostonSoupBuffet.getSoupBuffetName() + bostonSoupBuffet.getTodaysSoups());

       SoupBuffet honoluluSoupBuffet = CreateSoupBuffet(new HonoluluSoupBuffetBuilder());
       System.out.println("At the " + honoluluSoupBuffet.getSoupBuffetName() + honoluluSoupBuffet.getTodaysSoups());     
    }
}
