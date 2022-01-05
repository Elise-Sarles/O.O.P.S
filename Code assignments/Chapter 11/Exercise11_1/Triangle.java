import java.nio.file.*;

public class Triangle
	extends GeometricObject{
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
		public double getArea(){
			double s = (side1 + side2 + side3) / 2;
			double t = s * (s - side1) * (s - side2) * (s - side3);
			double a = Math.sqrt(t);
			return a;
		}
		public double getPerimeter(){
			return side1 + side2 + side3;
		}
		
		public String toString(){
			return "Triangle: \nside1 = " + side1 + "\nside2 = " + side2 + "\n side3 = " + side3 + "\n" + endString();
		}
		
	}
	