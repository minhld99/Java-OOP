package hust.soict.aims.media;

import java.util.Scanner;

public class Aims {

	public Aims() {
		super();
	}

	static Order anOrder = new Order();
	private static Scanner sc;
	private static Scanner sc2;
	
	public static void main(String[] args) {
		// Create a new Order object
		// MemoryDaemon daemon = new MemoryDaemon();
		// Thread thread = new Thread(daemon);
		// thread.setDaemon(true);
		// thread.start();
		// showMenu();
		// System.out.println("Total Cost = " + anOrder.totalCost());
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc();
		dvd1.setTitle("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc();
		dvd2.setTitle("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc();
		dvd3.setTitle("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		
		java.util.Collection collection = new java.util.ArrayList();
		collection.add(dvd2);
		collection.add(dvd1);
		collection.add(dvd3);
		
		java.util.Iterator iterator = collection.iterator();
		
		System.out.println("-------------------------------------");
		System.out.println("The DVDs currently in the order are: ");
		
		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		
		java.util.Collections.sort((java.util.List)collection);
		
		iterator = collection.iterator()
;
		System.out.println("-------------------------------------");
		System.out.println("The DVDs in sorted order are: ");
		
		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		
		System.out.println("--------------------------------------");
	}
	
	
	public static void showMenu() {
		sc2 = new Scanner(System.in);
		while (true) {
			System.out.println("-----------------Menu-----------------");
			System.out.println("1. Add new item"); 
			System.out.println("2. Quit"); 
			switch(Integer.parseInt(sc2.nextLine())) {
			case 1:
				System.out.println("----------Add new item----------"); 
				System.out.println("1. Add new Book"); 
				System.out.println("2. Add new CD"); 
				System.out.println("3. Add new DVD");
				System.out.println("4. Cancel");
				switch(Integer.parseInt(sc2.nextLine())) {
				case 1: addBook(); break;
				case 2: addCD(); break;
				case 3: addDVD(); break;
				case 4: continue;
				default: return;
				}
				break;
			case 2: 
				System.out.println("-----------------End-----------------"); 
				return;
			default: continue;
			}
		}
	}

	public static void addBook() {
		System.out.println("---------Add Book----------");
		Book book = new Book();
		sc = new Scanner(System.in); 
		System.out.println("Book Title?"); 
		book.setTitle(sc.nextLine());
		System.out.println("Book Category?"); 
		book.setCategory(sc.nextLine());
		while(true) {
			System.out.println("Add new Author? (1:Yes / 0:No)");
			if (Integer.parseInt(sc.nextLine()) == 1) book.addAuthor(sc.nextLine());
			else break;
		}
		System.out.println("Book Cost?");
		book.setCost(Integer.parseInt(sc.nextLine()));
		anOrder.addMedia(book);
		System.out.println("---New Book Added Successful---");
	}
	
	public static void addCD() {
		System.out.println("--------Add CD---------");
		CompactDisc cd = new CompactDisc();
		sc = new Scanner(System.in); 
		System.out.println("CD Title?"); 
		cd.setTitle(sc.nextLine());
		System.out.println("CD Category?"); 
		cd.setCategory(sc.nextLine());
		System.out.println("CD Artist?"); 
		cd.setArtist(sc.nextLine());
		while(true) {
			System.out.println("Add new track? (1:Yes / 0:No)");
			int c = Integer.parseInt(sc.nextLine());
			if (c == 1) {
				Track newTrack = new Track();
				System.out.println("Track Title?"); 
				newTrack.setTitle(sc.nextLine());
				System.out.println("Track Length?"); 
				newTrack.setLength(Integer.parseInt(sc.nextLine()));
				cd.addTrack(newTrack);
			}
			else break;
		}
		System.out.println("CD Cost?");
		cd.setCost(Integer.parseInt(sc.nextLine()));
		System.out.println("Want to play this CD? (1:Yes / 0:No)");
		if (Integer.parseInt(sc.nextLine()) == 1) cd.play();
		anOrder.addMedia(cd);
		System.out.println("---New CD Added Successful---");
	}
	
	public static void addDVD() {
		System.out.println("--------Add DVD---------");
		DigitalVideoDisc dvd = new DigitalVideoDisc();
		sc = new Scanner(System.in); 
		System.out.println("DVD Title?"); 
		dvd.setTitle(sc.nextLine());
		System.out.println("DVD Category?"); 
		dvd.setCategory(sc.nextLine());
		System.out.println("DVD Director?"); 
		dvd.setDirector(sc.nextLine());
		System.out.println("DVD Length?"); 
		dvd.setLength(Integer.parseInt(sc.nextLine()));
		System.out.println("DVD Cost?");
		dvd.setCost(Integer.parseInt(sc.nextLine()));
		System.out.println("Want to play this DVD? (1:Yes / 0:No)");
		if (Integer.parseInt(sc.nextLine()) == 1) dvd.play();
		anOrder.addMedia(dvd);
		System.out.println("---New DVD Added Successful---");
	}
}