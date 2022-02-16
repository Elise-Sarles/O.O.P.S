package stockproject;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 * <h1> Stock Market game </h1>
 * <p>Created: Jan 28 to Feb 16 2022 </p>
 * 
 * @author Elise Sarles
 *
 */

public class Marketuser {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner input = new Scanner(System.in);
		File fx = new File("/Users/student/eclipse-workspace/Stockmarket project/src/userinfo.txt");
		Scanner scan = new Scanner(fx);
		Account[] ac = new Account[10];
		System.out.println("Welcome! ");
		
		do {
		System.out.println("Login (1) \nSign Up (2)");
		int a = input.nextInt();
		if (a == 1) {
			login(ac);
		}
		else if (a == 2) {
			signup(ac);
		}

		}while (true);
	
	}
	/**
	 * This method is used to login to the game. 
	 * @param ac (Account []; an original object variable array.)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void login(Account[] ac) throws FileNotFoundException, IOException{
		Scanner input = new Scanner(System.in);
		boolean b = false;
		String username;
		String password;
		int aID = 0;
		String bank = " ";
		double wallet= 0.0;
		String exit = "exit";
		System.out.println("Login \nEnter exit to leave");
		do {
			File fx = new File("/Users/student/eclipse-workspace/Stockmarket project/src/userinfo.txt");
			Scanner scan = new Scanner(fx);
			System.out.println("Enter Username (no spaces)");
			username = input.nextLine();
			if(username.equals(exit)) {
				System.exit(0);
			}
			System.out.println("Enter Password");
			password = input.nextLine();
			while (scan.hasNext()) {
				String user = scan.nextLine();
				String pass = scan.nextLine();
				bank = scan.nextLine();
				aID = scan.nextInt();
				wallet = scan.nextDouble();
				if (username.equals(user) && password.equals(pass)) {
					b = true;
				}
				else {
					b = false;
				}
			}
			if (b== false) {
				System.out.println("Wrong username or password.\nEnter exit to leave");
			}
			
		}while (b == false);
		if(b == true) {
			System.out.println("Logging in");
		
		createin(username, password, ac, aID, bank, wallet);
		}
		
	}
	/**
	 * This method is used to sign up for the game. 
	 * @param ac (Account []; an original object variable array.)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void signup(Account[] ac) throws FileNotFoundException, IOException{
		File fx = new File("/Users/student/eclipse-workspace/Stockmarket project/src/userinfo.txt");
		Scanner input = new Scanner(System.in);
		Scanner scan = new Scanner(fx);
		String username = "user";
		String password = "pass";
		boolean b = false;
		String exit = "exit";
		System.out.println("Sign up \nEnter exit to leave");
		while (b == false){
			System.out.println("\nEnter Username (please no spaces)");
			username = input.nextLine();
			if(username.equals(exit)) {
				System.exit(0);
			}
			System.out.println("\nEnter Password");
			password = input.nextLine();
			while (scan.hasNext()) {
				String user = scan.nextLine();
				String pass = scan.nextLine();
				String bank = scan.nextLine();
				int aID = scan.nextInt();
				double wallet = scan.nextDouble();
				if (username.equals(user)) {
					System.out.println("\nUsername already in use or invalid.");
					b = false;
				}
				else {
					b = true;
				}
			}
			if (fx.length() == 0) {
				b = true;
			}
		}
		System.out.println("Creating account...");
		create(username, password, ac);
		
	}
	/**
	 *  Creates the account object when they are signing up. 
	 * @param username (String; it represents the user input for a username.)
	 * @param password (String; it represents the user input for a password.)
	 * @param ac (Account []; an original object variable array.)
	 * @throws IOException
	 */
	public static void create(String username, String password,Account[] ac) throws IOException{
			int j = Account.count;
		ac[j] = new Account(username, password);
		
		inprogram(j,ac);
	}
	/**
	 * This method checks to see if the account has already been mad an object and if not it makes it one.
	 * @param username (String; it represents the user input for a username.)
	 * @param password (String; it represents the user input for a password.)
	 * @param ac (Account []; an original object variable array.)
	 * @param id (Int; use to show which object in the array we want. )
	 * @param bank (String; The bank the user has)
	 * @param wallet (Double; the amount of money the user has.)
	 * @throws IOException
	 */
	public static void createin(String username, String password,Account[] ac, int id, String bank, double wallet) throws IOException{
		try {
		username.equals(ac[id].getUsername());
			inprogram(id, ac);
		}
		catch(NullPointerException e){
			ac[id]= new Account(username, password, bank, id, wallet);
			inprogram(id, ac);
		}
	}
	/**
	 * This is the opening of the program where to decide what you want to to. 
	 * @param aID (Int; use to show which object in the array we want. )
	 * @param ac (Account []; an original object variable array.)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void inprogram(int aID, Account[] ac) throws 
	 FileNotFoundException, IOException{
		Scanner input = new Scanner(System.in);
		int choice;
			do{
				choice = mainmenu(input);
				if(validTrans(choice)){
					actions(choice, ac, aID);
				}
				
			}while (choice !=4);
	}
	/**
	 * This method holds the main menu and and ask to to chose an option.
	 * @param input (Scanner; so the user can make a choice)
	 * @return choice (Int; shows what the user chose)
	 */
	public static int mainmenu(Scanner input){
		System.out.println("\nMain Menu  \nPlay: 1 \nSee Scores: 2 \nAccount: 3 \nExit: 4");
		System.out.println("Enter a choice");
		return input.nextInt();
	}
	/**
	 * This method is to check if the value is a valid choice in the main menu
	 * @param choice (Int; what the user inputed.)
	 * @return true or false (Boolean; if is a valid chose) 
	 */
	public static boolean validTrans(int choice){
		return choice > 0 && choice < 4;
	}
	/**
	 * This method is to check if the value is a valid choice in the game menu
	 * @param choice (Int; what the user inputed.)
	 * @return true or false (Boolean; if is a valid chose) 
	 */
	public static boolean validact(int choice){
		return choice > 0 && choice < 5;
	}
	/**
	 * This method is to check if the value is a valid choice in one of the game options
	 * @param choice (Int; what the user inputed.)
	 * @return true or false (Boolean; if is a valid chose) 
	 */
	public static boolean validgame(int choice){
		return choice > 0 && choice < 3;
	}
	/**
	 *  This method hold all the out comes of the main menu choices.
	 * @param c (Int; what the user inputed. was choice.)
	 * @param ac (Account []; an original object variable array.)
	 * @param aID (Int; use to show which object in the array we want. )
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void actions(int c, Account[] ac, int aID) throws 
	 FileNotFoundException, IOException{
		Scanner input = new Scanner(System.in);
		int choice = 0;
		switch(c){
		case 1: do{ 
			System.out.println("Free style (1) \n10,000 luck (2) \nGo back (3)"); 
			choice = input.nextInt();
			if (validgame(choice)) {
				games(choice, aID, ac);
			}
			
		}while(choice !=3);
		break;
		case 2: System.out.println("10,000 luck $ Free Style scores \n"); ac[aID].getscore(); 
		break;
		case 3: System.out.println("Account Info" ); 
			choice = 0;
			System.out.println(ac[aID].toLine()); 
			System.out.println("Edit info yes (1) / no (2) ");
			int an = input.nextInt();
			if (an == 1) {
				while(choice != 4) {
					System.out.println("Username (1) \nPassword (2) \nBank (3) \nGo back (4)");
					choice = input.nextInt();
					if (validact(choice)) {
						edit(choice, ac, aID);
					}
					else if( choice <= 0 || choice > 5) {
						System.out.println("Invaid input");
					}
				}
			}
			
			
		break;
		}
	}
	/**
	 * This allows the user to change info in their object Account.
	 * @param c (Int; what the user inputed. was choice.)
	 * @param ac (Account []; an original object variable array.)
	 * @param id (Int; use to show which object in the array we want. )
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void edit(int c, Account[] ac, int id) throws 
	 FileNotFoundException, IOException{
		Scanner input = new Scanner(System.in);
		
		switch(c) {
		case(1): System.out.println("Enter new username no spaces: ");
			String newu = input.nextLine();
			ac[id].setUsername(newu);
			break;
		case(2): System.out.println("Enter new password no spaces: ");
			String newp = input.nextLine();
			ac[id].setPassword(newp);
			break;
		case(3):System.out.println("Enter new bank: ");
			String newb = input.nextLine();
			ac[id].setBank(newb);
			break;
			/*
		case(4): ac[id].delac();
				ac[id] = null;
				System.out.println("Account Deleted... \nExiting program...");
				System.exit(2);
			break;
			*/
		}
	}
	/**
	 *  This method is to bring you to the right type of game.
	 * @param c (Int; a new user input. was choice.)
	 * @param id (Int ; use to show which object in the array we want. )
	 * @param ac (Account []; an original object variable array.)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void games(int c, int id, Account[] ac) throws FileNotFoundException, IOException {
		if (c == 1) {
			freestyle(id, ac);
		}
		else if (c == 2) {
			luck(id,ac);
		}
		else {
			
		}
	}
	/**
	 * This method is one of the games. Freestyle
	 * @param id (Int ; use to show which object in the array we want. )
	 * @param ac (Account []; an original object variable array.)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void freestyle(int id, Account[] ac) throws FileNotFoundException, IOException{
		Scanner input = new Scanner(System.in);
		File f = new File("/Users/student/eclipse-workspace/Stockmarket project/src/Stocks.txt");
		Scanner scan = new Scanner(f);
		Stock[] s = new Stock[10];
			for( int i = 0; i < s.length; i ++) {
				double price = scan.nextDouble();
				scan.nextLine();
				String name = scan.nextLine();
				String ceo = scan.nextLine();
				String about = scan.nextLine();
				s[i]= new Stock(price, name, ceo, about,i);
			
			}
			double [][] rates  = new double [10][100];
			for(int i = 0; i < rates.length; i++ ){
				for(int j = 0; j < rates[i].length; j++ ){
					double value = (Math.random()* 3);
					value = Math.floor(value * 100) / 100;
					rates[i][j] = value;
				}
			}
		boolean wc; 
		int choice = 0;
		System.out.println("Free Style. \nyou have 100 days to get to 10,00 dollars");
		System.out.println();
		System.out.println("Play classic (1) or set being amount (2)");
		choice = input.nextInt();
		if(choice ==1) {
			ac[id].setWallet(100);
			wc = true; 
		}
		else if (choice == 2) {
			System.out.println("Enter an amount of money. Score will not be kept");
			ac[id].setWallet(input.nextDouble());
			wc = false; 
		}
		else {
			System.out.println("Automaticly going to classic");
			ac[id].setWallet(100);
			wc = true; 
		}
		choice = 0;
		int c = 0;
		int dy = 0;
		int dg = 0;
		String dt = "2020-01-01";  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		Stopwatch w = new Stopwatch();
		w.start();
		while (choice != 5) {
			try {
				cal.setTime(sdf.parse(dt));
				} catch (ParseException e) {
					
				}
			System.out.println(cal.getTime());
			System.out.println("Your stocks (1) \nMarket (2) \nWallet (3) \nNext day (4) \nEnd game (5)");
			choice = input.nextInt();
			if(validact(choice)){
				switch(choice) {
					case 1: System.out.println("Stocks");
					for( int i = 0; i < s.length; i ++) {
						if (s[i].getowned() >=1) {
							System.out.println(s[i].stockString());
							System.out.println("__________________________");
						}
					}
						break;
					case 2: c = 0;
						while (c != 3) {
							System.out.println("Market \nBuy (1) \nSell (2) \nGo back (3)");
							c = input.nextInt();
							System.out.println("__________________________");
							if (c == 1) {
								for( int i = 0; i < s.length; i ++) {
									System.out.println(s[i].endString());
									System.out.println("__________________________");
								}
								System.out.println("Pick a stock to buy by ID(0- 9)");
								int st = input.nextInt();
								System.out.println("How many of " + s[st].getname() + " stocks would you like to buy?" );
								int am = input.nextInt();
								double cost = Math.round((s[st].getPrice() * am ) * 100) / 100;
								System.out.println("That is $" + cost + "." );
								if(cost > ac[id].getWallet()) {
									System.out.println("You do not have enough money to complete this trasaction.");
								}
								else if ( cost <= ac[id].getWallet()) {
									double cashb = ac[id].getWallet() - cost;
									s[st].buy(am);
									ac[id].setWallet(cashb);
									System.out.println("Stocks purchased");
									
								}
							}
							else if (c == 2) {
								int count = 0;
								for( int i = 0; i < s.length; i ++) {
									if (s[i].getowned() >=1) {
										System.out.println(s[i].sellString());
										System.out.println("__________________________");
										count++;
									}
								}
								if (count >= 1) {
									System.out.println("Pick stock to sell by ID");
									int st = input.nextInt();
									if( s[st].getowned() >= 1) {
										System.out.println("How may of them would you like to sell.");
										int am = input.nextInt();
										if (s[st].getowned() >= am){
											double cost = Math.round((s[st].getPrice() * am ) * 100) / 100;
											System.out.println("The total of your sale is $" + cost);
											double cashb = ac[id].getWallet() + cost;
											s[st].sell(am);
											ac[id].setWallet(cashb);
											System.out.println("Stocks sold");
											count = 0;
										}
									}
								}
							}
						}
				
						break;
					case 3: System.out.println("Money in wallet: $" + ac[id].getWallet() );
						break;
					case 4:cal.add(Calendar.DATE, 1);
					dt = sdf.format(cal.getTime());
					dy++;
					if(dy > 100) {
						dg++;
						dy = 0;
					}
					for(int i = 0; i < rates.length; i++ ){
						s[i].stockchange(rates[i][dy]);
					}
					
						break;
				}
			}
		}
		w.stop();
		if (wc) {
		ac[id].replacewallet(ac[id].getWallet());
		}
		System.out.println("Your time was " + w.getTimeSecs() + " secounds");
		dy = dy + (dg * 100);
		System.out.println("Days passed: " + dy);
	}
	/**
	 * This method is one of the games. 10,000 luck
	 * @param id (Int ; use to show which object in the array we want. )
	 * @param ac (Account []; an original object variable array.)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void luck(int id, Account[] ac) throws FileNotFoundException, IOException{
		Scanner input = new Scanner(System.in);
		File f = new File("/Users/student/eclipse-workspace/Stockmarket project/src/Stocks.txt");
		Scanner scan = new Scanner(f);
		Stock[] s = new Stock[10];
			for( int i = 0; i < s.length; i ++) {
				double price = scan.nextDouble();
				scan.nextLine();
				String name = scan.nextLine();
				String ceo = scan.nextLine();
				String about = scan.nextLine();
				s[i]= new Stock(price, name, ceo, about,i);
			
			}
			double [][] rates  = new double [10][200];
			for(int i = 0; i < rates.length; i++ ){
				for(int j = 0; j < rates[i].length; j++ ){
					double value = (Math.random()* 3);
					value = Math.floor(value * 100) / 100;
					rates[i][j] = value;
				}
			}
		int choice = 0;
		ac[id].setWallet(100);
		int c = 0;
		int dy = 0;
		String dt = "2020-01-01";  // Start date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		Stopwatch w = new Stopwatch();
		System.out.println("10,000 luck. \nyou have 200 days to get to 10,00 dollars");
		System.out.println();
		w.start();
		while (choice != 5 ) {
			try {
				cal.setTime(sdf.parse(dt));
				} catch (ParseException e) {
					
				}
			System.out.println(cal.getTime());
			System.out.println("Your stocks (1) \nMarket (2) \nWallet (3) \nNext day (4) \nEnd game (5)");
			choice = input.nextInt();
			if (ac[id].getWallet() >= 10000) {
				choice = 5;
			}
			if(dy == 200) {
				choice = 5;
			}
			if(validact(choice)){
				switch(choice) {
					case 1: System.out.println("Stocks");
					for( int i = 0; i < s.length; i ++) {
						if (s[i].getowned() >=1) {
							System.out.println(s[i].stockString());
							System.out.println("__________________________");
						}
					}
						break;
					case 2: c = 0;
						while (c != 3) {
							System.out.println("Market \nBuy (1) \nSell (2) \nGo back (3)");
							c = input.nextInt();
							System.out.println("__________________________");
							if (c == 1) {
								for( int i = 0; i < s.length; i ++) {
									System.out.println(s[i].endString());
									System.out.println("__________________________");
								}
								System.out.println("Pick a stock to buy by ID(0- 9)");
								int st = input.nextInt();
								System.out.println("How many of " + s[st].getname() + " stocks would you like to buy?" );
								int am = input.nextInt();
								double cost = Math.round((s[st].getPrice() * am ) * 100) / 100;
								System.out.println("That is $" + cost + "." );
								if(cost > ac[id].getWallet()) {
									System.out.println("You do not have enough money to complete this trasaction.");
								}
								else if ( cost <= ac[id].getWallet()) {
									double cashb = ac[id].getWallet() - cost;
									s[st].buy(am);
									ac[id].setWallet(cashb);
									System.out.println("Stocks purchased");
									
								}
							}
							else if (c == 2) {
								int count = 0;
								for( int i = 0; i < s.length; i ++) {
									if (s[i].getowned() >=1) {
										System.out.println(s[i].sellString());
										System.out.println("__________________________");
										count++;
									}
								}
								if (count >= 1) {
									System.out.println("Pick stock to sell by ID");
									int st = input.nextInt();
									if( s[st].getowned() >= 1) {
										System.out.println("How may of them would you like to sell.");
										int am = input.nextInt();
										if (s[st].getowned() >= am){
											double cost =Math.round((s[st].getPrice() * am ) * 100) / 100;
											System.out.println("The total of your sale is $" + cost);
											double cashb = ac[id].getWallet() + cost;
											s[st].sell(am);
											ac[id].setWallet(cashb);
											System.out.println("Stocks sold");
										}
									}
								}
								
							}
						}
				
						break;
					case 3: System.out.println("Money in wallet: $" + ac[id].getWallet() );
						break;
					case 4:cal.add(Calendar.DATE, 1);
					dt = sdf.format(cal.getTime());
					dy++;
					if(dy < 200) {
						for(int i = 0; i < rates.length; i++ ){
							s[i].stockchange(rates[i][dy]);
						}
					}
					
					
						break;
				}
			}
		}
		w.stop();
		if(ac[id].getWallet() >= 10000) {
			System.out.println("You win!!");
			ac[id].addwin();
			ac[id].replacetime( w.getTimeSecs());
		}
		else {
			System.out.println("You lost");
		}
		System.out.println("Your time was " + w.getTimeSecs() + " secounds");
		System.out.println("Days passed: " + dy);
		
	}
}