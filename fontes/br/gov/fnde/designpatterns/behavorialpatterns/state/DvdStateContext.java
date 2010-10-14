//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\state\\DvdStateContext.java

package br.gov.fnde.designpatterns.behavorialpatterns.state;


public class DvdStateContext {
    private DvdStateName dvdStateName;
    
    /**
     * @roseuid 418B7AE30098
     */
    public DvdStateContext() {
       setDvdStateName(new DvdStateNameStars());  //start with stars     
    }
    
    /**
     * @param dvdStateNameIn
     * @roseuid 418B812401D0
     */
    public void setDvdStateName(DvdStateName dvdStateNameIn) {
       this.dvdStateName = dvdStateNameIn;     
    }
    
    /**
     * @param nameIn
     * @roseuid 418B8124022E
     */
    public void showName(String nameIn) {this.dvdStateName.showName(this, nameIn);     
    }
}
