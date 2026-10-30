public class PigLatin {
	public static void main (String[] args) {
		System.out.println(pigLatin("car"));
		System.out.println(pigLatin("starcraft"));
	}
	
	public static String pigLatin (String s){
		String str="";
		String space=" ";
		if(s.length()<=2)return s;
		else{
			if(str.contains(space)){
				return s;
			}else{
				for(int i=1; i<s.length(); i++){
					str=str+s.substring(i,i+1);
				}	 
				str=str+s.substring(0,1)+"ay";
				return str;
			}
		}
	}
}

