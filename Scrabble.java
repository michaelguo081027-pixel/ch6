public class Scrabble {
	public static void main (String[] args) {
		//try type something else
		String given="";
		String test="";
		System.out.print(canSpell(given, test));
	}
	
	public static boolean canSpell (String given, String test){
		for (int i=0; i<test.length(); i++){
			if(number(given, test.charAt(i)) < number(test, test.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	public static int number (String s, char c){
		int count=0;
		for (int j=0; j<s.length(); j++){
			if(s.charAt(j)==c){
				count++;
			}
		}
		return count;
	}
}
