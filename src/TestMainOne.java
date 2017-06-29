import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * idk lol.
 *
 */
public class TestMainOne {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Inventory inv = new Inventory();
		inv.load();
		System.out.println(inv);
		
		inv.save();
		System.out.println("closing program");
	}
}
