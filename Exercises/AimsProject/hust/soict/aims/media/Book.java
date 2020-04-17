package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		// TODO Auto-generated constructor stubost
		super();
	}
	
	public Book(String title) {
		super(title);
	}
	
	public Book(String title, String category) {
		super(title, category);
	}
	
	public Book(String title, String category, List<String> authors) {
		super(title, category);
		this.authors = authors;
	}
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		// ensure that the author is not already in
		// the ArrayList before adding 
		if (!(authors.contains(authorName))) {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		// ensure that the author is present in the
		// ArrayList before removing 
		if ((authors.contains(authorName))) {
			authors.remove(authorName);
		}
	}
}
