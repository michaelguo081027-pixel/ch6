public class Binary {
	public static void main (String[] args) {
		System.out.print(convertToBinary(124));
	}
	
	public static String convertToBinary (int n){
		String s="";
		String b="";
		for (int i=n; i>0; i=i/2){
			if(i%2==0){
				s=s+"0";
			}else{
				s=s+"1";
			}
		}
		for (int j=s.length()-1; j>=0; j--){
			b=b+s.substring(j, j+1);
		}
		return b;
	}
}

