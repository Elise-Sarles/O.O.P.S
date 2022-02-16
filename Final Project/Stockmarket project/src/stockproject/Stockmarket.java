package stockproject;
/**
 * <h1> Abstract object the Stock Market</h1>
 * <p>Created: Feb 16 2022 </p>
 * 
 * @author Elise Sarles
 *
 */
public abstract class Stockmarket {
	///in the stock market there are both stock bonds and a few other things they would also fall under this class.
	private String type = "Stock";
	private boolean sellable = true;
	private java.util.Date dateCreated;
	/**
	 * Creates the stock market
	 */
	Stockmarket(){
		dateCreated = new java.util.Date();
	}
	/**
	 * Creates the stock market but better.
	 * @param type (String; what is it in the market)
	 * @param sellable (Boolean; can you sell it or not)
	 */
	Stockmarket(String type, boolean sellable){
		this.type = type;
		this.sellable = sellable;
		dateCreated = new java.util.Date();
	}
	/**
	 * to get the type.
	 * @return type (String; what is it in the market)
	 */
	public String getType(){
		return type;
	}
	/**
	 * Change the type.
	 * @param type (String; what is it in the market)
	 */
	public void setType(String type){
		this.type = type;
	}
	/**
	 * to get if it can be sold.
	 * @return sellable (Boolean; can you sell it or not)
	 */
	public boolean isSellable(){
		return sellable;
	}
	/**
	 * change whether it can be sold.
	 * @param sellable (Boolean; can you sell it or not)
	 */
	public void setSellable(boolean sellable){
		this.sellable = sellable;
	}
	/**
	 * Get the date made.
	 * @return dateCreated (Date; time stock market was made)
	 */
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	/**
	 * abstract for things extended to get price.
	 * @return price (double; how much it cost)
	 */
	public abstract double getPrice();
	/**
	 * abstract for things extended to get how many owned.
	 * @return owned (int; How many of stocks are owned)
	 */
	public abstract int getowned(); 
}
