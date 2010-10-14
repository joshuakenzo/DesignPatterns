//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestTitleInfoTemplate.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.behavorialpatterns.template.BookTitleInfo;
import br.gov.fnde.designpatterns.behavorialpatterns.template.DvdTitleInfo;
import br.gov.fnde.designpatterns.behavorialpatterns.template.GameTitleInfo;
import br.gov.fnde.designpatterns.behavorialpatterns.template.TitleInfo;

/**
 * An abstract class defines various methods, and has one non-overridden method 
 * which calls the various methods.
 */
public class TestTitleInfoTemplate {
    
    /**
     * @param args
     * @roseuid 418BB0920098
     */
    public static void main(String[] args) {
       TitleInfo bladeRunner = new DvdTitleInfo("Blade Runner", "Harrison Ford", '1');  
       TitleInfo electricSheep = new BookTitleInfo("Do Androids Dream of Electric Sheep?", "Phillip K. Dick");        
       TitleInfo sheepRaider = new GameTitleInfo("Sheep Raider");        
       
       System.out.println(" ");       
       System.out.println("Testing bladeRunner   " +   bladeRunner.ProcessTitleInfo());   
       System.out.println("Testing electricSheep " + electricSheep.ProcessTitleInfo());   
       System.out.println("Testing sheepRaider   " +   sheepRaider.ProcessTitleInfo());     
    }
}
