//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\template\\BookTitleInfo.java

package br.gov.fnde.designpatterns.behavorialpatterns.template;


public class BookTitleInfo extends TitleInfo {
    private String author;
    
    /**
     * @param titleName
     * @param author
     * @roseuid 418BB00E0153
     */
    public BookTitleInfo(String titleName, String author) {
       this.setTitleName(titleName);
       this.setAuthor(author);     
    }
    
    /**
     * @roseuid 418BAED802CA
     */
    public BookTitleInfo() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418BB00F0144
     */
    public String getAuthor() {return this.author;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418BAF790309
     */
    public String getTitleBlurb() {
       return ("Book title: " + this.getTitleName() + ", Author: " + this.getAuthor());     
    }
    
    /**
     * @param authorIn
     * @roseuid 418BB00E03B5
     */
    public void setAuthor(String authorIn) {this.author = authorIn;     
    }
}
