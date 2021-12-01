import java.util.Date;
import java.sql.*;

class Account {
	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account(){
		dateCreated = new Date();
	}
	public Account(int newid, double newbal){
		id = newid;
		balance = newbal;
		dateCreated = new Date();
	
	}
	public void setID(int newid){
		id = newid;
	}
	public void setBalance(double newbal){
		balance = newbal;
	}
	public void setAnnualInterestRate(double newIR){
		annualInterestRate = newIR;
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
		balance -= amount;
	}
	public void deposit(double amount){
		balance += amount;
	}
}