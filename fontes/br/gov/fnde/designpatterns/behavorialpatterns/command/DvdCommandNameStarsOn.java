//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\command\\DvdCommandNameStarsOn.java

package br.gov.fnde.designpatterns.behavorialpatterns.command;

public class DvdCommandNameStarsOn extends CommandAbstract {
	private DvdName dvdName;

	/**
	 * @param dvdNameIn
	 * @roseuid 418AA17B0186
	 */
	public DvdCommandNameStarsOn(DvdName dvdNameIn) {
		this.dvdName = dvdNameIn;
	}

	/**
	 * @roseuid 418AA17B0271
	 */
	public void execute() {
		this.dvdName.setNameStarsOn();
		System.out.println(this.dvdName.toString());
	}
}
