//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\observer\\DvdRelease.java

package br.gov.fnde.designpatterns.behavorialpatterns.observer;


public class DvdRelease {
    private String dvdName;
    private int dvdReleaseDay;
    private int dvdReleaseMonth;
    private int dvdReleaseYear;
    private String serialNumber;
    
    /**
     * @param serialNumber
     * @param dvdName
     * @param dvdReleaseYear
     * @param dvdReleaseMonth
     * @param dvdReleaseDay
     * @roseuid 418B774F02F9
     */
    public DvdRelease(String serialNumber, String dvdName, int dvdReleaseYear, int dvdReleaseMonth, int dvdReleaseDay) {
       setSerialNumber(serialNumber);
       setDvdName(dvdName);
       setDvdReleaseYear(dvdReleaseYear);
       setDvdReleaseMonth(dvdReleaseMonth);
       setDvdReleaseDay(dvdReleaseDay);     
    }
    
    /**
     * @roseuid 418B6B9D0395
     */
    public DvdRelease() {
     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418B77500134
     */
    public String getDvdName() {return this.dvdName;     
    }
    
    /**
     * @return int
     * @roseuid 418B7750021E
     */
    public int getDvdReleaseDay() {return this.dvdReleaseDay;     
    }
    
    /**
     * @return int
     * @roseuid 418B775001D0
     */
    public int getDvdReleaseMonth() {return this.dvdReleaseMonth;     
    }
    
    /**
     * @return int
     * @roseuid 418B77500182
     */
    public int getDvdReleaseYear() {return this.dvdReleaseYear;     
    }
    
    /**
     * @return java.lang.String
     * @roseuid 418B775000D6
     */
    public String getSerialNumber() {return this.serialNumber;     
    }
    
    /**
     * @param dvdNameIn
     * @roseuid 418B775000F6
     */
    public void setDvdName(String dvdNameIn) {this.dvdName = dvdNameIn;     
    }
    
    /**
     * @param dvdReleaseDayIn
     * @roseuid 418B775001E0
     */
    public void setDvdReleaseDay(int dvdReleaseDayIn) {this.dvdReleaseDay = dvdReleaseDayIn;     
    }
    
    /**
     * @param dvdReleaseMonthIn
     * @roseuid 418B77500192
     */
    public void setDvdReleaseMonth(int dvdReleaseMonthIn) {this.dvdReleaseMonth = dvdReleaseMonthIn;     
    }
    
    /**
     * @param dvdReleaseYearIn
     * @roseuid 418B77500144
     */
    public void setDvdReleaseYear(int dvdReleaseYearIn) {this.dvdReleaseYear = dvdReleaseYearIn;     
    }
    
    /**
     * @param serialNumberIn
     * @roseuid 418B775000A7
     */
    public void setSerialNumber(String serialNumberIn) {this.serialNumber = serialNumberIn;     
    }
    
    /**
     * @param serialNumber
     * @param dvdName
     * @param dvdReleaseYear
     * @param dvdReleaseMonth
     * @param dvdReleaseDay
     * @roseuid 418B774F0395
     */
    public void updateDvdRelease(String serialNumber, String dvdName, int dvdReleaseYear, int dvdReleaseMonth, int dvdReleaseDay) {
       setSerialNumber(serialNumber);
       setDvdName(dvdName);
       setDvdReleaseYear(dvdReleaseYear);
       setDvdReleaseMonth(dvdReleaseMonth);
       setDvdReleaseDay(dvdReleaseDay);     
    }
    
    /**
     * @param dvdReleaseYear
     * @param dvdReleaseMonth
     * @param dvdReleaseDay
     * @roseuid 418B7750004A
     */
    public void updateDvdReleaseDate(int dvdReleaseYear, int dvdReleaseMonth, int dvdReleaseDay) {
       setDvdReleaseYear(dvdReleaseYear);
       setDvdReleaseMonth(dvdReleaseMonth);
       setDvdReleaseDay(dvdReleaseDay);     
    }
}
