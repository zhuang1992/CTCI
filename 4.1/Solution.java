import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Solution{
	private int _checkBalance(TreeNode r){
		if(r == null)
			return 0;
		int lc = _checkBalance(r.left);
		int rc = _checkBalance(r.right);
		if(lc == -1 || rc == -1)
			return -1;
		if(Math.abs(lc-rc)>1)
			return -1;
		return Math.max(lc, rc)+1;
	}
	public boolean isBalanced(TreeNode root) {
        return _checkBalance(root) == -1? false:true;
    }
}
