package hust.soict.ictglobal.aims;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Media {
	private String title;

	private String category;

	private float cost;

	/**
	 *  
	 */
	public Media() {
		super();
	}

	/**
	 * Returns the category.
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Returns the cost.
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * Returns the title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the category.
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Sets the cost.
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}

	/**
	 * Sets the title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public boolean equals(Object item) throws NullPointerException, ClassCastException {
		try {
			Media compare_item = (Media) item;
			if (this.getTitle().equals(compare_item.getTitle()) && this.cost == compare_item.cost) {
				return true;
			}
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}