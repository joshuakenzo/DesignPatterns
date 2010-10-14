//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\visitor\\TitleBlurbVisitor.java

package br.gov.fnde.designpatterns.behavorialpatterns.visitor;


public abstract class TitleBlurbVisitor {
    String titleBlurb;
    
    /**
     * @return java.lang.String
     * @roseuid 418BB3CD021E
     */
    public String getTitleBlurb() {return this.titleBlurb;     
    }
    
    /**
     * @param blurbIn
     * @roseuid 418BB3CD0059
     */
    public void setTitleBlurb(String blurbIn) {this.titleBlurb = blurbIn;     
    }
    
    /**
     * @param bookInfo
     * @roseuid 418BB3CD02F9
     */
    public abstract void visit(BookInfo bookInfo);
    
    /**
     * @param dvdInfo
     * @roseuid 418BB3CE00B7
     */
    public abstract void visit(DvdInfo dvdInfo);
    
    /**
     * @param gameInfo
     * @roseuid 418BB3CE01E0
     */
    public abstract void visit(GameInfo gameInfo);
}
