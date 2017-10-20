
public class TreeNode {
	private TreeNode parent;
	private TreeNode rightChild;
	private TreeNode leftChild;
	private boolean isRoot;
	public TreeNode(TreeNode p, TreeNode r, TreeNode l){
		this.parent = p;
		this.rightChild = r;
		this.leftChild = l;
		this.isRoot = false;
	}
	
	public TreeNode(TreeNode r, TreeNode l){
		this.parent = null;
		this.rightChild = r;
		this.leftChild = l;
		this.isRoot = true;
	}
	
	public TreeNode getRightChild(){
		return this.rightChild;
	}
	
	public TreeNode getParent(){
		return this.parent;
	}
	
	public TreeNode getLeftChild(){
		return this.leftChild;
	}
	
	public static boolean isEqual(TreeNode a, TreeNode b){
		if(a.isRoot()&&b.isRoot()){
			return true;
		}else{
			if(a.isRoot()&&!b.isRoot()){
				return false;
			}else{
				if(!a.isRoot()&&b.isRoot()){
					return false;
				}else{
					if(a.getParent()==b.getParent()&&a.getLeftChild()==b.getLeftChild()&&a.getRightChild()==b.getRightChild()) 
						return true;
				}
			}
		}
		return false;
	}
	
	public boolean isRoot(){
		return this.isRoot;
	}
	
}
