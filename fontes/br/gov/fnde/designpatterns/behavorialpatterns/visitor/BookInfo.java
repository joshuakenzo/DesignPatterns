//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\visitor\\BookInfo.java

package br.gov.fnde.designpatterns.behavorialpatterns.visitor;


public class BookInfo extends AbstractTitleInfo {
    private String author;
    
    /**
     * @param titleName
     * @param author
     * @roseuid 418BB55A0153
     */
    public BookInfo(String titleName, String author) {
       this.setTitleName(titleName);
       this.setAuthor(author);     
    }
    
    /**
     * @roseuid 418BB2CF0115
     */
    public BookInfo() {
     
    }
    
    /**
     * @param titleBlurbVisitor
     * @roseuid 418BB42D00F6
     */
    public void accept(TitleBlurbVisitor titleBlurbVisitor) {
      titleBlurbVisitor.visit(this);     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418BB55B0059
     */
    public String getAuthor() {return this.author;     
    }
    
    /**
     * @param authorIn
     * @roseuid 418BB55A0309
     */
    public void setAuthor(String authorIn) {this.author = authorIn;     
    }
}
