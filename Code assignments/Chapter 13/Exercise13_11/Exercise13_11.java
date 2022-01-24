public class Exercise13_11 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon oct1 = new Octagon(6);
		Octagon oct2 = (Octagon)oct1.clone();
		
		System.out.print(oct1.comparableTo(oct2));
	}
}
