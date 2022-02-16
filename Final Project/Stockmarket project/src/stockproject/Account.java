package stockproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
/**
 * <h1> Personal object for Accounts </h1>
 * <p>Created: Jan 28 to Feb 16 2022 </p>
 * 
 * @author Elise Sarles
 *
 */
public class Account {

	String bank = "(default) All State Bank";
	String username;
	String password;
	int aID; 
	double wallet = 100.0;
	File fx = new File("/Users/student/eclipse-workspace/Stockmarket project/src/userinfo.txt");
	static int count = 0; 
	int wins = 0;
	long shortesttime;
	double bigwallet;
	/**
	 * Makes the object
	 */
	public Account() {
		username = "User";
		password = "Password123";
		count++;
		aID = count - 1;
		
		
	}
	/**
	 * Make the object with some splash of individuality
	 * @param username (String; for the account username)
	 * @param password (String; for the account password)
	 * @throws IOException
	 */
	public Account(String username, String password)throws IOException{
		Scanner scan = new Scanner(fx);
		this.username = username;
		this.password = password;
		count++;
		aID = count - 1;
		boolean b = false;
		while (scan.hasNext()) {
			String user = scan.nextLine();
			String pass = scan.nextLine();
			String ban = scan.nextLine();
			int id = scan.nextInt();
			double wall = scan.nextDouble();
			if (username.equals(user)) {
				b = true;
			}
		}
		if (b == false) {
			FileWriter fileWriter = new FileWriter("/Users/student/eclipse-workspace/Stockmarket project/src/userinfo.txt", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(username);
			printWriter.println(password);
			printWriter.println(bank);
			printWriter.println(aID);
			printWriter.println(wallet);
			printWriter.close();
		}
		
	}
	/**
	 * Make the object with a big splash of individuality
	 * @param username (String; for the account username)
	 * @param password (String; for the account password)
	 * @param bank (String; to show bank for account)
	 * @param aID (Int; a number to tell accounts apart.)
	 * @param wallet (Double; the amount of money the account has)
	 * @throws IOException
	 */
	public Account(String username, String password, String bank, int aID, double wallet) throws IOException {
		Scanner scan = new Scanner(fx);
		count++;
		this.username = username;
		this.password = password;
		this.bank = bank;
		this.aID = aID;
		this.wallet = wallet;
		boolean b = false;
		while (scan.hasNext()) {
			String user = scan.nextLine();
			String pass = scan.nextLine();
			String ban = scan.nextLine();
			int id = scan.nextInt();
			double wall = scan.nextDouble();
			if (username.equals(user)) {
				b = true;
			}
		}
		if (b == false) {
			FileWriter fileWriter = new FileWriter("/Users/student/eclipse-workspace/Stockmarket project/src/userinfo.txt", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(username);
			printWriter.println(password);
			printWriter.println(bank);
			printWriter.println(aID);
			printWriter.println(wallet);
			printWriter.close();
		}
		
	}
	/**
	 * to get the username.
	 * @return username (String; that has the accounts username)
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * To change the username.
	 * @param username (String; that has the accounts username)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void setUsername(String username) throws FileNotFoundException, IOException {
		Scanner scan = new Scanner(fx);
		StringBuffer buffer = new StringBuffer();
		while(scan.hasNextLine()) {
			buffer.append(scan.nextLine() + System.lineSeparator());
		}
		String fileContents = buffer.toString();
		fileContents = fileContents.replaceAll(this.username, username);
		FileWriter writer = new FileWriter(fx);
		PrintWriter printWriter = new PrintWriter(writer);
		printWriter.println(fileContents);
		printWriter.close();
		
		this.username = username;
		
	}
	/**
	 * to get the password
	 * @return password (String; the account password)
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * to change the account password
	 * @param password (String; the account password)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void setPassword(String password) throws FileNotFoundException, IOException {
		Scanner scan = new Scanner(fx);
		StringBuffer buffer = new StringBuffer();
		while(scan.hasNextLine()) {
			buffer.append(scan.nextLine() + System.lineSeparator());
		}
		String fileContents = buffer.toString();
		fileContents = fileContents.replaceAll(this.password, password);
		FileWriter writer = new FileWriter(fx);
		PrintWriter printWriter = new PrintWriter(writer);
		printWriter.println(fileContents);
		printWriter.close();
		
		this.password = password;
	}
	/**
	 * to get the bank of the account.
	 * @return bank (String; the name of account bank)
	 */
	public String getBank() {
		return bank;
	}
	/**
	 * To change the account bank.
	 * @param bank (String; the name of account bank)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void setBank(String bank) throws FileNotFoundException, IOException {
		Scanner scan = new Scanner(fx);
		StringBuffer buffer = new StringBuffer();
		while(scan.hasNextLine()) {
			buffer.append(scan.nextLine() + System.lineSeparator());
		}
		String fileContents = buffer.toString();
		fileContents = fileContents.replaceAll(this.bank, bank);
		FileWriter writer = new FileWriter(fx);
		PrintWriter printWriter = new PrintWriter(writer);
		printWriter.println(fileContents);
		printWriter.close();
		
		this.bank = bank;
	}
	/**
	 * to get the account id
	 * @return aID (int; the number to tell difference in account)
	 */
	public int getAID() {
		return aID;
	}
	/**
	 * To change the account id
	 * @param aID (int; the number to tell difference in account)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void setAID(int aID) throws FileNotFoundException, IOException  {
		String id = "" + this.aID;
		String iD = "" + aID;
		Scanner scan = new Scanner(fx);
		StringBuffer buffer = new StringBuffer();
		while(scan.hasNextLine()) {
			buffer.append(scan.nextLine() + System.lineSeparator());
		}
		String fileContents = buffer.toString();
		fileContents = fileContents.replaceFirst(id, iD);
		FileWriter writer = new FileWriter(fx);
		PrintWriter printWriter = new PrintWriter(writer);
		printWriter.println(fileContents);
		printWriter.close();
		
		this.aID = aID;
	}
	/**
	 * to get the account wallet.
	 * @return wallet (Double; the amount of money the account has)
	 */
	public double getWallet() {
		return wallet;
	}
	/**
	 * to change the account wallet amount.
	 * @param wallet (Double; the amount of money the account has)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void setWallet(double wallet) throws FileNotFoundException, IOException {
		String wa = "" + this.wallet;
		String wall = "" + wallet;
		Scanner scan = new Scanner(fx);
		StringBuffer buffer = new StringBuffer();
		while(scan.hasNextLine()) {
			buffer.append(scan.nextLine() + System.lineSeparator());
		}
		String fileContents = buffer.toString();
		fileContents = fileContents.replaceAll(wa, wall);
		FileWriter writer = new FileWriter(fx);
		PrintWriter printWriter = new PrintWriter(writer);
		printWriter.println(fileContents);
		printWriter.close();
		
		this.wallet = wallet;
	}
	/*
	public void delac() throws FileNotFoundException, IOException {
		String wa = "" + this.wallet;
		String wall = "";
		String id = "" + this.aID;
		String iD = "";
		
		Scanner scan = new Scanner(fx);
		StringBuffer buffer = new StringBuffer();
		while(scan.hasNextLine()) {
			buffer.append(scan.nextLine() + System.lineSeparator());
		}
		String fileContents = buffer.toString();
		fileContents = fileContents.replaceAll(wa, wall);
		fileContents = fileContents.replaceFirst(id, iD);
		fileContents = fileContents.replaceAll(this.password, "");
		fileContents = fileContents.replaceAll(this.username, "");
		fileContents = fileContents.replaceAll(this.bank, "");
		FileWriter writer = new FileWriter(fx);
		PrintWriter printWriter = new PrintWriter(writer);
		printWriter.println(fileContents);
		printWriter.close();
	}
	*/
	/**
	 * keeps win score
	 */
	public void addwin() {
		wins++;
	}
	/**
	 * Keeps track of the highest amount earn in game. 
	 * @param money (double; the amount of money earned.)
	 */
	public void replacewallet(double money) {
		if(bigwallet > money) {
			bigwallet = money;
		}
	}
	/**
	 * Keeps score for the shortest time to win.
	 * @param time (long; time it took to play the game.)
	 */
	public void replacetime(long time) {
		if(shortesttime > time) {
			shortesttime = time;
		}
	}
	/**
	 * it shows the scores. 
	 */
	public void getscore() {
		System.out.println("Wins: " + wins + "\nShortest time: " + shortesttime + " secs \nHighest $ earned: " + bigwallet);
	}
	/**
	 * Shows the account informations
	 * @return  info (String; has all the info for the account)
	 */
	public String toLine() {
		String info = "Username: " + getUsername() + "\nPassword: " + getPassword() + "\nBank: " + getBank() + "\nAccount ID: " + getAID();
		return info;
	}
}

