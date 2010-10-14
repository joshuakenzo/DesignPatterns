//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\facade\\FacadeTeaCup.java

package br.gov.fnde.designpatterns.structuralpatterns.facade;


public class FacadeTeaCup {
    boolean teaBagIsSteeped;
    FacadeWater facadeWater;
    FacadeTeaBag facadeTeaBag;
    
    /**
     * @roseuid 418A86FB0109
     */
    public FacadeTeaCup() {
       setTeaBagIsSteeped(false);
       System.out.println("behold the beautiful new tea cup");     
    }
    
    /**
     * @param facadeTeaBagIn
     * @roseuid 418A880B032C
     */
    public void addFacadeTeaBag(FacadeTeaBag facadeTeaBagIn) {
       facadeTeaBag = facadeTeaBagIn;
       System.out.println("the tea bag is in the tea cup");     
    }
    
    /**
     * @param facadeWaterIn
     * @roseuid 418A880B03D8
     */
    public void addFacadeWater(FacadeWater facadeWaterIn) {
       facadeWater = facadeWaterIn;
       System.out.println("the water is in the tea cup");     
    }
    
    /**
     * @return boolean
     * @roseuid 418A880B02BF
     */
    public boolean getTeaBagIsSteeped() {return teaBagIsSteeped;     
    }
    
    /**
     * @param isTeaBagSteeped
     * @roseuid 418A880B0203
     */
    public void setTeaBagIsSteeped(boolean isTeaBagSteeped) {teaBagIsSteeped = isTeaBagSteeped;     
    }
    
    /**
     * @roseuid 418A880C008C
     */
    public void steepTeaBag() {
       if ( (facadeTeaBag != null) && ((facadeWater != null) && (facadeWater.getWaterIsBoiling())) )
       {
          System.out.println("the tea is steeping in the cup");            
          setTeaBagIsSteeped(true);
       }
       else
       {
          System.out.println("the tea is not steeping in the cup");           
          setTeaBagIsSteeped(false);
       }     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A880C00FA
     */
    public String toString() {
       if (this.getTeaBagIsSteeped()) {return ("A nice cuppa tea!");}
       else 
       {
           String tempString = new String("A cup with ");
           if (facadeWater != null) 
           {
                if (facadeWater.getWaterIsBoiling()) 
                {
                    tempString = (tempString + "boiling water ");
                }
                else
                {
                    tempString = (tempString + "cold water ");                    
                }
           }
           else
           {
                tempString = (tempString + "no water ");                    
           }   
           if (facadeTeaBag != null) 
           {
                tempString = (tempString + "and a tea bag");                    
           }
           else
           {
                tempString = (tempString + "and no tea bag");                    
           } 
           return tempString;
       }     
    }
}
