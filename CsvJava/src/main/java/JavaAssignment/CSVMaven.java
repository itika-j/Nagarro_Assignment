package JavaAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CSVMaven {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		String colr, size, gender;
		int enterChoice;

		System.out.print("Enter Colour Of The T-Shirt : ");
		colr = sc.nextLine().toUpperCase();
		System.out.print("Enter Size Of T-Shirt : ");
		size = sc.nextLine().toUpperCase();
		System.out.print("Enter Gender:(M/F/U) : ");
		gender = sc.nextLine().toUpperCase();
		System.out.print("Enter Output Preference : 1. Sorted by Price \t 2. Sorted by Rating \nEnter Preference Choice (1/2) : ");
		enterChoice = sc.nextInt();
		
		DataSearching fc = new DataSearching();

		fc.searchData("DataCSV\\Puma.csv", colr, size, gender);
		fc.searchData("DataCSV\\Nike.csv", colr, size, gender);
		fc.searchData("DataCSV\\Adidas.csv", colr, size, gender);
		fc.preferenceSort(enterChoice);
	}
}
