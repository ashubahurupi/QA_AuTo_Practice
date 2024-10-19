package ControlFlowStatements;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		
		String foodItems="noodles";
		
		switch(foodItems) {
		
		case "pizza":
			System.out.println("Here is your Pizza");
			break;	
		case "burger":
			System.out.println("Here is you burger");
			break;
		case "noodles":
			System.out.println("Here is your noodles");
			break;
		case "pasta":
			System.out.println("Here is you past");
			break;
		default: 
		   System.out.println("We serve only pizza/buger/noodles/pasta only");
		
		}
	}

}
