import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Solution{
	Stack<Integer> S = new Stack<Integer>();
	Stack<Integer> tmp = new Stack<Integer>();
	void sortStack(){
		S.push(3);
		S.push(1);
		S.push(4);
		S.push(1);
		S.push(5);
		S.push(9);
		
		while(!S.isEmpty()){xdecfb4
			int topS = S.pop();
			int cnt = 0;
			while(!tmp.isEmpty() && tmp.peek() > topS){
				S.push(tmp.pop());
				cnt ++;
			}
			tmp.push(topS);
			while(cnt -- > 0){
				tmp.push(S.pop());
			}
		}
		while(!tmp.isEmpty()){
			System.out.println(tmp.pop());
		}
	}
	public static void main(String[] args){
		Solution test = new Solution();
		test.sortStack();
	}
}
