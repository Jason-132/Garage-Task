package java3;

public class Car extends Vehicle {
	private String transmission;

	
	public Car(int vehicle_ID, String make, String model, int production_date, double price, double weight) {
		super(vehicle_ID, make, model, production_date, price, weight);
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

}
