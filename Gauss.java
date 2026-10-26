public class Gauss {
	public static void main (String[] args) {
		//try any decimal number for x and integer number for n
		double x=0.0;
		int n=0;
		System.out.print("e^"+-x*x+" is approximately "+gauss(x, n));
	}
	
	public static double gauss (double x, int n){
		double sum=1.0;
		double current=1.0;
		double next=0.0;
		for(int i=1; i<n; i++){
			next=current * (-x*x/i);
			sum+=next;
			current=next;
		}
		return sum;
	}
}
