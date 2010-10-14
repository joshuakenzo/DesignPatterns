//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\iterator\\DvdListIterator.java

package br.gov.fnde.designpatterns.behavorialpatterns.iterator;


public interface DvdListIterator {
    
    /**
     * @roseuid 418AB5C700F9
     */
    public void first();
    
    /**
     * @roseuid 418AB5C70109
     */
    public void next();
    
    /**
     * @return boolean
     * @roseuid 418AB5C70147
     */
    public boolean isDone();
    
    /**
     * @return java.lang.String
     * @roseuid 418AB5C701A5
     */
    public String currentItem();
}
