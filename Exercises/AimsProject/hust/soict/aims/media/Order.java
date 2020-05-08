package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order {

	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	/**
	 *  
	 */
	public Order() {
		super();
	}
	
	public void addMedia(Media item) {
		if (!(itemsOrdered.contains(item))) {
			itemsOrdered.add(item);
		}
	}
	
	public void removeMedia(Media item) {
		if (itemsOrdered.contains(item)) {
			itemsOrdered.remove(item);
		}
	}
	public float totalCost() {
		float total = 0;
		Media mediaItem;
		Iterator<Media> iter = itemsOrdered.iterator();
		while (iter.hasNext()) {
			mediaItem = (Media) (iter.next());
			total += mediaItem.getCost();
		}
		return total;
	}
}