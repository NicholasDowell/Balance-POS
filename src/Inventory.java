import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Inventory holds the list of items that are available for purchase. Each Item is unique here.
 * @author Nick
 *
 */
public class Inventory {

	private final String saveFileName = "inventory";
	
	private Item[] itemsList = new Item[100];
	private int nextOpen = 0;
	/**
	 * adds a new item to the list of available items and increments the counter for the array's size
	 */
	public void addItem(Item newItem){
		itemsList[nextOpen] = newItem;
		nextOpen ++;
	}
	/**
	 * Saves the current inventory to the disk
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void save() throws FileNotFoundException, IOException{
		FileOutputStream outFile;
		ObjectOutputStream out;
		try{
			outFile = new FileOutputStream(saveFileName);
			out = new ObjectOutputStream(outFile);
			
			out.writeObject(itemsList);
			out.flush();
			out.close();
		}
		catch(IOException ioe){
			System.out.println("file not saved" + ioe.getMessage());
		}
	}
	/**
	 * retrieves a saved inventory from disk and sets this object's itemsList equal to it.
	 * (WARNING) Will remove any data currently stored in memory
	 * @throws ClassNotFoundException 
	 */
	public void load() throws ClassNotFoundException{
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(saveFileName));
			itemsList = (Item[])in.readObject();
			in.close();
		}
		catch (IOException ioe){
			System.out.println("NOOOOOO " + ioe.getMessage());
		}
		catch (ClassNotFoundException cnf){
			System.out.println(cnf.getMessage());
		}
		
	}
	/**
	 * displays info on the object in a convenient way
	 */
	public String toString(){
		String theString = "";
		for (int i = 0; i < nextOpen; i ++){
			theString += itemsList[nextOpen].getName();
		}
		return theString;
	}
	
}
