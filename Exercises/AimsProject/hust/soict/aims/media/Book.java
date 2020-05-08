package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Book extends Media implements Comparable<Object> {
	private List<String> authors = new ArrayList<String>();
	private String content;
	private List<String> contentTokens = new ArrayList<String>();
	private Map<String, Integer> wordFrequency = new HashMap<String, Integer>();
	
	public Book() {
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
	
	public int compareTo(Object obj) {
		Book tmp = (Book) obj;
		return this.getTitle().toLowerCase().compareTo(tmp.getTitle().toLowerCase());
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void processContent(String content) {
		this.setContent(content);
		StringTokenizer st = new StringTokenizer(content, " ([.,!?:;'\"-]|\\)+");
        while (st.hasMoreTokens()) {
        	String token = st.nextToken();
            contentTokens.add(token);
            if (!wordFrequency.containsKey(token))  // first time we've seen this string
                wordFrequency.put(token, 1);
            else {
            	int count = wordFrequency.get(token);
                wordFrequency.put(token, count + 1);
            }
        }
        Collections.sort(contentTokens);
	}
	
	public String toString() {
		System.out.println("---------Book Information-----------");
		System.out.println("- Title: " + this.getTitle());
		System.out.println("- Catogory: " + this.getCategory());
		System.out.println("- Cost: " + this.getCost());
		System.out.println("- Author: " + this.getAuthors());
		System.out.println("- Content: " + this.content);
		System.out.println("- Content Length: " + this.contentTokens.size());
		System.out.println("- Content Token in sorted order: " + this.contentTokens);
		System.out.println("- Token List & Frequency: ");
		wordFrequency.forEach((key, value) -> System.out.println("\t" + key + ": \t" + value));
		System.out.println("------------------------------------");
		return content;
	}
}
