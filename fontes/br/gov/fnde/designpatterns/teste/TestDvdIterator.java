//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestDvdIterator.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.behavorialpatterns.iterator.DvdList;
import br.gov.fnde.designpatterns.behavorialpatterns.iterator.DvdListIterator;

/**
 * One object can traverse all of the elements of another object.
 */
public class TestDvdIterator {
    
    /**
     * @param args
     * @roseuid 418ABCBF037A
     */
    public static void main(String[] args) {
       DvdList fiveShakespeareMovies = new DvdList();
       fiveShakespeareMovies.append("10 Things I Hate About You");
       fiveShakespeareMovies.append("Shakespeare In Love");       
       fiveShakespeareMovies.append("O (2001)");       
       fiveShakespeareMovies.append("American Pie 2");       
       fiveShakespeareMovies.append("Scotland, PA.");              
       fiveShakespeareMovies.append("Hamlet (2000)");                 
             
       DvdListIterator fiveShakespeareIterator = fiveShakespeareMovies.createIterator();
       while (!fiveShakespeareIterator.isDone())
       {
           System.out.println(fiveShakespeareIterator.currentItem());
           fiveShakespeareIterator.next();  
       }
       
       fiveShakespeareMovies.delete("American Pie 2");
       
       System.out.println(" ");   
       fiveShakespeareIterator.first();       
       while (!fiveShakespeareIterator.isDone())
       {
           System.out.println(fiveShakespeareIterator.currentItem());
           fiveShakespeareIterator.next();  
       }     
    }
}
