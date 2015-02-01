import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class Solution{
	List<List<TreeNode>> listLevel(TreeNode r){
		List<List<TreeNode>> rst = new LinkedList<List<TreeNode>>();
		Queue<TreeNode> Q = new LinkedList<TreeNode>();
		Queue<TreeNode> nxt = new LinkedList<TreeNode>();
		Q.add(r);
		while(!Q.isEmpty()){
			LinkedList<TreeNode> level = new LinkedList<TreeNode>();
			while(!Q.isEmpty()){
				TreeNode f = Q.poll();
				level.add(f);
				if(f.left != null)
					nxt.add(f.left);
				if(f.right != null)
					nxt.add(f.right);
			}
			rst.add(level);
			while(!nxt.isEmpty()){
				Q.add(nxt.poll());
			}
		}
		return rst;
	}
	public static void main(String[] args){
		Solution test = new Solution();
		TreeNode r = new TreeNode(4);
		r.left = new TreeNode(2);
		r.left.right = new TreeNode(3);
		r.left.left = new TreeNode(1);
		List<List<TreeNode>> rst = test.listLevel(r);
		for( List<TreeNode> list : rst){
			for(TreeNode i: list){
				System.out.print(i.val+"  ");
			}
			System.out.println("");
		}
	}
}
