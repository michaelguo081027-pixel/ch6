public class Gauss {	
	public static void main (String[] args) {
		double x = 4.0;
		int n = 2;
		System.out.print(gauss(x, n));
	}
	
	public static double gauss (double x, int n){
		int j=1;
		double k=1.0;
		int l=1;
		double m;
		double h=1.0;
		for(int i = n ; i > 0; i--){
			j=j*-1;
			for(int g = n * 2; g > 0; g--){	
				k=k*x;
			}
			for(int f = n; f > 0; f--){
				if(i-1<=0){
					l=l*1;
				}else{
					l=l*(i-1);
				}
			}
			m=j*k/l;
			h=h+m;
		}
		return h;
	}
}
