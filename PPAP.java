public class PPAP {
	public static void main (String[] args) {
		ppap("pen", "apple");
		ppap("pen", "pinapple");
		ppap("pointer", "null");
		ppap("scholar", "AP");
	}
	
	public static void ppap (String s1, String s2){
		String sn=s2.substring(0, 1).toUpperCase()+s2.substring(1, s2.length());
		System.out.println("I have a "+s1+", I have a "+sn+".");
		System.out.println("Uh! "+sn+" "+s1+".");
	}
}
