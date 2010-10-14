//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\strategy\\DvdNameContext.java

package br.gov.fnde.designpatterns.behavorialpatterns.strategy;


public class DvdNameContext {
    private DvdNameStrategy dvdNameStrategy;
    
    /**
     * @param strategyTypeIn
     * @roseuid 418BABB50079
     */
    public DvdNameContext(char strategyTypeIn) {
       switch (strategyTypeIn)
       {
           case 'C' : this.dvdNameStrategy = new DvdNameAllCapStrategy(); break;
           case 'E' : this.dvdNameStrategy = new DvdNameTheAtEndStrategy(); break;
           case 'S' : this.dvdNameStrategy = new DvdNameReplaceSpacesStrategy(); break;
           default  : this.dvdNameStrategy = new DvdNameTheAtEndStrategy(); 
       }     
    }
    
    /**
     * @roseuid 418B9C190338
     */
    public DvdNameContext() {
     
    }
    
    /**
     * @param namesIn
     * @return java.lang.String[]
     * @roseuid 418BABB5026D
     */
    public String[] formatDvdNames(String[] namesIn) {
       return this.formatDvdNames(namesIn, ' ');     
    }
    
    /**
     * @param namesIn
     * @param replacementIn
     * @return java.lang.String[]
     * @roseuid 418BABB600A7
     */
    public String[] formatDvdNames(String[] namesIn, char replacementIn) {
       String[] namesOut = new String[namesIn.length];
       for (int i = 0; i < namesIn.length; i++)
       {
           namesOut[i] = dvdNameStrategy.formatDvdName(namesIn[i], replacementIn);
           System.out.println("Dvd name before formatting: " + namesIn[i]);
           System.out.println("Dvd name after formatting:  " + namesOut[i]);  
           System.out.println("==========================");            
       }
       return namesOut;     
    }
}
