class MyInteger {
	int value;
	MyInteger(){
		
	}
	MyInteger(int val){
		value = val;
	}
	public void setValue(int newValue){
		value = newValue;
	}
	public int getValue(){
		return value;
	}
	public boolean isEven(){
		if(value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isOdd(){
		if(value % 2 == 0){
			return false;
		}
		else{
			return true;
		}
		
	}
	public boolean isPrime(){
		if (value <= 1){
			return false;
		}
		for (int i = 2; i < value; i++){
			if (value % i == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(int integer){
		if(integer % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(int integer){
		if(integer % 2 == 0){
			return false;
		}
		else{
			return true;
		}
	}
	public static boolean isPrime(int integer){
		if (integer <= 1){
			return false;
		}
		for (int i = 2; i < integer; i++){
			if (integer % i == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(MyInteger in){
		return isEven(in.getValue());
	}
	public static boolean isOdd(MyInteger in){
		return isOdd(in.getValue());
	}
	public static boolean isPrime(MyInteger in){
			return isPrime(in.getValue());
	}
	public boolean equal(int v, int n){
		if (v == n){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean equals(MyInteger o, int n){
		return equal(o.getValue(), n);
	}
	public static int parseIntC(char[] c){
		int value = 0;
			for(int i = 0; i < c.length; i++) {
				int number = c[i];
				value = value * 10 + number;
			}
		return value;
	}
	public static int parseInt(String wd){
		int value = Integer.parseInt(wd);
		return value;
	}
}