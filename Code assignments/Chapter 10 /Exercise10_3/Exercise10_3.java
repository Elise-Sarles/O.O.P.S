import java.util.Scanner;
class Exercise10_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a starting integer: ");
		int n = input.nextInt();
		MyInteger a = new MyInteger(n);
		System.out.println("The value is equal to 10: " +a.equal(n, 10));
		System.out.println("The starting integer is " + a.getValue());
		System.out.println("It is a even number: " + a.isEven() );
		System.out.println("It is a odd number: " + a.isOdd());
		System.out.println("It is a prime number: " + a.isPrime());
		char[] c = new char[n];
		for(int i = 0; i < c.length; i++){
			int l = (int)(Math.random() * 10);
			c[i] = (char)l;
		}
	
		System.out.print("The array for the integer " + n + " is " + a.parseIntC(c));
	
		System.out.println("\nStarting integer already chosen");
		MyInteger b = new MyInteger(18);
		System.out.println("Enter a possible integer value: ");
		int m = input.nextInt();
		System.out.println("The value is equal to " + m + ": " + b.equals(b, m));
		System.out.println("The starting integer is " + b.getValue());
		System.out.println("It is a even number: " + b.isEven(b) );
		System.out.println("It is a odd number: " + b.isOdd(b));
		System.out.println("It is a prime number: " + b.isPrime(b));
		System.out.println("Enter a string of 4 numbers");
		String l = "" + input.nextInt();
		System.out.println("As an Integer it looks like " + b.parseInt(l));
		
		
	
		
		
	}
}