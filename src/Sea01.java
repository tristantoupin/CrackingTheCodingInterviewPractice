public class Sea01 {	
	
	public static void main(String[] args){
		
		String ex1 = "ia9";

		System.out.println(unique(ex1));
	}
	
	public static boolean unique(String str){
		boolean[] letters = new boolean[26];
		
		for (int i = 0; i < str.length(); i++){
			int position = str.charAt(i) - 97;
			if (letters[position]){
				return false;
			} else {
				letters[position] = true;
			}		
		}
		return true;
	}
	
}
