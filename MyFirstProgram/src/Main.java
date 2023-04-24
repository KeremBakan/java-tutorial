import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("What is your name:");
//		String name = input.next();
//		System.out.println("Welcome " + name);
		
//		String day = "Monday";
//		
//		switch(day) {
//		case "Monday": {
//			System.out.println("Start of the week");
//			System.out.println("Let's go to work");
//		}
//			break;
//		default: System.out.println("Wrong day");
//		}
		
		Car car1 = new Car("BMW", "White", 2.5f); 
		Car car2 = new Car("Ford", "Blue", 2.0f);
		Car car3 = new Car("Toyota", "Silver", 1.6f);
		Car car4 = new Car("Volvo", "Gray", 1.8f);
		
		car4.copy(car1);
//		Car[] cars = {car1, car2, car3};
		
		ArrayList<Car> cars = new ArrayList<Car>();  
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		
		for(Car c : cars) {
			System.out.printf("Brand: %s | Color: %s | Engine Displacement:%.1f\n", c.getBrand(), c.getColor(), c.getEngineDisplacement());
		}
		
		car2.honk();

	}

}
