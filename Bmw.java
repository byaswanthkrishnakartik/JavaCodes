package week1;
import java.util.*;

abstract class automobile
{
	 String model;
	 String price;
	 float mileage;
}
abstract class person_details extends automobile
{
	 String Name;
	 long phno;
	 String dob;
	 int age;
	 String address;
}
abstract class cars extends person_details
{
	 int hp;
	 int numberofseats;
	 String type;
}

class bike extends cars
{
	 int cc;
	 String type;
}
public class Bmw extends bike 

{
	public static void main(String[] args) {
		//scanner creation
		Scanner sc=new Scanner(System.in);
		//Object creation
		Bmw obj = new Bmw();	
		int ch;
		do {
			System.out.println("\n\n<---BMW Customer Portal--->");
			System.out.print("\n1.Buy Product\n2.Check Product status\n3.View all the detail of all the products present\n4.Exit\n");
			System.out.print("Enter your Choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Customer Name:");
				obj.Name=sc.next();
				System.out.println("Phone number:");
				obj.phno=sc.nextLong();
				System.out.println("Date  of Birth:");
				obj.dob=sc.next();
				System.out.println("Age:");
				obj.age=sc.nextInt();
				System.out.println("Address:");
				obj.address=sc.next();
				break;
			case 2:
				System.out.print("1.BMW X1\n2.BMW X5\n3.BMW X7\n");
				int choice;
				choice=sc.nextInt();
				if(choice==1) {
					System.out.print("Avialable");
				}
				else if(choice==2)
				{
					System.out.print("Available");
				}
				else if(choice==3)
				{
					System.out.print("Not available");
				}
				else
				{
					System.out.println("Enter valild choice");
				}
				
				break;
			case 3:
				System.out.print("--------BMW X1---------\nEngine\r\n"
						+ "	1995 cc - 1998 cc\r\n"
						+ "BHP\r\n"
						+ "	187.74 - 257.47 Bhp\r\n"
						+ "Seating Capacity\r\n"
						+ "	5\r\n"
						+ "Mileage\r\n"
						+ "	14.82 - 19.62 kmpl\r\n"
						+ "Fuel\r\n"
						+ "	Diesel/Petrol");
				System.out.print("-------BMW X5---------\nEngine\r\n"
						+ "	2993 cc - 2998 cc\r\n"
						+ "BHP\r\n"
						+ "	261.49 - 335.26 Bhp\r\n"
						+ "Seating Capacity\r\n"
						+ "	5\r\n"
						+ "Drive Type\r\n"
						+ "	AWD\r\n"
						+ "Mileage\r\n"
						+ "	11.24 - 13.38 kmpl\r\n"
						+ "Fuel\r\n"
						+ "	Diesel/Petrol");
				System.out.print("--------BMW X7----------\nEngine\r\n"
						+ "	2993 cc - 2998 cc\r\n"
						+ "BHP\r\n"
						+ "	261.5 - 394.26 Bhp\r\n"
						+ "Seating Capacity\r\n"
						+ "	7\r\n"
						+ "Drive Type\r\n"
						+ "	AWD\r\n"
						+ "Mileage\r\n"
						+ "	10.54 - 13.38 kmpl\r\n"
						+ "Fuel\r\n"
						+ "	Diesel/Petrol");
				break;
				
				}	
		}
		while(ch!=4);
		sc.close();
	}
}
