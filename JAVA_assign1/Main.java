package insurance;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char chr = 0;
	       do {
	    	   try{
		            Set s = new Set();
		            InsuranceCalculator calc = new InsuranceCalculator();
		            Car c = new Car();
		            s.getInfo(c);
		            calc.getResult(c);
		            System.out.print("Do you want to enter details of any other car (y/n): ");
		            chr  = sc.next().charAt(0);
		        }
	    	   
		        catch (Exception e)
		        {
		            System.out.println("Please Enter a Valid Input");
		        }
	    	   
	       }while(chr=='y');
	        
	}

}
