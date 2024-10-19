package ObjectDemo;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		Car Bmwx1 = new Car("Ashish","bahurupi");
		
		Bmwx1.inCarVars("Honda","ZX","white",2000000,23,4);
		Bmwx1.startCar();
		Bmwx1.startCar();
		Bmwx1.carDetails();
		Bmwx1.company="BMW";
		Bmwx1.model="X1";
		Bmwx1.color="Red";
		Bmwx1.price=4000000;
		Bmwx1.milage=10;
		Bmwx1.wheels=4;
		
		
		Bmwx1.startCar();
		Bmwx1.startCar();
		Bmwx1.carDetails();
		
		
		Car audiA10=new Car("Vishal","Shah");
		audiA10.company="Audi";
		audiA10.model="A10";
		audiA10.color="Blue";
		audiA10.price=7000000;
		audiA10.milage=14.76;
		audiA10.wheels=4;
		
		audiA10.startCar();
		audiA10.stopCar();
		audiA10.carDetails();
	
	}

}
