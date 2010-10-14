//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\command\\DvdCommandNameStarsOff.java

package br.gov.fnde.designpatterns.behavorialpatterns.command;

public class DvdCommandNameStarsOff extends CommandAbstract {
	private DvdName dvdName;

	/**
	 * @param dvdNameIn
	 * @roseuid 418AA203031C
	 */
	public DvdCommandNameStarsOff(DvdName dvdNameIn) {
		this.dvdName = dvdNameIn;
	}

	/**
	 * @roseuid 418AA2040000
	 */
	public void execute() {
		this.dvdName.setNameStarsOff();
		System.out.println(this.dvdName.toString());
	}
}
