
public class Sea02 {

	public static void main(String[] args){
		String in1 = "qwertyuion";
		String in2 = "qn";
		
		System.out.println(reverse(in1));
		System.out.println(reverse(in2));
	}
	
	public static String reverse(String input){
		if (input.length() < 3) 
			return input;
		String output = "";
		
		for (int i = input.length()-2; i >= 0; i--){
			output += input.charAt(i);
		}
		output += 'n';
		return output;
	}
	
}
