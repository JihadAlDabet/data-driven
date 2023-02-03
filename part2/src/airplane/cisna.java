package airplane;

public class cisna {
	public airplane1 ciscAirplane1;
	//inhertance
	
	public int getwheels() {
		
		return ciscAirplane1.getNumberOfWheels();
		
	}
	
	
	
	
	
	 // Encapsulation	
private airplane1 cisna;
//Composition
public  cisna(airplane1 cisna) {
	cisna.getNumberOfPassengers();
	}

public String getTailNumber() {
	return  cisna.getTailNumber();
}
public void setTailNumber(String tailNumber) {
	cisna.setTailNumber(tailNumber);
}

public int getNumberOfWheels() {
	return cisna.getNumberOfWheels();
}

public void setNumberOfWheels(int numberOfWheels) {
	
}


}
