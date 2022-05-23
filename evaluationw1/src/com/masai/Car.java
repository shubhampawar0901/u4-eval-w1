package com.masai;

 class Car {
	
	private String model;
	private String companyName;
	private String color;
	Engine engine;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getModel() {
		return this.model;
	}
	public String getCompanyName() {
		return this.companyName;
	}
	public Engine getEngine() {
		return this.engine;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void showDetails() {
		System.out.println("Car Model :"+model);
		System.out.println("Car companyName :"+companyName);
		System.out.println("Car Has Turbo :"+engine);
	}

}

public class Engine{
	private int rpm;
	private int power;
	private String manufacturer;
	private Boolean hasTurbo = false;
	
	public void turbo(boolean t1) {
		this.hasTurbo = t1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e1 = new Engine();
		
		e1.hasTurbo = true;
		e1.rpm = 1000;
		e1.power = 110;
		e1.manufacturer = "Tata";
		Car c1 = new Car();
		c1.setEngine(e1);
		c1.setCompanyName("Tata");
		c1.setColor("Black");
		c1.setModel("Harrier");
		
		
		
		c1.showDetails();
		System.out.println(e1.rpm);
		System.out.println(e1.power);
		System.out.println(e1.manufacturer);
		
		
	}
}
