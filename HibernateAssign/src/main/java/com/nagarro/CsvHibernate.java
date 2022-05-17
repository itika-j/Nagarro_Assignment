package com.nagarro;

import java.util.*;
import javax.persistence.Query;
import javax.transaction.Transaction;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class CsvHibernate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String colr, size, gender;
		int enterChoice;

		System.out.print("Enter Colour Of The T-Shirt : ");
		colr = sc.nextLine().toUpperCase();
		System.out.print("Enter Size Of T-Shirt : ");
		size = sc.nextLine().toUpperCase();
		System.out.print("Enter Gender:(M/F/U) : ");
		gender = sc.nextLine().toUpperCase();
		System.out.print(
				"Enter Output Preference : 1. Sorted by Price \t 2. Sorted by Rating \nEnter Preference Choice (1/2) : ");
		enterChoice = sc.nextInt();

//		DataSearching object
		DataSearching ds = new DataSearching();
		ds.searchData(colr, size, gender, enterChoice);
	}
}
