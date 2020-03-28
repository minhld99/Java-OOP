import java.util.Date;

public class Order {
	
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	private static int nbOrders = 0;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	private Date dateOrdered;
	
	public Date getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (getQtyOrdered() < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered++] = disc;
		}
	}
	// overloading 1
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		int j = 0;
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++)
			if (itemsOrdered[i] == null) {
				itemsOrdered[i] = dvdList[j++];
				qtyOrdered++;
			}
	}
	// overloading 2
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (getQtyOrdered() < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered++] = dvd1;
			if (getQtyOrdered() < MAX_NUMBERS_ORDERED) {
				itemsOrdered[qtyOrdered++] = dvd2;				
			}
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (getQtyOrdered() > 0)
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
					// shifting element to the left
					for(int j = i; j < qtyOrdered; j++)
						itemsOrdered[j] = itemsOrdered[j+1];
					qtyOrdered--;
				}
			}
	}
	public float totalCost() {
		float sum = 0;
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++)
			if (itemsOrdered[i] != null)
				sum += itemsOrdered[i].getCost();
		return sum;
	}
	
}
