import java.util.*;

public class MyQueue{
	private Stack<Integer> stackA;
	private Stack<Integer> stackB;

	public MyQueue(Stack<Integer> stackA, Stack<Integer> stackB){
		this.stackA = stackA;
		this.stackB = stackB;
	}
	
	public void push(Integer e){
		this.stackA.push(e);
	}
	
	public Integer pop(){
		if (this.stackB.empty()){
			this.transfer();
		}
		return (Integer) this.stackB.pop();
	}
	
	public void transfer(){
		while (!this.stackA.empty()){
			this.stackB.push(this.stackA.pop());
		}
	}
}