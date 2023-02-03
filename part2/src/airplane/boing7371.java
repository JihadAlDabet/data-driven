package airplane;

public class boing7371 extends airplane1 {

	  // Inheritance
	 public boing7371(String tailNumber, int NumberOfWheels, int NumberOfPassengers) {
			super(tailNumber, NumberOfWheels, NumberOfPassengers);
		}
	 //Polymorphism
	 
	@Override
	public boolean Drag(double a) {
		// TODO Auto-generated method stub
		return true;
	}
	 
	 
	 
	 
	// Encapsulation
		private airplane1 boing737;
	// polymorphism:
	public int numofwheels() {
		return boing737.getNumberOfWheels();
			
	}
	
	 
	 
	
	
	//Composition**
	public void cisna(airplane1 boing737) {
		
	}
}
