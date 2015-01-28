import java.util.ArrayList;
import java.util.Stack;


public class AStack<T> {
	private static int stackSize;
	ArrayList<T> arr;
	int h[];
	AStack(int size){
		stackSize = size;
		arr = new ArrayList<T>(stackSize*3);
		while(arr.size() < stackSize*3)
			arr.add(null);
		h = new int[3];
	}
	void push(int i, T num) throws Exception{
		if(h[i] == stackSize){
			throw new Exception();
		}
		arr.set(h[i]+i*100, num);
		h[i]++;
	}
	T pop(int i) throws Exception{
		if(h[i] == 0){
			throw new Exception();
		}
		h[i] --;
		T res = arr.get(h[i]+i*100);
		arr.set(h[i], null);
		return res;		
	}
	boolean isEmpty(int i){
		return h[i]==0;
	}
	int size(int i){
		return h[i];
	}
}
