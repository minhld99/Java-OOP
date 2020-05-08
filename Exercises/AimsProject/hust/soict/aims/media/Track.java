package hust.soict.aims.media;

public class Track implements Playable, Comparable<Object> {
	
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing track length: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	
	public int compareTo(Object obj) {
		Track tmp = (Track) obj;
		int iCompareTitle = this.getTitle().compareTo(tmp.getTitle());
		if (iCompareTitle == 0)
			return Integer.compare(this.getLength(), tmp.getLength());
		return iCompareTitle;
	}
	
}
