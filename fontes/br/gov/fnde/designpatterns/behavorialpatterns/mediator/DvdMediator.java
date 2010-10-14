//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\mediator\\DvdMediator.java

package br.gov.fnde.designpatterns.behavorialpatterns.mediator;


public class DvdMediator {
    private String star;
    private DvdUpcaseTitle dvdUpcaseTitle;
    private DvdLowercaseTitle dvdLowercaseTitle;
    
    /**
     * @roseuid 418ABA6301C4
     */
    public DvdMediator() {
     
    }
    
    /**
     * @param dvdUpcaseTitle
     * @roseuid 418ABBC10251
     */
    public void changeTitle(DvdUpcaseTitle dvdUpcaseTitle) {
       this.dvdLowercaseTitle.resetTitle(dvdUpcaseTitle.getTitle());     
    }
    
    /**
     * @param dvdLowercaseTitle
     * @roseuid 418ABBC1034B
     */
    public void changeTitle(DvdLowercaseTitle dvdLowercaseTitle) {      
       this.dvdUpcaseTitle.resetTitle(dvdLowercaseTitle.getTitle());     
    }
    
    /**
     * @param dvdLowercaseTitle
     * @roseuid 418ABBC101B4
     */
    public void setLowercase(DvdLowercaseTitle dvdLowercaseTitle) {
       this.dvdLowercaseTitle = dvdLowercaseTitle;     
    }
    
    /**
     * @param dvdUpcaseTitle
     * @roseuid 418ABBC10166
     */
    public void setUpcase(DvdUpcaseTitle dvdUpcaseTitle) {
       this.dvdUpcaseTitle = dvdUpcaseTitle;     
    }
}
