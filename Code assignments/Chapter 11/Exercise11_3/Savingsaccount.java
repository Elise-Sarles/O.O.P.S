import java.util.Date;
class Savingsaccount 
	extends Account{
		
		
		public Savingsaccount(){
			dateCreated = new Date();
		}
		public Savingsaccount(int id, double bal){
			setID(id);
			setBalance(bal);
			dateCreated = new Date();
		}
		public void withdraw(double amount){
			if(amount <= balance){
				setBalance((getBalance() - amount));
			}
			else {
			System.out.println("Error not sufficient funds");
			}
		}
		public String toLine(){
			return super.toLine()  + " \nAccount type: Savings";
		}
	}