package airplane1;

import java.util.Scanner;

public class Procedural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String tailNumber;
		System.out.println("Enter the tailNumber: ");
		tailNumber = input.next();
		
		int NumberOfWheels;
		System.out.println("Enter the NumberOfWheels: ");
		NumberOfWheels = input.nextInt();
		
		int NumberOfPassengers;
		System.out.println("Enter the NumberOfPassengers: ");
		NumberOfPassengers = input.nextInt();
		
		double speed;
		System.out.println("Enter the speed: ");
		speed = input.nextDouble();
		
		if(tailNumber.equals("cis") && NumberOfWheels==3 && NumberOfPassengers==4 && speed==90) {
			System.out.println("cisna");
		}
		else if(tailNumber.equals("737") && NumberOfWheels==5 && NumberOfPassengers==200 && speed==150) {
			System.out.println("boing737");
		}else if(tailNumber.equals("747") && NumberOfWheels==18 && NumberOfPassengers==500 && speed==200) {
			System.out.println("boing747");
		}
		else {System.out.println("There is no airplane registered with the same input");}
		
		
	}

}
