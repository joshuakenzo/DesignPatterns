//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\structuralpatterns\\facade\\FacadeWater.java

package br.gov.fnde.designpatterns.structuralpatterns.facade;


public class FacadeWater {
    boolean waterIsBoiling;
    
    /**
     * @roseuid 418A86FB01C5
     */
    public FacadeWater() {
       setWaterIsBoiling(false);
       System.out.println("behold the wonderous water");     
    }
    
    /**
     * @roseuid 418A884E0203
     */
    public void boilFacadeWater() {
       setWaterIsBoiling(true);
       System.out.println("water is boiling");     
    }
    
    /**
     * @param isWaterBoiling
     * @roseuid 418A884E0213
     */
    public void setWaterIsBoiling(boolean isWaterBoiling) {waterIsBoiling = isWaterBoiling;     
    }
    
    /**
     * @return boolean
     * @roseuid 418A884E0251
     */
    public boolean getWaterIsBoiling() {return waterIsBoiling;     
    }
}
