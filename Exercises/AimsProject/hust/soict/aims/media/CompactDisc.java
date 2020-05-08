package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompactDisc extends Disc implements Playable, Comparable<Object> {

	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc() {
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getLength() {
		int length = 0;
		Track currentTrack;
		Iterator<Track> iter = tracks.iterator();
		while (iter.hasNext()) {
			currentTrack = (Track) (iter.next());
			length += currentTrack.getLength();
		}
		return length;
	}

	public void setLength(int length) {
	}
	
	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}

	public void addTrack(Track input_track) {
		if (!(tracks.contains(input_track))) {
			tracks.add(input_track);
		}
	}
	
	public void removeTrack(Track input_track) {
		if ((tracks.contains(input_track))) {
			tracks.remove(input_track);
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		Track currentTrack;
		Iterator<Track> iter = tracks.iterator();
		while (iter.hasNext()) {
			currentTrack = (Track) (iter.next());
			currentTrack.play();
		}
	}
	
	public int compareTo(Object obj) {
		CompactDisc tmp = (CompactDisc) obj;
		int iCompareTitle = this.getTitle().compareTo(tmp.getTitle());
		if (iCompareTitle == 0)
			return Integer.compare(this.getLength(), tmp.getLength());
		return iCompareTitle;
	}

}
