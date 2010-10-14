//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\chainofresponsibility\\DvdSubSubCategory.java

package br.gov.fnde.designpatterns.behavorialpatterns.chainofresponsibility;


public class DvdSubSubCategory implements TopTitle {
    private String subSubCategory;
    private String topSubSubCategoryTitle;
    private DvdSubCategory parent;
    
    /**
     * @param dvdSubCategory
     * @param subCategory
     * @roseuid 418A9E6D0138
     */
    public DvdSubSubCategory(DvdSubCategory dvdSubCategory, String subCategory) {
        this.setSubSubCategory(subCategory); 
        this.parent = dvdSubCategory;     
    }
    
    /**
     * @roseuid 418A9D100213
     */
    public DvdSubSubCategory() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E6E034B
     */
    public String getAllCategories() {return (getCategory() + "/" + getSubCategory() + "/" + getSubSubCategory());     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E6E032C
     */
    public String getCategory() {return parent.getCategory();     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E6E01B5
     */
    public String getSubCategory() {return parent.getSubCategory();     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E6D037A
     */
    public String getSubSubCategory() {return this.subSubCategory;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E7001A5
     */
    public String getTopCategoryTitle() {return parent.getTopCategoryTitle();     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E6F036B
     */
    public String getTopSubCategoryTitle() {return parent.getTopSubCategoryTitle();     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E6F01B5
     */
    public String getTopSubSubCategoryTitle() {return this.topSubSubCategoryTitle;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E700261
     */
    public String getTopTitle() {
       if (null != getTopSubSubCategoryTitle())
       {
           return this.getTopSubSubCategoryTitle();
       }
       else
       {
           System.out.println("no top title in Category/SubCategory/SubSubCategory " + getAllCategories());
           return parent.getTopTitle();
       }     
    }
    
    /**
     * @param categoryIn
     * @roseuid 418A9E6E02DE
     */
    public void setCategory(String categoryIn) {parent.setCategory(categoryIn);     
    }
    
    /**
     * @param subCategoryIn
     * @roseuid 418A9E6E003E
     */
    public void setSubCategory(String subCategoryIn) {parent.setSubCategory(subCategoryIn);     
    }
    
    /**
     * @param subSubCategoryIn
     * @roseuid 418A9E6D0232
     */
    public void setSubSubCategory(String subSubCategoryIn) {this.subSubCategory = subSubCategoryIn;     
    }
    
    /**
     * @param topCategoryTitleIn
     * @roseuid 418A9E70001F
     */
    public void setTopCategoryTitle(String topCategoryTitleIn) {parent.setTopCategoryTitle(topCategoryTitleIn);     
    }
    
    /**
     * @param topSubCategoryTitleIn
     * @roseuid 418A9E6F0280
     */
    public void setTopSubCategoryTitle(String topSubCategoryTitleIn) {parent.setTopSubCategoryTitle(topSubCategoryTitleIn);     
    }
    
    /**
     * @param topSubSubCategoryTitleIn
     * @roseuid 418A9E6F002E
     */
    public void setTopSubSubCategoryTitle(String topSubSubCategoryTitleIn) {this.topSubSubCategoryTitle = topSubSubCategoryTitleIn;     
    }
}
