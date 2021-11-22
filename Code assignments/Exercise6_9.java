/// Elise Sarles, Nov 22, CSCI 1111, biulding two methods to convert feet to meters and meters to feet.
class Exercise6_9 {
	public static void main(String[] args) {
		System.out.printf("%s%8s%s \n"," Feet \t Meters", "\t","Meters \t Feet");
		System.out.print("___________________________________________________ \n");
		double feet = 1;
		double meter = 20;
			while(feet <= 10 && meter <= 65){
				System.out.printf("%5.1f%2s%8.3f%8s%5.1f%2s%8.3f\n", feet," ", footToMeter(feet), "", meter," ", meterToFoot(meter));
				feet += 1;
				meter += 5;
		}

	}
	public static double footToMeter(double foot){
		double meter = foot * 0.305;
		return meter;

	}
	public static double meterToFoot (double meter){
		double foot = meter * 3.279;
		return foot;
	
	}
	
}