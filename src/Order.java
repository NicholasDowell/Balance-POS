/**
 * The List of items the user has selected for purchase 
 * It holds a special type of item: OrderItem
 * @author Nick
 *
 */
public class Order {

	public OrderItem[] theOrder;
	private double balance;
	
	/**
	 * Adds the passed item to the current Order
	 * Also adds the cost of that item to the total cost(balance)
	 * @param newItem
	 */
	public void addItem(OrderItem newItem){
	}
	/**
	 * Removes one item at the passed index
	 */
	public Item removeItem(int index){
		return null;
	}
	
}
