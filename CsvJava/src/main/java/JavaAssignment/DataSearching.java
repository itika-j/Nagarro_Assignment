package JavaAssignment;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//import java.util.StringTokenizer;
import java.util.*;

class DataSearching {
	ArrayList<Model> list = new ArrayList<Model>();
	ArrayList<String> arr;
	DataView view = new DataView();

	public void searchData(String filename, String colr, String size, String gender)
			throws FileNotFoundException {
		Scanner sc = new Scanner(new File(filename));
		while (sc.hasNext()) {
			String line = sc.nextLine().toUpperCase().toString();
			if (!line.isEmpty()) {
				StringTokenizer token = new StringTokenizer(line, "|");
				arr = new ArrayList<>(line.length());
//				hi | hello
				while (token.hasMoreTokens()) {
					arr.add(token.nextToken());
				}
				if (arr.get(2).equals(colr) && arr.get(4).equals(size) && arr.get(3).equals(gender)) {
					Model model = new Model(arr.get(0), arr.get(1), arr.get(2), arr.get(3), arr.get(4),
							Float.parseFloat(arr.get(5)), Float.parseFloat(arr.get(6)), arr.get(7));
					list.add(model);
				}
			}
		}
	}
	
	/*preferenceSort on the 
	basic of price and rating*/
	
	public void preferenceSort(int enterChoice) {
		if (enterChoice == 1) {
			Collections.sort(list, new Comparator<Model>() {
				@Override
				public int compare(Model o1, Model o2) {
					return ((int) (o1.getPrice()));
				}
			});
		} else if (enterChoice == 2) {
			Collections.sort(list, new Comparator<Model>() {
				@Override
				public int compare(Model o1, Model o2) {
					return ((int) (o1.getRating()));
				}
			});
		} else {
			System.out.println("Wrong Choice Entered....Try Again!!.");
			return;
		}
		view.viewTShirt(list);
	}
}