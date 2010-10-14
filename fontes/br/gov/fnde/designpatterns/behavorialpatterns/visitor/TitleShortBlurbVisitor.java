//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\visitor\\TitleShortBlurbVisitor.java

package br.gov.fnde.designpatterns.behavorialpatterns.visitor;


public class TitleShortBlurbVisitor extends TitleBlurbVisitor {
    
    /**
     * @roseuid 418BB2D00144
     */
    public TitleShortBlurbVisitor() {
     
    }
    
    /**
     * @param bookInfo
     * @roseuid 418BB4E100C7
     */
    public void visit(BookInfo bookInfo) {
       this.setTitleBlurb("SB-Book: " + bookInfo.getTitleName());     
    }
    
    /**
     * @param dvdInfo
     * @roseuid 418BB4E1024D
     */
    public void visit(DvdInfo dvdInfo) {
       this.setTitleBlurb("SB-DVD: " + dvdInfo.getTitleName());     
    }
    
    /**
     * @param gameInfo
     * @roseuid 418BB4E20115
     */
    public void visit(GameInfo gameInfo) {
       this.setTitleBlurb("SB-Game: " + gameInfo.getTitleName());     
    }
}
