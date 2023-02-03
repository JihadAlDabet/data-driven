package airplane;

import java.util.IllegalFormatPrecisionException;

public class airplane1 {
	private String tailNumber;
	private int NumberOfWheels;
	private int NumberOfPassengers;
	public double speed;
	
	public airplane1() {}
	
	  public airplane1(String tailNumber,int NumberOfWheels,int NumberOfPassengers) {
		this.setTailNumber(tailNumber);
		this.setNumberOfWheels(NumberOfWheels);
		this.setNumberOfPassengers(NumberOfPassengers);	  
	}

	public String getTailNumber() {
		return tailNumber;
	}

	public void setTailNumber(String tailNumber) {
		this.tailNumber = tailNumber;
	}

	public int getNumberOfWheels() {
		return NumberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		NumberOfWheels = numberOfWheels;
	}

	public int getNumberOfPassengers() {
		return NumberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		NumberOfPassengers = numberOfPassengers;
	}
	  
	public void callSign() {
		System.out.println(tailNumber);
	}
	public boolean Drag(double a) {
double Speed = a;
		
		if(tailNumber == "cis" && Speed>=90 ) { 
		return true;	
	}
		if(tailNumber == "737" && Speed>=150 ) { 
			return true;	
		}
		if(tailNumber == "747" && Speed>=200 ) { 
			return true;	
		}else 
			return false;
	}
		
}
