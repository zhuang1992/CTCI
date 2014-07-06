//3.6
//O(n^2)
package workbench;

import java.util.Stack;

public class sortStack {
	int min;
	Stack<Integer>s1,s2;
	sortStack(){
		s1=new Stack();
		s2=new Stack();
		min=999999;
		s1.push(3);
		s1.push(1);
		s1.push(4);
		s1.push(1);
		s1.push(5);
		s1.push(9);
		s1.push(2);
		s1.push(6);
	}
	
	int min(int a,int b){
		if(a<=b)return a;
		return b;
	}
	void sort(){
		int size = s1.size();
		for(int i = 0;i < size;i++){
			boolean remove=false;
			while(s2.size()<size-i){
				min = min(min,s1.peek());
				s2.push(s1.pop());
			}
			s1.push(min);
			while(!s2.empty()){
				if(s2.peek()==min&&remove==false){
					s2.pop();
					remove=true;
					continue;
				}
				if(!s2.empty()){
					s1.push(s2.pop());	
				}
			}
			min=999999;
		}
	}
	void output(){
		while(!s1.empty()){
			System.out.println(s1.pop());
		}
	}
	public static void main(String[] args){
		sortStack test = new sortStack();
		test.sort();
		test.output();
	}
}
