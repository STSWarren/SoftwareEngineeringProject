
public class main {
	public static void main(String args[]){
		BinaryTree tree = new BinaryTree(3);
		
	}
	
	public TreeNode findLCA(TreeNode r, int n, int l){
		if(r == null){
			return null;
		}
		if(r.getID().equals(""+n)||r.getID().equals(""+l)){
			return r;
		}
		
		TreeNode left = findLCA(r.getLeftChild(),n,l);
		TreeNode right = findLCA(r.getRightChild(),n,l);
		if(left!=null&&right!=null){
			return r;
		}
		if(left!=null){
			return left;
		}else{
			return right;
		}
	}
}
