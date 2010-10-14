//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\template\\DvdTitleInfo.java

package br.gov.fnde.designpatterns.behavorialpatterns.template;


public class DvdTitleInfo extends TitleInfo {
    private char encodingRegion;
    private String star;
    
    /**
     * @param titleName
     * @param star
     * @param encodingRegion
     * @roseuid 418BAFB703D4
     */
    public DvdTitleInfo(String titleName, String star, char encodingRegion) {
       this.setTitleName(titleName);
       this.setStar(star);
       this.setEncodingRegion(encodingRegion);     
    }
    
    /**
     * @roseuid 418BAED9004A
     */
    public DvdTitleInfo() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418BAFB903D4
     */
    public String getDvdEncodingRegionInfo() {
       return (", encoding region: " + this.getEncodingRegion());     
    }
    
    /**
     * @return char
     * @roseuid 418BAFB90309
     */
    public char getEncodingRegion() {return this.encodingRegion;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418BAFB90059
     */
    public String getStar() {return this.star;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418BAF7A0069
     */
    public String getTitleBlurb() {
       return ("DVD: " + this.getTitleName() + ", starring " + this.getStar());     
    }
    
    /**
     * @param encodingRegionIn
     * @roseuid 418BAFB90144
     */
    public void setEncodingRegion(char encodingRegionIn) {this.encodingRegion = encodingRegionIn;     
    }
    
    /**
     * @param starIn
     * @roseuid 418BAFB8028C
     */
    public void setStar(String starIn) {this.star = starIn;     
    }
}
