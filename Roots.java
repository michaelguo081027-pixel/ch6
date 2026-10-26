public class Roots {
	//try any integer number for a and any decimal number for x
	public static void main (String[] args) {
		int a = 0;
		double x = a / 2.0;
		System.out.print("The square root of "+a+" is "+squareRoot(x, a));
	}

	public static double squareRoot (double x, int a){
		int t = 3;
		while(t >= 0){
			x = (x + a / x) / 2.0;
			t--;
		}
		return x;
	}
}
