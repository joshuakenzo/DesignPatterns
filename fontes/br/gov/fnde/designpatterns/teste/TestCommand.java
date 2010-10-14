//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestCommand.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.behavorialpatterns.command.CommandAbstract;
import br.gov.fnde.designpatterns.behavorialpatterns.command.DvdCommandNameStarsOff;
import br.gov.fnde.designpatterns.behavorialpatterns.command.DvdCommandNameStarsOn;
import br.gov.fnde.designpatterns.behavorialpatterns.command.DvdName;

/**
 * An object encapsulates everything needed to execute a method in another object.
 */
public class TestCommand {
    
    /**
     * @param args
     * @roseuid 418AA26A038A
     */
    public static void main(String[] args) {
    	// classe com alguns metódos a serem encapsulados
    	// a regra está dentro das classes
       DvdName jayAndBob = new DvdName("Jay and Silent Bob Strike Back");
       DvdName spongeBob = new DvdName("Sponge Bob Squarepants - Nautical Nonsense and Sponge Buddies"); 
       System.out.println("as first instantiated");    
       //comportamento normal
       System.out.println(jayAndBob.toString());  
       System.out.println(spongeBob.toString());
       
       //setting up four "clients" of the Concrete Commands
       //Command tem o execute e sua implementações desaclopam a chamada da regra	
       CommandAbstract bobStarsOn = new     DvdCommandNameStarsOn(jayAndBob);
       CommandAbstract bobStarsOff = new    DvdCommandNameStarsOff(jayAndBob);         
       CommandAbstract spongeStarsOn = new  DvdCommandNameStarsOn(spongeBob);      
       CommandAbstract spongeStarsOff = new DvdCommandNameStarsOff(spongeBob);
       
       System.out.println("");
       //invoke the request
       
       //bobStarsOn.execute();
       //bobStarsOff.execute();
       //spongeStarsOn.execute();
       //spongeStarsOff.execute();
       
       
       TestCommand tc = new TestCommand();
       tc.teste0(jayAndBob, spongeBob);
       //tc.teste1(jayAndBob, spongeBob);
       //command geralmente implementado
      // tc.teste2(bobStarsOn);
      // tc.teste2(bobStarsOff);
      // tc.teste2(spongeStarsOn);
       //tc.teste2(spongeStarsOff);

    }
    
    public void teste0(DvdName jayAndBob, DvdName spongeBob){
    	// a cada novo objeto tenho que fazer chamada(s) manualmente
        jayAndBob.setNameStarsOn();
        jayAndBob.setNameStarsOff();
        spongeBob.setNameStarsOn();
        spongeBob.setNameStarsOff();
    }
    
    public void teste01(CommandAbstract command){
    	//executa a regra de um objeto por outro
    	command.execute();
    }    
    
    public void teste2(CommandAbstract command){
    	// uma classe é responsável pela chamada dos objetos
    	// a regra fica nos objetos.
        System.out.println(" ");         
        System.out.println("Command Name "+command.getClass().getSimpleName());    
    	command.execute();
    }    
    
    
    public void teste1(DvdName jayAndBob, DvdName spongeBob){
        //invoke the request
        //bobStarsOn.execute();
        jayAndBob.setNameStarsOn();
        //System.out.println(" ");         
        System.out.println("bobStarsOn on");       
        System.out.println(jayAndBob.toString());  
        System.out.println(spongeBob.toString());  
        
        //bobStarsOff.execute();
        jayAndBob.setNameStarsOff();
        //System.out.println(" ");         
        System.out.println("bobStarsOff off");       
        System.out.println(jayAndBob.toString());  
        System.out.println(spongeBob.toString());       
        
        //spongeStarsOn.execute();
        spongeBob.setNameStarsOn();
        //System.out.println(" ");         
        System.out.println("spongeStarsOn on");       
        System.out.println(jayAndBob.toString());  
        System.out.println(spongeBob.toString());  
        
        //invoke the request       
        //spongeStarsOff.execute();
        spongeBob.setNameStarsOff();
        //System.out.println(" ");        
        System.out.println("sponge stars off");       
        System.out.println(jayAndBob.toString());  
        System.out.println(spongeBob.toString());   
        
    }
    

}
