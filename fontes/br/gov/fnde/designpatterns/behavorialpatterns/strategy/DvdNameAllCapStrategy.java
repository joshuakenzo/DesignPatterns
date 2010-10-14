//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\strategy\\DvdNameAllCapStrategy.java

package br.gov.fnde.designpatterns.behavorialpatterns.strategy;


public class DvdNameAllCapStrategy extends DvdNameStrategy {
    
    /**
     * @roseuid 418B9C1901FF
     */
    public DvdNameAllCapStrategy() {
     
    }
    
    /**
     * @param dvdName
     * @param charIn
     * @return java.lang.String
     * @roseuid 418BAB1800D6
     */
    public String formatDvdName(String dvdName, char charIn) {
       return dvdName.toUpperCase();     
    }
}
