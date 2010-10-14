//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\creationalpatterns\\singleton\\SingleSpoon.java

package br.gov.fnde.designpatterns.creationalpatterns.singleton;

import br.gov.fnde.designpatterns.Soup;

public class SingleSpoon {
    private static boolean isSpoonAvailable = true;
    private Soup soupLastUsedWith;
    private static SingleSpoon spoon;
    
    /**
     * @roseuid 418A52E600FA
     */
    private SingleSpoon() {
     
    }
    
    /**
     * @roseuid 418A53A70119
     */
    public void cleanSpoon() {
       this.setSoupLastUsedWith(null);     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.Soup
     * @roseuid 418A53A603B9
     */
    public Soup getSoupLastUsedWith() {
       return this.soupLastUsedWith;     
    }
    
    /**
     * @return br.gov.fnde.desingpatterns.creationalpatterns.singleton.SingleSpoon
     * @roseuid 418A53A602DE
     */
    public static SingleSpoon getSpoon() {
        if (isSpoonAvailable)
        {
            if (spoon == null)
            {
                spoon = new SingleSpoon();
            }
            isSpoonAvailable = false;
            return spoon;
        }
        else
        {
            return null;//spoon not available, could throw error or return null (as shown)
        }     
    }
    
    /**
     * @roseuid 418A53A6038A
     */
    public static void returnSpoon() {
        spoon.cleanSpoon();
        isSpoonAvailable = true;     
    }
    
    /**
     * @param soup
     * @roseuid 418A53A7004E
     */
    public void setSoupLastUsedWith(Soup soup) {
       this.soupLastUsedWith = soup;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418A53A6033C
     */
    public String toString() {
        return "Behold the glorious single spoon!";     
    }
}
