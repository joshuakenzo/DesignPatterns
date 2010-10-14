//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\chainofresponsibility\\DvdCategory.java

package br.gov.fnde.designpatterns.behavorialpatterns.chainofresponsibility;


public class DvdCategory implements TopTitle {
    private String category;
    private String topCategoryTitle;
    
    /**
     * @param category
     * @roseuid 418A9DDB0222
     */
    public DvdCategory(String category) {
        this.setCategory(category);     
    }
    
    /**
     * @roseuid 418A9D10000F
     */
    public DvdCategory() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9DDC0186
     */
    public String getAllCategories() {return getCategory();     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9DDC0167
     */
    public String getCategory() {return this.category;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9DDC034B
     */
    public String getTopCategoryTitle() {return this.topCategoryTitle;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9DDC036B
     */
    public String getTopTitle() {return this.topCategoryTitle;     
    }
    
    /**
     * @param categoryIn
     * @roseuid 418A9DDB0399
     */
    public void setCategory(String categoryIn) {this.category = categoryIn;     
    }
    
    /**
     * @param topCategoryTitleIn
     * @roseuid 418A9DDC0251
     */
    public void setTopCategoryTitle(String topCategoryTitleIn) {this.topCategoryTitle = topCategoryTitleIn;     
    }
}
