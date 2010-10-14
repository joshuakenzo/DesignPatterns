//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\strategy\\DvdNameTheAtEndStrategy.java

package br.gov.fnde.designpatterns.behavorialpatterns.strategy;


public class DvdNameTheAtEndStrategy extends DvdNameStrategy {
    
    /**
     * @roseuid 418B9C1A02BB
     */
    public DvdNameTheAtEndStrategy() {
     
    }
    
    /**
     * @param dvdName
     * @param charIn
     * @return java.lang.String
     * @roseuid 418BAB1A001B
     */
    public String formatDvdName(String dvdName, char charIn) {
       if (dvdName.startsWith("The "))
       {
           return new String(dvdName.substring(4, (dvdName.length())) + ", The");
       }
       if (dvdName.startsWith("THE "))
       {
           return new String(dvdName.substring(4, (dvdName.length())) + ", THE");
       }       
       if (dvdName.startsWith("the "))
       {
           return new String(dvdName.substring(4, (dvdName.length())) + ", the");
       }         
       return dvdName;     
    }
}
