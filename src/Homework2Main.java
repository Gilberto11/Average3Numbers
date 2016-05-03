import java.util.Scanner;

public class Homework2Main {

	public static void main(String[] args) {
		//declare a Scanner Object
		Scanner input = new Scanner(System.in);
		//declare variables
		int Number1,Number2,Number3;
		float Average;
		
		
		
		
		//ask the user to enter 3 numbers
		System.out.println("Enter Number1: ");
		Number1 = input.nextInt();
		System.out.println("Enter Number2: ");
		Number2 = input.nextInt();
		System.out.println("Enter Number3: ");
		Number3 = input.nextInt();
		
		
	
		
		
	
		
		Average = (float) (Number1 + Number2 + Number3) / 3;
		
		System.out.println("Average is: " + Average);
		
		
		
	   
		
		

	}

}
