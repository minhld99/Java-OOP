package hust.soict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable, Comparable<Object> {

	private String director;

	private int length;

	/**
	 * Constructor for DigitalVideoDisc
	 */
	public DigitalVideoDisc() {
		super();
	} 

	/**
	 * @return Returns the director.
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director
	 *            The director to set.
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return Returns the length.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            The length to set.
	 */
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	public int compareTo(Object obj) {
		DigitalVideoDisc tmp = (DigitalVideoDisc) obj;
		int iCompareTitle = this.getTitle().compareTo(tmp.getTitle());
		if (iCompareTitle == 0)
			return Integer.compare(this.getLength(), tmp.getLength());
		return iCompareTitle;
	}
}