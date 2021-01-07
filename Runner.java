package java3;

public class Runner {

	public static void main(String[] args) {
		
		Lorry lorry1 = new Lorry(1, "MAC", "4", 2006, 1700.00, 3000.00);
		Lorry lorry2 = new Lorry(1, "MERC", "4", 2000, 1700.00, 4000.00);
		Car car1 = new Car(2, "BMW", "M3", 2020, 1700.00, 1100.00);
		Car car2 = new Car(2, "BMW", "M3", 2016, 1700.00, 1000.00);
		Motorcycle motorcycle1 = new Motorcycle(3, "YAMAHA", "R1", 2015, 1700.00, 400.00);
		Motorcycle motorcycle2 = new Motorcycle(3, "SUZUKI", "S1", 2012, 1700.00, 300.00);

		Garage.add_vehicle(car1);
		Garage.add_vehicle(lorry2);
		Garage.remove_vehicle("BMW");
	}

}
