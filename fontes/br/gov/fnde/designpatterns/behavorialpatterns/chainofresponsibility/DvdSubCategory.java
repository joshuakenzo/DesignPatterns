//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\chainofresponsibility\\DvdSubCategory.java

package br.gov.fnde.designpatterns.behavorialpatterns.chainofresponsibility;


public class DvdSubCategory implements TopTitle {
    private String subCategory;
    private String topSubCategoryTitle;
    private DvdCategory parent;
    
    /**
     * @param dvdCategory
     * @param subCategory
     * @roseuid 418A9E1400FA
     */
    public DvdSubCategory(DvdCategory dvdCategory, String subCategory) {
        this.setSubCategory(subCategory); 
        this.parent = dvdCategory;     
    }
    
    /**
     * @roseuid 418A9D100109
     */
    public DvdSubCategory() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E150232
     */
    public String getAllCategories() {return (getCategory() + "/" + getSubCategory());     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E150196
     */
    public String getCategory() {return parent.getCategory();     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E14033C
     */
    public String getSubCategory() {return this.subCategory;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E1601B5
     */
    public String getTopCategoryTitle() {return parent.getTopCategoryTitle();     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E15033C
     */
    public String getTopSubCategoryTitle() {return this.topSubCategoryTitle;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A9E160271
     */
    public String getTopTitle() {
       if (null != getTopSubCategoryTitle())
       {
           return this.getTopSubCategoryTitle();
       }
       else
       {
           System.out.println("no top title in Category/SubCategory " + getAllCategories());
           return parent.getTopTitle();
       }     
    }
    
    /**
     * @param categoryIn
     * @roseuid 418A9E15002E
     */
    public void setCategory(String categoryIn) {parent.setCategory(categoryIn);     
    }
    
    /**
     * @param subCategoryIn
     * @roseuid 418A9E140177
     */
    public void setSubCategory(String subCategoryIn) {this.subCategory = subCategoryIn;     
    }
    
    /**
     * @param topCategoryTitleIn
     * @roseuid 418A9E16000F
     */
    public void setTopCategoryTitle(String topCategoryTitleIn) {parent.setTopCategoryTitle(topCategoryTitleIn);     
    }
    
    /**
     * @param topSubCategoryTitleIn
     * @roseuid 418A9E1502FD
     */
    public void setTopSubCategoryTitle(String topSubCategoryTitleIn) {this.topSubCategoryTitle = topSubCategoryTitleIn;     
    }
}
