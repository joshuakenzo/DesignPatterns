//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\visitor\\TitleLongBlurbVisitor.java

package br.gov.fnde.designpatterns.behavorialpatterns.visitor;


public class TitleLongBlurbVisitor extends TitleBlurbVisitor {
    
    /**
     * @roseuid 418BB4B3027C
     */
    public TitleLongBlurbVisitor() {
     
    }
    
    /**
     * @param bookInfo
     * @roseuid 418BB48001D0
     */
    public void visit(BookInfo bookInfo) {
       this.setTitleBlurb("LB-Book: " + bookInfo.getTitleName() + ", Author: " + bookInfo.getAuthor());     
    }
    
    /**
     * @param dvdInfo
     * @roseuid 418BB4800338
     */
    public void visit(DvdInfo dvdInfo) {
       this.setTitleBlurb("LB-DVD: " + dvdInfo.getTitleName() + ", starring " + dvdInfo.getStar() + ", encoding region: " + dvdInfo.getEncodingRegion());     
    }
    
    /**
     * @param gameInfo
     * @roseuid 418BB481003A
     */
    public void visit(GameInfo gameInfo) {
       this.setTitleBlurb("LB-Game: " + gameInfo.getTitleName());     
    }
}
