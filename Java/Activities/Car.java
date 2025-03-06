package activities;

public class Car {
    String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(String color, String transmission, int make){
		this.color=color;
		this.transmission=transmission;
		this.make=make;
		tyres=4;
		doors=4;
	}
	
	public void displayCharacteristics() {
		System.out.println("color of the car is "+color);
		System.out.println("transmission of the car is "+transmission);
		System.out.println("make of the car is "+make);
		System.out.println("car tyres are "+tyres);
		System.out.println("car doors are "+doors);
		}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}

}
