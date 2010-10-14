//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestChainOfResponsibility.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.behavorialpatterns.chainofresponsibility.DvdCategory;
import br.gov.fnde.designpatterns.behavorialpatterns.chainofresponsibility.DvdSubCategory;
import br.gov.fnde.designpatterns.behavorialpatterns.chainofresponsibility.DvdSubSubCategory;
import br.gov.fnde.designpatterns.behavorialpatterns.chainofresponsibility.TopTitle;

/**
 * A method called in one class can move up a hierarchy to find an object that can 
 * properly execute the method.
 */
public class TestChainOfResponsibility {
    
    /**
     * @param args
     * @roseuid 418A9EEE03A9
     */
    public static void main(String[] args) {
        String topTitle;
        DvdCategory comedy = new DvdCategory("Comedy");
        comedy.setTopCategoryTitle("Ghost World");
        
        DvdSubCategory comedyChildrens = new DvdSubCategory(comedy, "Childrens"); 
        
        DvdSubSubCategory comedyChildrensAquatic = new DvdSubSubCategory(comedyChildrens, "Aquatic");
        comedyChildrensAquatic.setTopSubSubCategoryTitle("Sponge Bob Squarepants");
        
        System.out.println("");
        System.out.println("Getting top comedy title:");
        topTitle = comedy.getTopTitle();
        System.out.println("The top title for " + comedy.getAllCategories() + " is " + topTitle);        

        System.out.println("");
        System.out.println("Getting top comedy/childrens title:");        
        topTitle = comedyChildrens.getTopTitle();
        System.out.println("The top title for " + comedyChildrens.getAllCategories() + " is " + topTitle);        
       
        System.out.println("");        
        System.out.println("Getting top comedy/childrens/aquatic title:");        
        topTitle = comedyChildrensAquatic.getTopTitle();
        System.out.println("The top title for " + comedyChildrensAquatic.getAllCategories() + " is " + topTitle);     
    }
}
