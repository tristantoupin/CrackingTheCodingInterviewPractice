import java.util.Stack;

public class Question02 {
	
	public static void main(String[] args){

		Stack<Integer> stackA = new Stack<Integer>();
		Stack<Integer> stackB = new Stack<Integer>();
		
		MyQueue q = new MyQueue(stackA, stackB);
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < arr.length/2; i++){
			q.push((Integer) arr[i]); 
			System.out.println("Push: " + arr[i]);
		}
		
		Integer temp = q.pop();
		System.out.println("The first pop is: " + temp);
		
		for (int i = 4; i < arr.length; i++){
			q.push((Integer) arr[i]); 
			System.out.println("Push: " + arr[i]);
		}
		
		while(true){
			try{
				Integer t = q.pop();
				System.out.println("Pop: " + t);
			} 	finally{}
			
		}		
	}
}
