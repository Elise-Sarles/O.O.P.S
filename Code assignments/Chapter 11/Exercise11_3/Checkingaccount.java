import java.util.Date;
class Checkingaccount
	extends Account{
		
		private double overdraftlimit = 0;
		
		public Checkingaccount(){
			super();
			overdraftlimit = -500;
			
		}
		public Checkingaccount(int newid, double newbal){
			super();
			overdraftlimit = -500;
			setID(newid);
			setBalance(newbal);
			
		}
		
		public void withdraw(double amount){
			if(amount <= balance){
				setBalance((getBalance() - amount));
			}
			else if(amount > balance && (balance - amount) > overdraftlimit){
				setBalance((getBalance() - amount));
				System.out.println("This with enter over draft.");
			}
			else if((balance - amount) == overdraftlimit){
				System.out.println("Have now reached over draft limit.");
			}
			else{
			System.out.println("Error not sufficient funds.");
			}
		}
		public String toLine(){
			return super.toLine() + " \nAccount type: Checking" + " \nOverdraftlimit: " + overdraftlimit;
		}
	}