package java3;

public class Lorry extends Vehicle {
	private double trailer_capacity;

	public Lorry(int vehicle_ID, String make, String model, int production_date, double price, double weight) {
		super(vehicle_ID, make, model, production_date, price, weight);
	}

	public double getTrailer_capacity() {
		return trailer_capacity;
	}

	public void setTrailer_capacity(double trailer_capacity) {
		this.trailer_capacity = trailer_capacity;
	}

}
