//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\SoupBuffet.java

package br.gov.fnde.designpatterns;


public class SoupBuffet {
    String soupBuffetName;
    ChickenSoup chickenSoup;
    ClamChowder clamChowder;
    FishChowder fishChowder;
    Minnestrone minnestrone;
    PastaFazoule pastafazoule;
    TofuSoup tofuSoup;
    VegetableSoup vegetableSoup;
    
    /**
     * @return java.lang.String
     * @roseuid 4182CE1A0364
     */
    public String getSoupBuffetName() {return soupBuffetName;     
    }
    
    /**
     * @param soupBuffetNameIn
     * @roseuid 4182CE1A03C2
     */
    public void setSoupBuffetName(String soupBuffetNameIn) {soupBuffetName = soupBuffetNameIn;     
    }
    
    /**
     * @param chickenSoupIn
     * @roseuid 4182CE1B00A5
     */
    public void setChickenSoup(ChickenSoup chickenSoupIn) {chickenSoup = chickenSoupIn;     
    }
    
    /**
     * @param clamChowderIn
     * @roseuid 4182CE1B01AF
     */
    public void setClamChowder(ClamChowder clamChowderIn) {clamChowder = clamChowderIn;     
    }
    
    /**
     * @param fishChowderIn
     * @roseuid 4182CE1B028A
     */
    public void setFishChowder(FishChowder fishChowderIn) {fishChowder = fishChowderIn;     
    }
    
    /**
     * @param minnestroneIn
     * @roseuid 4182CE1B0345
     */
    public void setMinnestrone(Minnestrone minnestroneIn) {minnestrone = minnestroneIn;     
    }
    
    /**
     * @param pastafazouleIn
     * @roseuid 4182CE1C0038
     */
    public void setPastafazoule(PastaFazoule pastafazouleIn) {pastafazoule = pastafazouleIn;     
    }
    
    /**
     * @param tofuSoupIn
     * @roseuid 4182CE1C0122
     */
    public void setTofuSoup(TofuSoup tofuSoupIn) {tofuSoup = tofuSoupIn;     
    }
    
    /**
     * @param vegetableSoupIn
     * @roseuid 4182CE1C01DE
     */
    public void setVegetableSoup(VegetableSoup vegetableSoupIn) {vegetableSoup = vegetableSoupIn;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 4182CE1C02E7
     */
    public String getTodaysSoups() {
        StringBuffer stringOfSoups = new StringBuffer();
        stringOfSoups.append(" Today's Soups!  ");
        stringOfSoups.append(" Chicken Soup: ");        
        stringOfSoups.append(this.chickenSoup.getSoupName()); 
        stringOfSoups.append(" Clam Chowder: ");        
        stringOfSoups.append(this.clamChowder.getSoupName()); 
        stringOfSoups.append(" Fish Chowder: ");        
        stringOfSoups.append(this.fishChowder.getSoupName()); 
        stringOfSoups.append(" Minnestrone: ");        
        stringOfSoups.append(this.minnestrone.getSoupName()); 
        stringOfSoups.append(" Pasta fazul: ");        
        stringOfSoups.append(this.pastafazoule.getSoupName());         
        stringOfSoups.append(" Tofu Soup: ");        
        stringOfSoups.append(this.tofuSoup.getSoupName());         
        stringOfSoups.append(" Vegetable Soup: ");        
        stringOfSoups.append(this.vegetableSoup.getSoupName());         
        return stringOfSoups.toString();     
    }
}
