class Exercise9_7 {
	public static void main(String[] args) {
		Account a1 = new Account(1122, 20000);
		a1.setAnnualInterestRate(4.5);
		a1.withdraw(2500);
		a1.deposit(3000);
		
		System.out.println("Bank statement");
		System.out.println("Account: #" + a1.getID());
		System.out.println("Dates opened: " + a1.getDateCreated());
		System.out.printf("Balance: $%.2f\n", a1.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", a1.getMonthlyInterest());
		
		
		
	}
}
