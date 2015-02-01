//Find least common ancestor of r1 and r2. 
//r1 and r2 might not exist in the tree. 

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class Solution{
	boolean found1 = false;
	boolean found2 = false;
	TreeNode _findLCA(TreeNode r, TreeNode r1, TreeNode r2){
		if(r == null) return null;
		if(r == r1){
			found1 = true;
			return r;
		}
		if(r == r2){
			found2 = true;
			return r;
		}
		TreeNode ll = _findLCA(r.left, r1, r2);
		TreeNode rr = _findLCA(r.right, r1, r2);
		if(ll != null && rr != null)
			return r;
		return ll == null ? rr:ll;
	}
	boolean _find(TreeNode root, TreeNode r){
		if(root == null)
			return false;
		if(root == r)
			return true;
		return _find(root.left, r) || _find(root.right, r);
	}
	TreeNode findLCA(TreeNode r, TreeNode r1, TreeNode r2){
		TreeNode rst = _findLCA(r, r1, r2);
		if(rst != null && found1 && found2){
			return rst;
		}else if(found1 && _find(rst, r2)){
			return rst;
		}else if(found2 && _find(rst, r1)){
			return rst;
		}else
			return null;
	}
	public static void main(String[] args){
		Solution test = new Solution();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(5);
		root.right.right = new TreeNode(8);
		System.out.println(test.findLCA(root, new TreeNode(5), new TreeNode(8)).val);
	}
}
