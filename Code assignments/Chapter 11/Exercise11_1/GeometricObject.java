import java.util.*;

public class GeometricObject {
	private java.util.Date dateCreated;
	private String color = "White";
	private boolean fill = false;
	
	GeometricObject(){
		dateCreated = new java.util.Date();
	}
	GeometricObject(String a, boolean b ){
		color = a;
		fill = b;
	}
	public void setColor(String a){
		color = a;
	}
	public void setFill(boolean b){
		fill = b;
	}
	public String isFilled(){
		if (fill == false){
			return "Shape is not filled";
		}
		else {
			return "Shape is filled";
		}
	}
	public String endString(){
		return "Was created " + dateCreated + ". " + isFilled() + ". Color: " + color;
	}
	
}