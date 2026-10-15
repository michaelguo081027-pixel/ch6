public class Roots {
	//displaying input and output to test
	public static void main (String[] args) {
		int a = 9;
		double x = a / 2.0;
		System.out.printf("The square root of %d is %.4f", a, squareRoot(x, a));
	}
	//method squareRoot
	public static double squareRoot (double x, int a){
		int t = 3;
		while(t >= 0){
			x = (x + a / x) / 2.0;
			t--;
		}
		return x;
	}
}
