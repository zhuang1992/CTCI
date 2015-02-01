import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//Or we can use something like Suffix Link to do something like KMP on the tree?
public class Solution{
	TreeNode isSubTree(TreeNode root, TreeNode sr){
		if(root == null)
			return null;
		if(_isMatch(root, sr))
			return root;
		TreeNode ll = isSubTree(root.left, sr); 
		return  ll == null? isSubTree(root.right, sr):ll;
	}
	boolean _isMatch(TreeNode r1, TreeNode r2){
		if(r1 == null && r2 == null)
			return true;
		if(r1 == null || r2 == null)
			return false;
		if(r1.val != r2.val)
			return false;
		return _isMatch(r1.left, r2.left) && _isMatch(r1.right, r2.right);	
	}
	
	public static void main(String[] args){
		Solution test = new Solution();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(5);
		root.right.right = new TreeNode(8);
		TreeNode nr = new TreeNode(5);
		nr.left = new TreeNode(8);
		System.out.println(test.isSubTree(root, nr));
	}
}
