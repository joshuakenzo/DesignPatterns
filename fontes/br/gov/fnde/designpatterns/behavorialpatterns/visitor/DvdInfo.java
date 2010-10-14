//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\visitor\\DvdInfo.java

package br.gov.fnde.designpatterns.behavorialpatterns.visitor;


public class DvdInfo extends AbstractTitleInfo {
    private char encodingRegion;
    private String star;
    
    /**
     * @param titleName
     * @param star
     * @param encodingRegion
     * @roseuid 418BB59E004A
     */
    public DvdInfo(String titleName, String star, char encodingRegion) {
       this.setTitleName(titleName);
       this.setStar(star);
       this.setEncodingRegion(encodingRegion);     
    }
    
    /**
     * @roseuid 418BB2CF023E
     */
    public DvdInfo() {
     
    }
    
    /**
     * @param titleBlurbVisitor
     * @roseuid 418BB42D02CA
     */
    public void accept(TitleBlurbVisitor titleBlurbVisitor) {
      titleBlurbVisitor.visit(this);     
    }
    
    /**
     * @return char
     * @roseuid 418BB59F020F
     */
    public char getEncodingRegion() {return this.encodingRegion;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418BB59F004A
     */
    public String getStar() {return this.star;     
    }
    
    /**
     * @param encodingRegionIn
     * @roseuid 418BB59F0124
     */
    public void setEncodingRegion(char encodingRegionIn) {this.encodingRegion = encodingRegionIn;     
    }
    
    /**
     * @param starIn
     * @roseuid 418BB59E029B
     */
    public void setStar(String starIn) {this.star = starIn;     
    }
}
