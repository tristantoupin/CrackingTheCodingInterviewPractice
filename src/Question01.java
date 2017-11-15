import java.util.Arrays;

public class Question01 {

	public static void main(String[] args){
		String str1 = "ACCDBC+";
		String str2 = "ABCDC+C";
		
		int[] arr = new int[256];
		
		for (int i = 0; i < str1.length(); i++){
			int a = str1.charAt(i);
			arr[a] += 1;			
		}
		
		for (int i = 0; i < str2.length(); i++){
			int a = str2.charAt(i);
			arr[a] -= 1;
			if (arr[a] < 0){
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");

	}
	
}
