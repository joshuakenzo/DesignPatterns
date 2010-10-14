//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\interpreter\\TitleAndActor.java

package br.gov.fnde.designpatterns.behavorialpatterns.interpreter;


public class TitleAndActor {
    private String actor;
    private String title;
    
    /**
     * @param title
     * @param actor
     * @roseuid 418AB0460222
     */
    public TitleAndActor(String title, String actor) {
        this.title = title;
        this.actor = actor;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418AB04602FD
     */
    public String getTitle() {return this.title;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418AB046031C
     */
    public String getActor() {return this.actor;     
    }
}
