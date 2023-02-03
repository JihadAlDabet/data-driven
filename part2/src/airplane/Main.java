package airplane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		airplane1 cisna=new airplane1("cis", 3, 4);
		airplane1 boing737=new airplane1("737", 5, 200);
		airplane1 boing747=new airplane1("747", 18, 500);		
		System.out.println(cisna.getTailNumber());
		System.out.println(cisna.getNumberOfWheels());
		System.out.println(cisna.getNumberOfPassengers());
		System.out.println(cisna.Drag(200));
		boing7371 helloBoing7371=new boing7371(null, 0, 0);
		
		helloBoing7371.numofwheels();
	
	}

}
