class Rectangle {
	double width = 1;
	double height = 1;
	double area = 1;
	double perimeter = 4;
	
	public Rectangle(){
	}
	public void setHeight(double newheight){
		height = newheight;
	}
	public void setWidth(double newwidth){
		width = newwidth;
	}
	public void getArea(){
		area = width * height;
	}
	public void getPerimeter(){
		perimeter = 2 * (width + height);
	}
}
