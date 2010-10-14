//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestDvdMemento.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.behavorialpatterns.memento.DvdDetails;

import java.util.ArrayList;

/**
 * One object stores another objects state.
 * Notes:
 * I used an inner class for the Memento because it could access everything in the 
 * Originator without breaking any encapsulation. In his book "Java Design 
 * Patterns" James W. Cooper sets up with a Memento in the same package as the 
 * Originator. Both certainly seem ok to me, and depending on you needs either 
 * might work best for you. 
 * Special thanks to Aaron from Brooklyn who pointed out flaws in my first version 
 * of this pattern.
 */
public class TestDvdMemento {
    
    /**
     * @param args
     * @roseuid 418AC0AA007C
     */
    public static void main(String[] args) {
       DvdDetails.DvdMemento dvdMementoCaretaker;  //the Caretaker
       
       ArrayList stars = new ArrayList();
       stars.add(new String("Guy Pearce"));
       DvdDetails dvdDetails = new DvdDetails("Memento", stars, '1'); 
       dvdMementoCaretaker = dvdDetails.createDvdMemento();       
       System.out.println("as first instantiated");       
       System.out.println(dvdDetails.formatDvdDetails());       
       
       System.out.println("");       
       dvdDetails.addStar("edskdzkvdfb");  //oops - Cappuccino on the keyboard!
       System.out.println("after star added incorrectly");          
       System.out.println(dvdDetails.formatDvdDetails());
       
       System.out.println(""); 
       System.out.println("the memento");
       System.out.println(dvdMementoCaretaker.showMemento());   //show the memento     
       
       System.out.println("");
       dvdDetails.setDvdMemento(dvdMementoCaretaker);   //back off changes
       System.out.println("after DvdMemento state is restored to DvdDetails");        
       System.out.println(dvdDetails.formatDvdDetails());     
    }
}
