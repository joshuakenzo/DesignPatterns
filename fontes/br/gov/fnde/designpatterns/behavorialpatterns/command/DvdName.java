//Source file: C:\\ProjetoFNDE\\SISTEMAS\\DesignPatterns\\fontes\\br\\gov\\fnde\\desingpatterns\\behavorialpatterns\\command\\DvdName.java

package br.gov.fnde.designpatterns.behavorialpatterns.command;

public class DvdName {
	private String titleName;

	/**
	 * @param titleName
	 * @roseuid 418AA1B702CE
	 */
	public DvdName(String titleName) {
		this.setTitleName(titleName);
	}

	/**
	 * @roseuid 418AA0BD00CB
	 */
	public DvdName() {

	}

	/**
	 * @return java.lang.String
	 * @roseuid 418AA1B80128
	 */
	public final String getTitleName() {
		return this.titleName;
	}

	/**
	 * @roseuid 418AA1B80232
	 */
	public void setNameStarsOff() {
		this.setTitleName(this.getTitleName().replace('*', ' '));
	}

	/**
	 * @roseuid 418AA1B801A5
	 */
	public void setNameStarsOn() {
		this.setTitleName(this.getTitleName().replace(' ', '*'));
	}

	/**
	 * @param titleNameIn
	 * @roseuid 418AA1B703D8
	 */
	public final void setTitleName(String titleNameIn) {
		this.titleName = titleNameIn;
	}

	/**
	 * @return java.lang.String
	 * @roseuid 418AA1B802AF
	 */
	public String toString() {
		return ("DVD: " + this.getTitleName());
	}
}
