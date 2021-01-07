package java3;

public class Motorcycle extends Vehicle {
	double top_speed;

	public Motorcycle(int vehicle_ID, String make, String model, int production_date, double price, double weight) {
		super(vehicle_ID, make, model, production_date, price, weight);
	}

	public double getTop_speed() {
		return top_speed;
	}

	public void setTop_speed(double top_speed) {
		this.top_speed = top_speed;
	}

}
