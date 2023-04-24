
public abstract class Vehicle {
	public String brand;
	public String color = "Black";
	public float engineDisplacement;
	
	Vehicle(String brand, String color, float engineDisplacement){
		this.setBrand(brand);
		this.setColor(color);
		this.setEngineDisplacement(engineDisplacement);
	}
	
	Vehicle(Car x) {
		this.setBrand(x.getBrand());
		this.setColor(x.getColor());
		this.setEngineDisplacement(x.getEngineDisplacement());
	}
	
//	Vehicle(String brand, String color){
//		this.brand = brand; 
//		this.color = color;
//	}
//	
//	Vehicle(String brand, String color, float engineDisplacement){
//		this.brand = brand; 
//		this.color = color;
//		this.engineDisplacement = engineDisplacement;
//	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public float getEngineDisplacement() {
		return engineDisplacement;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setEngineDisplacement(float engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	
	public void sayBrand() {
		System.out.println("This car's brand");
	}
	
	public void honk() {
		System.out.println("Honk!!!!");
	}
	
	public abstract void go();
	
	public void copy(Car x) {
		this.setBrand(x.getBrand());
		this.setColor(x.getColor());
		this.setEngineDisplacement(x.getEngineDisplacement());
	}
}
