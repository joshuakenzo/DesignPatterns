//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\teste\\TestState.java

package br.gov.fnde.designpatterns.teste;

import br.gov.fnde.designpatterns.behavorialpatterns.state.DvdStateContext;

/**
 * An object appears to change its' class when the class it passes calls through 
 * to switches itself for a related class.
 */
public class TestState {
    
    /**
     * @param args
     * @roseuid 418BB9FB0105
     */
    public static void main(String[] args) {
       DvdStateContext stateContext = new DvdStateContext();
       stateContext.showName("Sponge Bob Squarepants - Nautical Nonsense and Sponge Buddies"); 
       stateContext.showName("Jay and Silent Bob Strike Back");  
       stateContext.showName("Buffy The Vampire Slayer Season 2");
       stateContext.showName("The Sopranos Season 2");     
    }
}
