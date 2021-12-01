/// Elise sarles Dec 1 2021 Rectangle object making.
class Exercise9_1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setHeight(40);
		r1.setWidth(8);
		r1.getArea();
		r1.getPerimeter();
		Rectangle r2 = new Rectangle();
		r2.setHeight(3.5);
		r2.setWidth(35.9);
		r2.getArea();
		r2.getPerimeter();
		
		System.out.println("The first rectangle is " + r1.width + " by " + r1.height + ". The area is " + r1.area + " and the perimeter is " + r1.perimeter);
		System.out.println("The second rectangle is " + r2.width + " by " + r2.height + ". The area is " + r2.area + " and the perimeter is " + r2.perimeter);
	}
}
