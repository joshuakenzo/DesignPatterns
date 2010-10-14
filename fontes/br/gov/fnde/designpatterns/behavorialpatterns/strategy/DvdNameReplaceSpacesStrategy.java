//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\strategy\\DvdNameReplaceSpacesStrategy.java

package br.gov.fnde.designpatterns.behavorialpatterns.strategy;


public class DvdNameReplaceSpacesStrategy extends DvdNameStrategy {
    
    /**
     * @roseuid 418B9C1A00B7
     */
    public DvdNameReplaceSpacesStrategy() {
     
    }
    
    /**
     * @param dvdName
     * @param charIn
     * @return java.lang.String
     * @roseuid 418BAB190059
     */
    public String formatDvdName(String dvdName, char charIn) {
      return dvdName.replace(' ', charIn);     
    }
}
