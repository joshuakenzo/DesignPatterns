//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\mediator\\DvdLowercaseTitle.java

package br.gov.fnde.designpatterns.behavorialpatterns.mediator;


public class DvdLowercaseTitle extends DvdTitle {
    private String LowercaseTitle;
    private String star;
    private DvdMediator dvdMediator;
    
    /**
     * @param dvdTitle
     * @param dvdMediator
     * @roseuid 418ABB490241
     */
    public DvdLowercaseTitle(DvdTitle dvdTitle, DvdMediator dvdMediator) {
       this(dvdTitle.getTitle(), dvdMediator);     
    }
    
    /**
     * @param title
     * @param dvdMediator
     * @roseuid 418ABB490147
     */
    public DvdLowercaseTitle(String title, DvdMediator dvdMediator) {
       this.setTitle(title);
       resetTitle();
       this.dvdMediator = dvdMediator;
       this.dvdMediator.setLowercase(this);     
    }
    
    /**
     * @roseuid 418ABA630137
     */
    public DvdLowercaseTitle() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418ABB4A00DA
     */
    public String getLowercaseTitle() {return LowercaseTitle;     
    }
    
    /**
     * @roseuid 418ABB4903A8
     */
    public void resetTitle() {
       this.setLowercaseTitle(this.getTitle().toLowerCase());     
    }
    
    /**
     * @param title
     * @roseuid 418ABB4903C8
     */
    public void resetTitle(String title) {
       this.setTitle(title);
       this.resetTitle();     
    }
    
    /**
     * @param LowercaseTitle
     * @roseuid 418ABB4A0147
     */
    private void setLowercaseTitle(String LowercaseTitle) {this.LowercaseTitle = LowercaseTitle;     
    }
    
    /**
     * @roseuid 418ABB4A00CA
     */
    public void setSuperTitleLowercase() {
       this.setTitle(this.getLowercaseTitle());
       dvdMediator.changeTitle(this);     
    }
}
