public class Triangle
	extends GeometricObject implements Colorable{
		double side1 = 1.0;
		double side2 = 1.0;
		double side3 = 1.0;
		
		
		Triangle(){
		}
		Triangle(double s1, double s2, double s3){
			side1 = s1;
			side2 = s2;
			side3 = s3;
		}
		Triangle(double s1, double s2, double s3, String color, boolean filled){
			side1 = s1;
			side2 = s2;
			side3 = s3;
			setColor(color);
			setFilled(filled);
		}
		public String getSides(){
			return "Side 1: " + side1 + "Side 2: " + side2 + "Side 3: " + side3;
		}
		public void setSides(double s1, double s2, double s3){
			side1 = s1;
			side2 = s2;
			side3 = s3;
		}
		public double getSide1(){
			return side1;
		}
		public void setSide1(double s1){
			side1 = s1;
		}
		public double getSide2(){
			return side2;
		}
		public void setSide2(double s2){
			side2 = s2;
		}
		public double getSide3(){
			return side3;
		}
		public void setSide3(double s3){
			side3 = s3;
		}
		@Override
		public double getArea(){
			double s = (side1 + side2 + side3) / 2;
			double t = s * (s - side1) * (s - side2) * (s - side3);
			double a = Math.sqrt(t);
			return a;
		}
		@Override
		public double getPerimeter(){
			return side1 + side2 + side3;
		}
		
		public String toString(){
			return "Triangle: \nside1: " + side1 + "\nside2: " + side2 + "\nside3: " + side3 + "\n" + endString();
		}
		@Override
		public String HowtoColor(){
			return "Color all three sides";
		}
		
	}