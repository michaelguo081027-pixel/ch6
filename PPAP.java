public class PPAP {
	public static void main (String[] args) {
		System.out.println(ppap("I have a pen, I have an apple"));
		System.out.println(ppap("I have a pen, I have an pineapple"));
		System.out.println(ppap("I have a pointer, I have a null"));
		System.out.println(ppap("I have a scholar, I have a AP"));
	}
	
	public static String ppap (String s){
		String s1=s.substring(9, s.indexOf(","));
		String s2=s.substring(s.lastIndexOf(" ")+1, s.length());
		String sn=s2.substring(0, 1).toUpperCase()+s2.substring(1, s2.length());
		String line="Uh! "+sn+" "+s1;
		return line;
	}
}
