//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\state\\DvdStateNameStars.java

package br.gov.fnde.designpatterns.behavorialpatterns.state;


public class DvdStateNameStars implements DvdStateName {
    int starCount;
    
    /**
     * @roseuid 418B7AE30173
     */
    public DvdStateNameStars() {
        starCount = 0;     
    }
    
    /**
     * @param dvdStateContext
     * @param nameIn
     * @roseuid 418B80E00347
     */
    public void showName(DvdStateContext dvdStateContext, String nameIn) {
         System.out.println(nameIn.replace(' ','*'));
         if (++starCount > 1)  // show stars twice, switch to exclamation point
         {
             dvdStateContext.setDvdStateName(new DvdStateNameExclaim());
         }     
    }
}
