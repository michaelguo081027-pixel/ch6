public class Palindrome {
	public static void main (String[] args) {
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("aibohphobia"));
		System.out.println(isPalindrome("TACOCAT"));
		System.out.println
		(isPalindrome("A man, a plan, a canal: Panama."));
		System.out.println(isPalindrome("Amy, must I jujitsu my ma?"));
	}
	
	public static boolean isPalindrome (String s){
		String testS=plainLowLetters(s);
		String compareS="";
		for(int i=testS.length()-1; i > -1; i--){
			compareS=compareS+testS.substring(i, i+1);
		}
		if(compareS.equals(testS)){
			return true;
		}else{
			return false;
		}
	}
	
	public static String plainLowLetters (String s){
		String nonLetters=",.:;()[]{}!@#$%^&*-=_+|'?/ ";
		String newS="";
		for(int i=0; i<s.length(); i++){
			if(!nonLetters.contains(s.substring(i, i+1))){
				newS=newS+s.substring(i, i+1);
			}
		}
		return newS.toLowerCase();
	}
}
