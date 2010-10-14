//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestTitleVisitor.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.behavorialpatterns.visitor.AbstractTitleInfo;
import br.gov.fnde.designpatterns.behavorialpatterns.visitor.BookInfo;
import br.gov.fnde.designpatterns.behavorialpatterns.visitor.DvdInfo;
import br.gov.fnde.designpatterns.behavorialpatterns.visitor.GameInfo;
import br.gov.fnde.designpatterns.behavorialpatterns.visitor.TitleBlurbVisitor;
import br.gov.fnde.designpatterns.behavorialpatterns.visitor.TitleLongBlurbVisitor;
import br.gov.fnde.designpatterns.behavorialpatterns.visitor.TitleShortBlurbVisitor;

/**
 * One or more related classes have the same method, which calls a method specific 
 * for themselves in another class.
 */
public class TestTitleVisitor {
    
    /**
     * @param args
     * @roseuid 418BB60F0309
     */
    public static void main(String[] args) {
       AbstractTitleInfo bladeRunner = new DvdInfo("Blade Runner", "Harrison Ford", '1');  
       AbstractTitleInfo electricSheep = new BookInfo("Do Androids Dream of Electric Sheep?", "Phillip K. Dick");        
       AbstractTitleInfo sheepRaider = new GameInfo("Sheep Raider");        
       
       TitleBlurbVisitor titleLongBlurbVisitor = new TitleLongBlurbVisitor();
       
       System.out.println("Long Blurbs:");     
       bladeRunner.accept(titleLongBlurbVisitor);
       System.out.println("Testing bladeRunner   " + titleLongBlurbVisitor.getTitleBlurb()); 
       electricSheep.accept(titleLongBlurbVisitor);
       System.out.println("Testing electricSheep " + titleLongBlurbVisitor.getTitleBlurb());   
       sheepRaider.accept(titleLongBlurbVisitor);
       System.out.println("Testing sheepRaider   " + titleLongBlurbVisitor.getTitleBlurb());   
       
       TitleBlurbVisitor titleShortBlurbVisitor = new TitleShortBlurbVisitor();
       
       System.out.println("Short Blurbs:");     
       bladeRunner.accept(titleShortBlurbVisitor);
       System.out.println("Testing bladeRunner   " + titleShortBlurbVisitor.getTitleBlurb()); 
       electricSheep.accept(titleLongBlurbVisitor);
       System.out.println("Testing electricSheep " + titleShortBlurbVisitor.getTitleBlurb());   
       sheepRaider.accept(titleShortBlurbVisitor);
       System.out.println("Testing sheepRaider   " + titleShortBlurbVisitor.getTitleBlurb());     
    }
}
