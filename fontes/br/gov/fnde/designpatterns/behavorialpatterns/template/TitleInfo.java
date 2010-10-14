//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\template\\TitleInfo.java

package br.gov.fnde.designpatterns.behavorialpatterns.template;


public abstract class TitleInfo {
    private String titleName;
    
    /**
     * this is a "hook operation", which may be overridden, 
     * hook operations usually do nothing if not overridden
     * 
     * @return java.lang.String
     * @roseuid 418BAF57028C
     */
    public String getDvdEncodingRegionInfo() {return " ";     
    }
    
    /**
     * this is a "primitive operation", and must be overridden in the concrete 
     * templates
     * 
     * @return java.lang.String
     * @roseuid 418BAF570192
     */
    public abstract String getTitleBlurb();
    
    /**
     * @return java.lang.String
     * @roseuid 418BAF570173
     */
    public final String getTitleName() {return this.titleName;     
    }
    
    /**
     * the "template method" - calls the concrete class methods, is not overridden
     * 
     * @return java.lang.String
     * @roseuid 418BAF56024D
     */
    public final String ProcessTitleInfo() {
       StringBuffer titleInfo = new StringBuffer();

       titleInfo.append(this.getTitleBlurb());
       titleInfo.append(this.getDvdEncodingRegionInfo());
       
       return titleInfo.toString();     
    }
    
    /**
     * the following 2 methods are "concrete abstract class methods"
     * 
     * @param titleNameIn
     * @roseuid 418BAF560328
     */
    public final void setTitleName(String titleNameIn) {this.titleName = titleNameIn;     
    }
}
