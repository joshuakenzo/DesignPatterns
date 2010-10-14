//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\mediator\\DvdUpcaseTitle.java

package br.gov.fnde.designpatterns.behavorialpatterns.mediator;


public class DvdUpcaseTitle extends DvdTitle {
    private String star;
    private String upcaseTitle;
    private DvdMediator dvdMediator;
    
    /**
     * @param dvdTitle
     * @param dvdMediator
     * @roseuid 418ABB8902BE
     */
    public DvdUpcaseTitle(DvdTitle dvdTitle, DvdMediator dvdMediator) {
       this(dvdTitle.getTitle(), dvdMediator);     
    }
    
    /**
     * @param title
     * @param dvdMediator
     * @roseuid 418ABB8901B4
     */
    public DvdUpcaseTitle(String title, DvdMediator dvdMediator) {
       this.setTitle(title);
       resetTitle();
       this.dvdMediator = dvdMediator;
       this.dvdMediator.setUpcase(this);     
    }
    
    /**
     * @roseuid 418ABA630241
     */
    public DvdUpcaseTitle() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418ABB8A006C
     */
    public String getUpcaseTitle() {return upcaseTitle;     
    }
    
    /**
     * @roseuid 418ABB890399
     */
    public void resetTitle() {
       this.setUpcaseTitle(this.getTitle().toUpperCase());     
    }
    
    /**
     * @param title
     * @roseuid 418ABB8A001E
     */
    public void resetTitle(String title) {
       this.setTitle(title);
       this.resetTitle();     
    }
    
    /**
     * @roseuid 418ABB8A004D
     */
    public void setSuperTitleUpcase() {
       this.setTitle(this.getUpcaseTitle());
       dvdMediator.changeTitle(this);     
    }
    
    /**
     * @param upcaseTitle
     * @roseuid 418ABB8A0118
     */
    private void setUpcaseTitle(String upcaseTitle) {this.upcaseTitle = upcaseTitle;     
    }
}
