import java.util.Scanner;

public class PairProject {
	
	public static void main(String[] args) {
		//Goal: Display a table of Powers
		
		System.out.println("Welcome to the Squares and Cubes Table");
		//Instantiate a scanner
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
				
		//promt the user to enter an integer (1-100)
		System.out.println("Please enter a number from 1 to 100:");
		
		//Change user input to int
		int input = scan.nextInt();
		input = input + 1;
		//initialize variables
		int square = 0;
		int cube = 0;
		int count = 1;
		System.out.println("Number" + "    " + "     Squared" + "    " + "      Cubed");
		System.out.println("===========" + "    " + "=============" + "    " + "=====");
		
		// Start Loops
		while(answer.equalsIgnoreCase("yes")) {
			
			for (count = 1; count < input; count++) 
		//Perform computation for square and cube
			square = count * count;
			cube = count * count * count;
		
		//display a table of square and cubes from 1 to the value entered
			System.out.println(count + "\t" + "\t" + square + "\t" + "\t" + cube);
		
		}
		//ask the user if they want to continue	
		System.out.println("Would you like to build another table? Yes or No?");
		
		// Wait for user Entry
		answer = scan.next();
		
			}
	}
	




