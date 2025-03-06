package activities;

public class Activity1 {
	public static void main(String[] args) {
		Car audi= new Car("Black", "Manual", 2014);
		Car poloGt= new Car("White","Automatic", 2018);
		poloGt.displayCharacteristics();
		audi.accelarate();
		audi.brake();
	}
	
}
