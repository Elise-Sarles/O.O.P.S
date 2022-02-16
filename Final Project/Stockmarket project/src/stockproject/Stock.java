package stockproject;
/**
 * <h1> Personal object for Stocks</h1>
 * <p>Created: Jan 28 to Feb 16 2022 </p>
 * 
 * @author Elise Sarles
 *
 */
public class Stock 
	extends Stockmarket {
	double price = 2.0;
	double base = 2.0;
	String name = " ";
	double change = 0.0;
	String ceo = " ";
	String about = " ";
	int owned = 0;
	int id = 0;
	/**
	 * Makes the stock.
	 */
	public Stock() {
		
	}
	/**
	 * Makes the the stock but with more info.
	 * @param price (double; How much the stock is worth)
	 * @param name (String; name of stock)
	 * @param ceo (String; Runner to stock)
	 */
	public Stock(double price, String name, String ceo) {
		this.price = price;
		this.base = price;
		this.name = name;
		this.ceo = ceo;
		
	}
	/**
	 * Makes the the stock but with even more info.
	 * @param price (double; How much the stock is worth)
	 * @param name (String; name of stock)
	 * @param ceo (String; Runner to stock)
	 * @param about (String; about the stock)
	 */
	public Stock(double price, String name, String ceo, String about){
		this.price = price;
		this.base = price;
		this.name = name;
		this.ceo = ceo;
		this.about = about;
	}
	/**
	 * Makes the the stock but with info and number.
	 * @param price (double; How much the stock is worth)
	 * @param name (String; name of stock)
	 * @param ceo (String; Runner to stock)
	 * @param about (String; about the stock)
	 * @param id (int; number to tell stocks apart.)
	 */
	public Stock(double price, String name, String ceo, String about, int id){
		this.price = price;
		this.base = price;
		this.name = name;
		this.ceo = ceo;
		this.about = about;
		this.id = id;
	}
	/**
	 * Change the price of stocks.
	 * @param price (double; How much the stock is worth)
	 */
	public void setPrice(double price) {
		double c = base / this.price;
		change = price / this.price;
		this.price = price;
		if(this.price == 0) {
			this.price = base;
			this.change = c;
		}
	}
	/**
	 * Change the price of the stock base of how the market changes.
	 * @param change (double; the amount the stock price changes)
	 */
	public void stockchange(double change){
		double v = this.price * change;
		double c = base / this.price;
		this.price =  Math.round(v * 100) / 100;
		this.change = change;
		if(this.price == 0) {
			this.price = base;
			this.change = c;
		}
		
		
	}
	/**
	 * to get the price of the stock.
	 * @return price (double; How much the stock is worth)
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * to get the change in price.
	 * @return change (double; the amount the stock price changes)
	 */
	public double getChange() {
		return change;
	}
	/**
	 * to get the change in + form.
	 * @return c (double; the amount the stock price changes as %)
	 */
	public double persent() {
		double c = 0;
		if (change >= 1) {
			c = change - 1;
		}
		else if (change < 1) {
			c = change - 1;
			
		}
		return c * 100;
	}
	/**
	 * to see what type of change.
	 * @return (String; words as which it is)
	 */
	public String nop() {
		if(persent() > 0) {
			return " Increase";
		}
		else if (persent() < 0) {
			return " Decrease";
		}
		else {
			return " No Change";
		}
	}
	/**
	 * To add a owned count. (buy a stock)
	 * @param owned (int; How many of stocks are owned)
	 */
	public void buy(int owned) {
		this.owned += owned;
	}
	/**
	 * To minus a owned count. (Sell a stock)
	 * @param owned (int; How many of stocks are owned)
	 */
	public void sell(int owned) {
		this.owned -= owned;
	}
	/** 
	 * To get how many owned.
	 * @return owned (int; How many of stocks are owned)
	 */
	public int getowned() {
		return owned;
	}
	/**
	 * to get name of stock.
	 * @return name (String; name of stock)
	 */
	public String getname() {
		return name;
	}
	/**
	 * to get the ceo.
	 * @return ceo (String; Runner to stock)
	 */
	public String getCEO() {
		return ceo;
	}
	/**
	 * To get the about.
	 * @return about (String; about the stock)
	 */
	public String getAbout() {
		return about;
	}
	/**
	 * to get the id.
	 * @return id (int; number to tell stocks apart.)
	 */
	public int getID() {
		return id;
	}
	/**
	 * To show info about the object to owner.
	 * @return (String; Some of the info about the stock)
	 */
	public String stockString() {
		return "Name: " + name  + "\nPrice: $" + price + "\nCeo: " + ceo + "\nAbout: " + about + "\nOwned: "+ owned;
	}
	/**
	 * To show info about the object on the buy page.
	 * @return (String; some relevant info about the Stock)
	 */
	public String endString() {
		return "Name: " + name  + "\nPrice: $" + price + "/nMost recent rate of change: %" + persent() + nop() + "\nCeo: " + ceo + "\nAbout: " + about + "\nID: (" + id + ")";
	}
	/**
	 * To show info about the object on the sell page.
	 * @return (String; some relevant info about the Stock)
	 */
	public String sellString() {
		return "Name: " + name  + "\nPrice: $" + price + "/nMost recent rate of change: %" + persent() + nop() + "\nCeo: " + ceo + "\nAbout: " + about + "\nID: (" + id + ")"+ "\nOwned: "+ owned;
	}
}
