
public class TreeNode {
	private String id;
	private TreeNode rightChild;
	private TreeNode leftChild;
	private boolean isRoot;
	public TreeNode(String p, TreeNode r, TreeNode l, boolean d){
		this.id = p;
		this.rightChild = r;
		this.leftChild = l;
		this.isRoot = d;
	}
	
	public TreeNode(String p){
		this.id = p;
		this.rightChild = null;
		this.leftChild = null;
		this.isRoot = false;
	}
	
	public TreeNode getRightChild(){
		return this.rightChild;
	}
	
	public String getID(){
		return this.id;
	}
	
	public TreeNode getLeftChild(){
		return this.leftChild;
	}
	
	public static boolean isEqual(TreeNode a, TreeNode b){
		if(a.getID().equals(b.getID())){
			return true;
		}
		return false;
	}
	
	public boolean isRoot(){
		return this.isRoot;
	}
	
}
