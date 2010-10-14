//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\visitor\\GameInfo.java

package br.gov.fnde.designpatterns.behavorialpatterns.visitor;


public class GameInfo extends AbstractTitleInfo {
    
    /**
     * @param titleName
     * @roseuid 418BB5DD03B5
     */
    public GameInfo(String titleName) {
       this.setTitleName(titleName);     
    }
    
    /**
     * @roseuid 418BB2CF028C
     */
    public GameInfo() {
     
    }
    
    /**
     * @param titleBlurbVisitor
     * @roseuid 418BB42D03E4
     */
    public void accept(TitleBlurbVisitor titleBlurbVisitor) {
        titleBlurbVisitor.visit(this);     
    }
}
