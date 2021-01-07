package java3;

import java.util.ArrayList;

public class Garage {
	

	// public static List<String> garage;
	static ArrayList<String> garage = new ArrayList<String>();

	public static ArrayList<String> getGarage() {
		System.out.println(garage);
		return garage;
	}

	public static void add_vehicle(String vehicle) {
		garage.add(vehicle);
		System.out.println(garage);
		// System.out.println(garage);
	}

	public static ArrayList<String> empty_garage() {
		garage.clear();
		System.out.println(garage);
		return garage;
	}

	public static void remove_vehicle_by_make_and_ID(String vehicle) {
		garage.remove(vehicle);
	}

	public static int calculate_bill(Vehicle vehicle) {
		int cost = (int) (vehicle.get_production_date() * vehicle.get_weight() / 10000);
		System.out.println("TOTAL BILL: £" + cost);
		return cost;

	}

}
