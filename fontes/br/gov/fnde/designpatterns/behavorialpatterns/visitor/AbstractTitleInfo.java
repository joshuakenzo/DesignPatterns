//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\visitor\\AbstractTitleInfo.java

package br.gov.fnde.designpatterns.behavorialpatterns.visitor;


public abstract class AbstractTitleInfo {
    private String titleName;
    
    /**
     * @param titleBlurbVisitor
     * @roseuid 418BB3B60105
     */
    public abstract void accept(TitleBlurbVisitor titleBlurbVisitor);
    
    /**
     * @return java.lang.String
     * @roseuid 418BB3B6004A
     */
    public final String getTitleName() {return this.titleName;     
    }
    
    /**
     * @param titleNameIn
     * @roseuid 418BB3B502AB
     */
    public final void setTitleName(String titleNameIn) {this.titleName = titleNameIn;     
    }
}
