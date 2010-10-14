//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\state\\DvdStateNameExclaim.java

package br.gov.fnde.designpatterns.behavorialpatterns.state;


public class DvdStateNameExclaim implements DvdStateName {
    
    /**
     * @roseuid 418B7AE30134
     */
    public DvdStateNameExclaim() {
     
    }
    
    /**
     * @param dvdStateContext
     * @param nameIn
     * @roseuid 418B80E0029B
     */
    public void showName(DvdStateContext dvdStateContext, String nameIn) {
         System.out.println(nameIn.replace(' ','!'));
         dvdStateContext.setDvdStateName(new DvdStateNameStars());  //show exclaim only once, switch back to stars     
    }
}
