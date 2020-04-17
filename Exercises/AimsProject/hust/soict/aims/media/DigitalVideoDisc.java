package hust.soict.aims.media;

public class DigitalVideoDisc extends Media {

	private String director;

	private int length;

	/**
	 * Constructor for DigitalVideoDisc
	 */
	public DigitalVideoDisc() {
		super();
	}
	
	public DigitalVideoDisc(String title) {
		super(title);
	}
	
	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}
	
	public DigitalVideoDisc(String title, String category, String director) {
		super(title, category);
		this.director = director;
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
}