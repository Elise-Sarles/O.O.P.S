public class Exercise13_7 {
	public static void main(String[] args) {
		GeometricObject [] objects = {new Triangle(3, 4, 5), new Triangle(5, 6, 7), new Triangle(6, 7, 8), new Triangle(1, 1, 1), new Triangle(5, 5, 5) };
		
		for ( int i = 0; i < objects.length; i++){
			System.out.println("Triangle #" + (i + 1));
			System.out.println("How to color: "+((Colorable)objects[i]).HowtoColor());
			System.out.println("Area: " + objects[i].getArea());
		}
	
		
	}
}
