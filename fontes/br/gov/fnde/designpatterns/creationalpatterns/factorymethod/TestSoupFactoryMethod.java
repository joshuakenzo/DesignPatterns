//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\factorymethod\\TestSoupFactoryMethod.java

package br.gov.fnde.designpatterns.creationalpatterns.factorymethod;

import br.gov.fnde.designpatterns.SoupBuffet;

public class TestSoupFactoryMethod {
   public static void main(String[] args) 
   {
       
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
