import java.util.Scanner;
class Exercise11_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Savingsaccount saccounts [] = new Savingsaccount[10];
		Checkingaccount caccounts [] = new Checkingaccount[10];
		sbalance(saccounts);
		cbalance(caccounts);
	
		do {
			System.out.println("Savings account one #. \nChecking two 1# \nEnter your account id number: ");
			int id = input.nextInt();
			if(validID(id, saccounts)){
				int choice;
				do{
					choice = mainmenu(input);
					if(validTrans(choice)){
						transactions(choice, saccounts, id, input);
					}
					
				}while (choice !=5);
			}
			else if(valid(id, caccounts)){
				int choice;
				do{
					choice = mainmenu(input);
					if(validTrans(choice)){
						transactions(choice, caccounts, id, input);
					}
					
				}while (choice !=5);
			}
		}while(true);
	}
	public static void sbalance(Account[] a){
		int sbal = 100;
		for(int i = 0; i < a.length; i++){
			a[i]= new Savingsaccount(i, sbal);
		}
	}
	public static void cbalance(Account[] a){
		int sbal = 100;
		for(int i = 0; i < (a.length); i++){
			a[i]= new Checkingaccount((i + 10), sbal);
			
		}
	}
	public static boolean valid(int id, Checkingaccount[] a){
		for(int i = 0; i < a.length; i++){
			if(id == a[i].getID()){
				return true;
			}
		}
		return false;
	}
	public static boolean validID(int id, Savingsaccount[] a){
		for(int i = 0; i < a.length; i++){
			if(id == a[i].getID()){
				return true;
			}
		}
		return false;
	}
	public static int mainmenu(Scanner input){
		System.out.println("\nMain Menu  \nCheck balance: 1 \nWithdraw : 2 \nDeposit : 3 \nCheck Account info: 4 \nExit : 5");
		System.out.println("Enter a choice");
		return input.nextInt();
	}
	public static boolean validTrans(int choice){
		return choice > 0 && choice < 5;
	}
	public static void transactions(int c, Account[] a, int id, Scanner input){
		if (id >= 10){
			id = id - 10;
		}
		switch(c){
			case 1: System.out.println("The balance of your account is $" + a[id].getBalance() ); break;
			
			case 2: System.out.println("Enter the amount you would like to withdraw: ");
					int withdraw = input.nextInt();
					a[id].withdraw(withdraw); break;
			case 3: System.out.println("Enter the amount you would like to deposit.");
					int deposit = input.nextInt();
					a[id].deposit(deposit); break;
			case 4: System.out.println(a[id].toLine()); break;
			
		}
		
	}
	
}