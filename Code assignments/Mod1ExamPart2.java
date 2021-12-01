/*
Author: 
Date: 

Sample input:
	> 2
	name = Grocery, amount = $150
	name = Gas,		  amount = $40
	name = Grocery, amount = $100

Expected output:
	Your expenses were:
		Grocery		$150.0
		Gas			$40.0
		Grocery		$100.0

	Total expenses: $290.0

*/
import java.util.Scanner;

class Mod3ExamPart2 {
	public static void main(String[] args) {
		int user = 0; 
		user = prompt();
		
		while (user != 1 && user != 2) {
			
			System.out.println("Please enter valid input (1 or 2)");
			user = prompt(); 
				
		}
		
		calculate(user);
	}
	
	public static int prompt() {
		Scanner input = new Scanner(System.in);
		int user = 0;
		
		System.out.println("What would you like to calculate?");
		System.out.println("1) Gross Profit");
		System.out.println("2) Total Expenses");
		System.out.print("> ");
		user = input.nextInt();
		
		return user;
	}
	
	
	public static void calculate(int user) {
		Scanner input = new Scanner(System.in);
		String option = "";
		
		String all = "";
		double total = 0.0;
		String name = "";
		double amount = 0.0;
		
		if (user == 1) {
			option = "profit";
		}
		else if (user == 2) {
			option = "expense";
		}
		
		name ="go";
		char na = name.charAt(0);
		
		// Modify this condition to exit regardless of capitalization
		// Should quit for "Exit", "exit", "eXit", "EXIT", etc.
		while (Character.toUpperCase(na)!= 'E') {
			System.out.println("\nEnter " + option + " name or 'Exit' to quit: ");
			name = input.next();
			System.out.println("Enter amount of " + option + ": $");
			amount = input.nextInt();
			/* String in = input.nextLine();
			String end = "exit";
			if (in.equalsIgnoreCase(end)){
				name = "Exit";
				na = name.charAt(0);
				amount = 0;
			}
			else{
			amount = Double.parseDouble(in);
			}
			*/
			
			
			all += '\t' + name + "\t\t$" + amount + '\n';
			total += amount;
		}
		
		System.out.println("\n\nYour " + option + "s were:\n" + all);
		System.out.println("Total " + option + "s: $" + total);
	}
}