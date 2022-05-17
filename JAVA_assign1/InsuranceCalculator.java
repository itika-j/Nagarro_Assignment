package insurance;

public class InsuranceCalculator {
	public static void getResult(Car c) {
		// TODO Auto-generated method stub
		String Type = c.getType();
        Double Price = c.getPrice();
        System.out.println(Type);
        String Insurance = c.getInsurance();
        Const rate = new Const();
        double ans = 0;
        if(Type.equalsIgnoreCase("Hatchback"))
        {
            ans = Price * rate.Hatchback;
        }
        else if (Type.equalsIgnoreCase("Sedan")){
            ans = Price * rate.Sedan;
        }
        else if (Type.equalsIgnoreCase("SUV")){
            ans = Price * rate.SUV;
        }
        else {
        	System.out.println("**Wrong input type**");
        }
        
        if(Insurance.equalsIgnoreCase("Premium"))
        {
            ans += (0.2*ans);
        }
        System.out.println("--------Output--------");
        System.out.println("Car Type is: " + Type);
        System.out.println("Car Model is: " + c.getModel());
        System.out.println("Car Cost Price is: "+c.getPrice());
        System.out.println("Car Premium type is: "+c.getInsurance());
        System.out.println("Total insurance to be paid :: Rs. " + ans);
        System.out.println("----------------------");
	}
}
