import java.util.Scanner;

public class PairProject {
	
	public static void main(String[] args) {
		//Goal: Display a table of Powers
		
		System.out.println("Welcome to the Squares and Cubes Table");
		//Instantiate a scanner
		Scanner scan = new Scanner(System.in);
		Scanner answer = new Scanner(System.in);
				
		//Initialize variables
		int square = 0;
		int cube = 0;
		int count = 1;
		String proceed = "yes";
		
		//Start While and For loops
		while(proceed.equalsIgnoreCase("yes")) {
			
			//promt the user to enter an integer (1-100)
			System.out.println("Please enter a number from 1 to 100:");
			int input = scan.nextInt();
							
		//Create table headsers
		System.out.println("Number" + "    " + "     Squared" + "    " + "      Cubed");
		System.out.println("===========" + "    " + "=============" + "    " + "=====");
				
			for (count = 1; count < input + 1; count++) {
				//Perform computation for square and cube
				square = count * count;
				cube = count * count * count;
		
				//display a table of square and cubes from 1 to the value entered
				System.out.println(count + "\t" + "\t" + square + "\t" + "\t" + cube);
				//ask the user if they want to continue
			
		}
				//Ask for continuation
				System.out.println("Would you like to create another table? Yes or No?");
				// Wait for user Entry
				proceed = answer.next();
		}
			System.out.println("I'm glad I could show you this informtaion, Have a great day!");
			
			//Close scanners
			scan.close(); 
			answer.close();
	}
		
}
	
