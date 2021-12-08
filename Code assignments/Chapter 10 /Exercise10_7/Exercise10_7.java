import java.util.Scanner;
class Exercise10_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account accounts [] = new Account[10];
		sbalance(accounts);
		do {
			System.out.println("Enter your account id number: ");
			int id = input.nextInt();
			if(validID(id, accounts)){
				int choice;
				do{
					choice = mainmenu(input);
					if(validTrans(choice)){
						transactions(choice, accounts, id, input);
					}
					
				}while (choice !=4);
			}
		}while(true);
	}
	public static void sbalance(Account[] a){
		int sbal = 100;
		for(int i = 0; i < a.length; i++){
			a[i]= new Account(i, sbal);
		}
	}
	public static boolean validID(int id, Account[] a){
		for(int i = 0; i < a.length; i++){
			if(id == a[i].getID()){
				return true;
			}
		}
		return false;
	}
	public static int mainmenu(Scanner input){
		System.out.println("\nMain Menu  \nCheck balance: 1 \nWithdraw : 2 \nDeposit : 3 \nExit : 4");
		System.out.println("Enter a choice");
		return input.nextInt();
	}
	public static boolean validTrans(int choice){
		return choice > 0 && choice < 4;
	}
	public static void transactions(int c, Account[] a, int id, Scanner input){
		switch(c){
			case 1: System.out.println("The balance of your account is $" + a[id].getBalance()); break;
			
			case 2: System.out.println("Enter the amount you would like to withdraw: ");
					int withdraw = input.nextInt();
					a[id].setBalance((a[id].getBalance() - withdraw)); break;
			case 3: System.out.println("Enter the amount you would like to deposit.");
					int deposit = input.nextInt();
					a[id].setBalance((a[id].getBalance() + deposit));

			
		}
		
	}
	
}