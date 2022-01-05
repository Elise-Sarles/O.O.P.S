import java.util.Date;
import java.util.Scanner;

class Account {
	public int id = 0;
	public double balance = 0;
	public double annualInterestRate = 1;
	public Date dateCreated;
	
	public Account(){
		dateCreated = new Date();
	}
	public Account(int id, double bal){
		this.id = id;
		this.balance = bal;
		dateCreated = new Date();
	
	}
	public void setID(int id){
		this.id = id;
	}
	public void setBalance(double bal){
		this.balance = bal;
	}
	public void setAnnualInterestRate(double iR){
		this.annualInterestRate = iR;
	}
	public String getDateCreated(){
		return dateCreated.toString();
	}
	public int getID(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	public double getMonthlyInterest(){
		return balance * (getMonthlyInterestRate() / 100);
	}
	public void withdraw(double amount){
		setBalance((balance - amount));
		
	}
	public void deposit(double amount){
		setBalance((balance + amount));
	}
	public String toLine(){
		return "Account id: " + id+ "\nDate created: " + getDateCreated() + "\nAccount balance: $" + String.format("%.2f", balance) + "\nMonthly Intrest: $" + String.format("%.2f", getMonthlyInterest());
	}
}