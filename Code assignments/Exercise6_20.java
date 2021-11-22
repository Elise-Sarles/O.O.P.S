import java.util.Scanner;

class Exercise6_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String in = input.nextLine();
		System.out.println("'" + in + "'" + " is " + in.length() + " charters long");
		System.out.println("There are " + countLetters(in) + " letters in " + "'" + in + "'");
	}
	public static int countLetters(String s){
		int count = 0;
		int l = 0;
		int u = 0;
		for(int i = 0; i < s.length(); i++){
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
				count++;
			}
		}
		/*
			for(int i = 0; i < s.length(); i++){
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
					count++;
					l++;
				}
				if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
					count++;
					u++;
				}
			}
		*/
		return count;
		}
					
}