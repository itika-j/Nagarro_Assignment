package JavaAssignment;
import java.util.ArrayList;

class DataView {
	public void viewTShirt(ArrayList<Model> list) {
		System.out.println("\n----- T-SHIRT INFORMATION -----");
		System.out.println();
		System.out.println("ID | NAME | COLOUR | gender | SIZE | PRICE | RATING | AVAILABILITY|");
		for (Model f : list) {
			System.out.print(f.getID());
			System.out.print(" | " + f.getName());
			System.out.print(" | " + f.getColour());
			System.out.print(" | " + f.getgender());
			System.out.print(" | " + f.getSize());
			System.out.print(" | " + f.getPrice());
			System.out.print(" | " + f.getRating());
			System.out.println(" | " + f.getAvailability() + "|");
			System.out.println("----------------------");
		}
		if (list.isEmpty()) {
			System.out.println("T-Shirt Not Available.");
		}
	}
}