import java.util.Scanner;
class Exercise6_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		while (count == 0){
			System.out.print("Enter a password: ");
			String s = input.nextLine();
			if(isValid(s)){
				System.out.println( "Valid password");
				count++;
			}
			else{
				System.out.println("Invalid Password");
				System.out.println();
			}
		}
		
	}
	public static boolean isValid(String s){
		if (lengthValid(s) && isNorD(s) && numberdigit(s)){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean lengthValid(String s){
		if (s.length() < 8){
			return false;
		}
		else{
			return true;
		}
	}
	public static boolean isNorD(String s){
		boolean r = false;
		for(int i = 0; i < s.length(); i++){
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || ( s.charAt(i) >= '0' && s.charAt(i) <= '9')){
				r = true;
			}
			else{
				r = false;
			}
		}
		return r;
	}
	public static boolean numberdigit(String s){
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if ( s.charAt(i) >= '0' && s.charAt(i) <= '9'){
				count++;
			}
		}
		if (count < 2){
			return false;
		}
		else{
			return true;
		}
	}
}