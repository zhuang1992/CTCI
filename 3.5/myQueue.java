package workbench;

import java.util.Stack;

public class myQueue {
	Stack<Integer>s1,s2;
	myQueue(){
		s1 = new Stack();
		s2 = new Stack();
	}
	private void push(int i){
			s1.push(i);		
	}
	private void pop(){
		while(!s1.empty()){
			s2.push(s1.pop());
		}
		s2.pop();
		while(!s2.empty()){
			s1.push(s2.pop());
		}		
	}
	private int front(){
		while(!s1.empty()){
			s2.push(s1.pop());
		}
		int res = s2.peek();
		while(!s2.empty()){
			s1.push(s2.pop());
		}	
		return res;
	}
	public static void main(String[] args){
		myQueue test = new myQueue();
		test.push(6);
		test.push(5);
		test.push(1);
		System.out.println(test.front());
		test.pop();
		System.out.println(test.front());
	}
}
