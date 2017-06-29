import java.io.Serializable;

/**
 * Item stores the basic data for one item available for purchase.
 * @author Nick
 *
 */
public class Item implements Serializable{

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	private String name;
	private double cost;
	
	/**
	 * makes a new item
	 */
	public Item (String newName, double newCost){
		
	}
}
