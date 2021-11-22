import java.util.Scanner;

class Exercise6_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 1;
		while(i == 1){
			System.out.println("Enter the length of the 3 sides of the triangle: ");
			double side1 = input.nextInt();
			double side2 = input.nextInt();
			double side3 = input.nextInt();
			if(isValid(side1, side2, side3)){
				System.out.printf("%s%4.1f\n","Side 1: " , side1);
				System.out.printf("%s%4.1f\n","Side 2: " , side2);
				System.out.printf("%s%4.1f\n","Side 3: " , side3);
				System.out.printf("%s%6.1f\n","Area: " , area(side1, side2, side3));
				i++;
			}
			else{
				System.out.println("That is not a valid triangle");
			}
			
		}
	}
	public static boolean isValid(double side1, double side2, double side3){
		
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
			return false;
		}
		else{
			return true;
		}
	}
	public static double area(double side1, double side2, double side3){
		double s = ((side1 + side2 +side3) / 2);
		double a = (s * (s - side1) * (s - side2) * (s - side3));
		double area = Math.sqrt(a);
		return area;
	}
}