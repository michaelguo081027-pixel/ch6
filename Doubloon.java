public class Doubloon {
	public static void main (String[] args) {
		String word=""; //try type something else
		System.out.print(isDoubloon(word));
	}
	
	public static boolean isDoubloon (String str){
		String test=str;
		for (int i=0; i<test.length(); i++){
			if(number(test, test.charAt(i))%2!=0){
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

