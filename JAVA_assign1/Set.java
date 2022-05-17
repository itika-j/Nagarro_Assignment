package insurance;
import java.util.*;
public class Set {
	// Car c = new Car();

    public void getInfo(Car c)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car Model: ");
        String Model = sc.next();
        c.setModel(Model);
        
        System.out.println("Enter Car Type: ");
        String Type = sc.next();
        c.setType(Type);

        System.out.println("Enter Car Price: ");
        Double Price = sc.nextDouble();
        c.setPrice(Price);

        System.out.println("Enter Insurance Type : Basic or Premium: ");
        String Insurance = sc.next();
        c.setInsurance(Insurance);
    }

}
