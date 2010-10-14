//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestSoupFactoryMethod.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.SoupBuffet;
import br.gov.fnde.designpatterns.creationalpatterns.factorymethod.BostonSoupFactoryMethodSubclass;
import br.gov.fnde.designpatterns.creationalpatterns.factorymethod.HonoluluSoupFactoryMethodSubclass;
import br.gov.fnde.designpatterns.creationalpatterns.factorymethod.SoupFactoryMethod;

/**
 * Methods to make and return components of one object various ways. 
 * In this example the SoupFactoryMethod defines the makeSoupBuffet method which 
 * returns a SoupBuffet object. The SoupFactoryMethod also defines the methods 
 * needed in creating the SoupBuffet. 
 * The BostonSoupFactoryMethodSubclass and the HonoluluSoupFactoryMethodSubclass 
 * both extend the SoupFactoryMethod. An object can be defined as an 
 * SoupFactoryMethod, and instantiated as either a BostonSoupFactoryMethodSubclass 
 * (BSFMS) or a HonoluluSoupFactoryMethodSubclass (HSFMS). 
 * Both BSFMS and HSFMS override SoupFactoryMethod's makeFishChowder method. The 
 * BSFMS returns a SoupBuffet with a FishChowder subclass of BostonFishChowder, 
 * while the HSFMS returns a SoupBuffet with a FishChowder subclass of 
 * HonoluluFishChowder.
 */
public class TestSoupFactoryMethod {
    
    /**
     * @param args
     * @roseuid 4182D17002D2
     */
    public static void main(String[] args) {
       
       SoupFactoryMethod soupFactoryMethod = new SoupFactoryMethod();
       SoupBuffet soupBuffet = soupFactoryMethod.makeSoupBuffet();
       soupBuffet.setSoupBuffetName(soupFactoryMethod.makeBuffetName());
       soupBuffet.setChickenSoup(soupFactoryMethod.makeChickenSoup());
       soupBuffet.setClamChowder(soupFactoryMethod.makeClamChowder()); 
       soupBuffet.setFishChowder(soupFactoryMethod.makeFishChowder());
       soupBuffet.setMinnestrone(soupFactoryMethod.makeMinnestrone());
       soupBuffet.setPastafazoule(soupFactoryMethod.makePastaFazoule()); 
       soupBuffet.setTofuSoup(soupFactoryMethod.makeTofuSoup());
       soupBuffet.setVegetableSoup(soupFactoryMethod.makeVegetableSoup()); 
       System.out.println("At the  " + soupBuffet.getSoupBuffetName() + soupBuffet.getTodaysSoups());  
       
       
       SoupFactoryMethod bostonSoupFactoryMethod = new BostonSoupFactoryMethodSubclass();
       SoupBuffet bostonSoupBuffet = bostonSoupFactoryMethod.makeSoupBuffet();
       bostonSoupBuffet.setSoupBuffetName(bostonSoupFactoryMethod.makeBuffetName());
       bostonSoupBuffet.setChickenSoup(bostonSoupFactoryMethod.makeChickenSoup());
       bostonSoupBuffet.setClamChowder(bostonSoupFactoryMethod.makeClamChowder()); 
       bostonSoupBuffet.setFishChowder(bostonSoupFactoryMethod.makeFishChowder());
       bostonSoupBuffet.setMinnestrone(bostonSoupFactoryMethod.makeMinnestrone());
       bostonSoupBuffet.setPastafazoule(bostonSoupFactoryMethod.makePastaFazoule()); 
       bostonSoupBuffet.setTofuSoup(bostonSoupFactoryMethod.makeTofuSoup());
       bostonSoupBuffet.setVegetableSoup(bostonSoupFactoryMethod.makeVegetableSoup()); 
       System.out.println("At the  " + bostonSoupBuffet.getSoupBuffetName() + bostonSoupBuffet.getTodaysSoups());      
       
       SoupFactoryMethod honoluluSoupFactoryMethod = new HonoluluSoupFactoryMethodSubclass();
       SoupBuffet honoluluSoupBuffet = honoluluSoupFactoryMethod.makeSoupBuffet();
       honoluluSoupBuffet.setSoupBuffetName(honoluluSoupFactoryMethod.makeBuffetName());
       honoluluSoupBuffet.setChickenSoup(honoluluSoupFactoryMethod.makeChickenSoup());
       honoluluSoupBuffet.setClamChowder(honoluluSoupFactoryMethod.makeClamChowder()); 
       honoluluSoupBuffet.setFishChowder(honoluluSoupFactoryMethod.makeFishChowder());
       honoluluSoupBuffet.setMinnestrone(honoluluSoupFactoryMethod.makeMinnestrone());
       honoluluSoupBuffet.setPastafazoule(honoluluSoupFactoryMethod.makePastaFazoule()); 
       honoluluSoupBuffet.setTofuSoup(honoluluSoupFactoryMethod.makeTofuSoup());
       honoluluSoupBuffet.setVegetableSoup(honoluluSoupFactoryMethod.makeVegetableSoup()); 
       System.out.println("At the  " + honoluluSoupBuffet.getSoupBuffetName() + honoluluSoupBuffet.getTodaysSoups());     
    }
}
