public class Doubloon {
	public static void main (String[] args) {
		String word="ABCEDF";
		System.out.print(toLowerCase(word));
	}
	
	public static boolean isDoubloon (String str){
		String test=toLowerCase(str);
		for (int i=0; i<test.length()-1; i++){
			return false;
		}
		return true;
	}
	
	public static String toLowerCase (String original){
		String allLowerCase="";
		for(int j=0; j<original.length(); j++){
			if(original.charAt(j)<='Z' && original.charAt(j)>='A'){
				allLowerCase=allLowerCase+(original.charAt(j)+26);
			}else{
				allLowerCase=allLowerCase+original.charAt(j);
			}
		}
		return allLowerCase;
	}
}

