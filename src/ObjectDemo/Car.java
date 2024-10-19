package ObjectDemo;

public class Car {
	
	
	//Global variable
	String company ;
	String model;
	String color;
	double price;
	double milage;
	int wheels;
	
	
	public Car(String firstname , String lastname)
	{
		System.out.println("Inside the constructor ");
		System.out.println("My name is: "+firstname +lastname);
	}
	
	public void inCarVars(String c, String m, String c1, double p, double m1, int w)
	{
		company=c;
		model=m;
		price=p;
		milage=m1;
		wheels=w;
		System.out.println();
	}
	
	public void startCar()
	{
		System.out.println("car from  "+ company +" and from model "+model+" has Started");
		
	}
	
	public void stopCar()
	{
		System.out.println("car from "+ company +" and From model:"+ model +"has stared");
	}

	public void carDetails()
	{
		System.out.println("Company of the Car is  :" + company);
		System.out.println("Model of car is:  "+ model);
		System.out.println("color of the Car is  :" + color);
		System.out.println("Price of the Car is :"+price);
		System.out.println("Milage of the car is :"+ milage);
		System.out.println("Wheels of the car is :"+ wheels);
	}
}
