package java3;

public class Vehicle {
	protected int vehicle_ID;
	protected String make;
	protected String model;
	protected int production_date;
	protected double price;
	protected double weight;

	public Vehicle(int vehicle_ID, String make, String model, int production_date, double price, double weight) {
		super();
		this.vehicle_ID = vehicle_ID;
		this.make = make;
		this.model = model;
		this.production_date = production_date;
		this.price = price;
		this.weight = weight;
	}

	public String get_make() {
		return make;

	}

	public String get_model() {
		return model;

	}

	public int get_production_date() {
		return production_date;

	}

	public double get_weight() {
		return weight;
	}

}
