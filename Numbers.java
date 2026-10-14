public class Numbers {
	//two exercises: method squareRoot && method gauss
	public static void main (String[] args) {
		int a = 4;
		double x = a / 2.0;
		int n = 1;
		System.out.printf("The square root of %d is %.4f\n", a, squareRoot(x, a));
		System.out.println(gauss(x, n));
	}
	
	public static double squareRoot (double x, int a){
		int t = 3;
		while(t >= 0){
			x = (x + a / x) / 2.0;
			t--;
		}
		return x;
	}
	
	public static double gauss (double x, int n){
		double i = x;
		int k = -1;
		int l = n;
		double h = 1.0;
		double m;
		while(n>1){
			if(n>1){
				k = k * -1;
				l = l * (n - 1);
				x = x * i;
			}
			n--;
			m=k * x / l;
			h=h+m;
		}
		return h;
	}
}
