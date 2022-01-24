public class Octagon
	extends GeometricObject implements Colorable, Comparable<Octagon>, Cloneable{
		double side = 1.0;
		
		Octagon(){
		}
		Octagon(double side){
			this.side = side;
		}
		Octagon(double side, String color, boolean filled){
			this.side = side;
			setColor(color);
			setFilled(filled);
		}
		public void setSide(double side){
			this.side = side;
		}
		public double getside(){
			return side;
		}
		@Override
		public double getArea(){
			return ((2 + (4 / Math.sqrt(2))) * side * side);
		}
		@Override
		public double getPerimeter(){
			return (side * 8);
		}
		public String toString(){
			return "Octagon: \nSide lengths: " + side + "\n"+ endString();
		}
		@Override
		public String HowtoColor(){
			return "Color all eight sides";
		}
		@Override
		public int comparableTo(Octagon o){
			if(getArea() < o.getArea()){
				return 1;
			}
			else if(getArea() > o.getArea()){
				return -1;
			}
			else{
				return 0;
			}
		}
		@Override
		public Object clone() throws CloneNotSupportedException {
			Octagon octclone = (Octagon)super.clone();
			octclone.dateCreated = (java.util.Date)(dateCreated.clone());
			return octclone;
		}
}