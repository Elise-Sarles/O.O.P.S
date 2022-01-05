import java.util.Scanner;
class Exercise11_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Triangle t1 = new Triangle();
		do{
			System.out.println("Enter the 3 sides of a triangle");
			t1.setSide1(input.nextDouble());
			t1.setSide2(input.nextDouble());
			t1.setSide3(input.nextDouble());
			if(!isValid(t1.getSide1(), t1.getSide2(), t1.getSide3())) {
				System.out.println("Not a valid triangle try again.");
			}
		}while (!isValid(t1.getSide1(), t1.getSide2(), t1.getSide3()));
		System.out.println("Enter the color of the triangle");
		t1.setColor(input.next());
		System.out.println("Is the shape filled. Enter true or false");
		t1.setFill(input.nextBoolean());
		System.out.println(t1.toString());
		System.out.println("The area is " + t1.getArea());
		System.out.println("The perimeter is " + t1.getPerimeter());
	}
	public static boolean isValid(double side1, double side2, double side3){
		
			if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
				return false;
			}
			else{
				return true;
			}
	}
}