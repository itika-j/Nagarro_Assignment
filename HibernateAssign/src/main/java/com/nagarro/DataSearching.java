package com.nagarro;

import java.util.*;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;
import org.hibernate.query.Query;

public class DataSearching {
	public void searchData(String colr, String size, String gender, int enterChoice) {
		
		/*
		 * Fetching Records from databases and matching with user input
		 */
//		Dbs Records Fetching 
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory factory = cfg.buildSessionFactory();
			System.out.println(factory);
			Session session = factory.openSession();

			/*
			 * hql1=Sorted on the basis of price or rating (using sql order by)
			 */
			String choice="price";
			if(enterChoice==2) {
				choice="rating";
			}
			
			String hql = "from Tshirt t WHERE t.colour = :colr and t.gender_recommendation = :gender and t.size = :size order by t." + choice;
			Query query = session.createQuery(hql);
			query.setParameter("colr", colr);
			query.setParameter("gender", gender);
			query.setParameter("size", size);
			List li = query.list();
			Iterator it = li.iterator();

//Dispalying output
			System.out.println("\n----- T-SHIRT INFORMATION -----");
			System.out.println();
			System.out.println("ID | NAME | COLOUR | gender | SIZE | PRICE | RATING | AVAILABILITY");
				System.out.println();
				while (it.hasNext()) {
					Object o = (Object) it.next();
					Tshirt st = (Tshirt) o;
					System.out.print(st.getId());
					System.out.print(" | " + st.getName());
					System.out.print(" | " + st.getColour());
					System.out.print(" | " + st.getGender_recommendation());
					System.out.print(" | " + st.getSize());
					System.out.print(" | " + st.getPrice());
					System.out.print(" | " + st.getRating());
					System.out.println(" | " + st.getAvailability());
				}
			session.close();
			factory.close();

		} catch (Exception e) {
			System.out.println("Exception throws in database connection...!");
		}
	}
}
