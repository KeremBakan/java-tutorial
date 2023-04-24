
public class Car extends Vehicle {
	Car(String brand, String color, float engineDisplacement){
		super(brand, color, engineDisplacement);
	}

//	Car(String brand, String color){
//		super(brand, color);
//	}
//	
//	Car(String brand, String color, float engineDisplacement){
//		super(brand, color, engineDisplacement);
//	}
	
	@Override
	public void sayBrand() {
		System.out.println(super.brand);
	}
	
	public void honk() {
		super.honk();
	}

	@Override
	public void go() {
		System.out.println("Car is moving");
		
	}
	
}
