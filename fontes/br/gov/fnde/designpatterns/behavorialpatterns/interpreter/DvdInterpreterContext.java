//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\interpreter\\DvdInterpreterContext.java

package br.gov.fnde.designpatterns.behavorialpatterns.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

public class DvdInterpreterContext {
    private ArrayList actors = new ArrayList ();
    private ArrayList titles = new ArrayList ();
    private ArrayList titlesAndActors = new ArrayList ();
    
    /**
     * @return java.util.ArrayList
     * @roseuid 418AABAF005D
     */
    public ArrayList getAllActors() {return actors;     
    }
    
    /**
     * @return java.util.ArrayList
     * @roseuid 418AABAE03C8
     */
    public ArrayList getAllTitles() {return titles;     
    }
    
    /**
     * @param actor
     * @roseuid 418AAF0802CE
     */
    public void addActor(String actor) {actors.add(actor);     
    }
    
    /**
     * @param title
     * @roseuid 418AAF080203
     */
    public void addTitle(String title) {titles.add(title);     
    }
    
    /**
     * @param titleAndActor
     * @roseuid 418AAF09000F
     */
    public void addTitleAndActor(TitleAndActor titleAndActor) {titlesAndActors.add(titleAndActor);     
    }
    
    /**
     * @param titleIn
     * @return java.util.ArrayList
     * @roseuid 418AAF090109
     */
    public ArrayList getActorsForTitle(String titleIn) {
       ArrayList actorsForTitle = new ArrayList();
       TitleAndActor tempTitleAndActor;
       ListIterator titlesAndActorsIterator = titlesAndActors.listIterator();
       while (titlesAndActorsIterator.hasNext())
       {
           tempTitleAndActor = (TitleAndActor)titlesAndActorsIterator.next();
           if (titleIn.equals(tempTitleAndActor.getTitle()))
           {
               actorsForTitle.add(tempTitleAndActor.getActor());           
           }
       }
       return actorsForTitle;     
    }
    
    /**
     * @param actorIn
     * @return java.util.ArrayList
     * @roseuid 418AAF090166
     */
    public ArrayList getTitlesForActor(String actorIn) {
       ArrayList titlesForActor = new ArrayList();
       TitleAndActor tempTitleAndActor;
       ListIterator actorsAndTitlesIterator = titlesAndActors.listIterator();
       while (actorsAndTitlesIterator.hasNext())
       {
           tempTitleAndActor = (TitleAndActor)actorsAndTitlesIterator.next();
           if (actorIn.equals(tempTitleAndActor.getActor()))
           {
               titlesForActor.add(tempTitleAndActor.getTitle());           
           }
       }
       return titlesForActor;     
    }
}
