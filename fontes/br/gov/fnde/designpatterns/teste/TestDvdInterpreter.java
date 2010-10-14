//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestDvdInterpreter.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.behavorialpatterns.interpreter.DvdInterpreterClient;
import br.gov.fnde.designpatterns.behavorialpatterns.interpreter.DvdInterpreterContext;
import br.gov.fnde.designpatterns.behavorialpatterns.interpreter.TitleAndActor;

/**
 * Define a macro language and syntax, parsing input into objects which perform 
 * the correct opertaions.
 * Notes:
 * The above example shows a simple macro language, to which input is parsed and 
 * handled. 
 * However, as it does not use both Terminal and Nontermianl Expressions as shown 
 * in the GoF interpreter UML. 
 * So, this example probably isn't 100 compliant with the GoF standard Interpreter.
 */
public class TestDvdInterpreter {
    
    /**
     * @param args
     * @roseuid 418AB07A032B
     */
    public static void main(String[] args) {
       DvdInterpreterContext dvdInterpreterContext = new DvdInterpreterContext();
       dvdInterpreterContext.addTitle("Caddy Shack");
       dvdInterpreterContext.addTitle("Training Day");    
       dvdInterpreterContext.addTitle("Hamlet");       
       
       dvdInterpreterContext.addActor("Ethan Hawke");         
       dvdInterpreterContext.addActor("Denzel Washington"); 
       
       dvdInterpreterContext.addTitleAndActor(new TitleAndActor("Hamlet", "Ethan Hawke"));
       dvdInterpreterContext.addTitleAndActor(new TitleAndActor("Training Day", "Ethan Hawke"));  
       dvdInterpreterContext.addTitleAndActor(new TitleAndActor("Caddy Shack", "Ethan Hawke"));         
       dvdInterpreterContext.addTitleAndActor(new TitleAndActor("Training Day", "Denzel Washington"));         
       
       DvdInterpreterClient dvdInterpreterClient = new DvdInterpreterClient(dvdInterpreterContext);
       
       System.out.println("interpreting show actor: " + dvdInterpreterClient.interpret("show actor"));
//       System.out.println("interpreting show actor for title : " + dvdInterpreterClient.interpret("show actor for title "));       
       System.out.println("interpreting show title: " + dvdInterpreterClient.interpret("show title")); 
//       System.out.println("interpreting show title for actor : " + dvdInterpreterClient.interpret("show title for actor "));     
    }
}
