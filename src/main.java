
public class main {
	public static void main(String args[]){
		BinaryTree tree = new BinaryTree(1);
		
		TreeNode n = new TreeNode(""+2,false);
		tree.add(tree.getRoot(),n,"left");
		n = new TreeNode(""+3,false);
		tree.add(tree.getRoot(),n,"right");
		
		n = new TreeNode(""+4,false);
		tree.add(tree.getRoot().getLeftChild(),n,"left");
		n = new TreeNode(""+5,false);
		tree.add(tree.getRoot().getLeftChild(),n,"right");
		
		n = new TreeNode(""+6,false);
		tree.add(tree.getRoot().getRightChild(),n,"left");
		n = new TreeNode(""+7,false);
		tree.add(tree.getRoot().getRightChild(),n,"right");
		
		TreeNode LCA = findLCA(tree.getRoot(),6, 2);
		System.out.print(LCA.getID());
	}
	
	public static TreeNode findLCA(TreeNode r, int n, int l){
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
