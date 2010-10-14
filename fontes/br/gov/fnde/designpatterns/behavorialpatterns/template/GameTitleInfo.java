//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\template\\GameTitleInfo.java

package br.gov.fnde.designpatterns.behavorialpatterns.template;


public class GameTitleInfo extends TitleInfo {
    
    /**
     * @param titleName
     * @roseuid 418BB04A0134
     */
    public GameTitleInfo(String titleName) {
       this.setTitleName(titleName);     
    }
    
    /**
     * @roseuid 418BAED90153
     */
    public GameTitleInfo() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418BAF7A0173
     */
    public String getTitleBlurb() {
       return ("Game: " + this.getTitleName());     
    }
}
