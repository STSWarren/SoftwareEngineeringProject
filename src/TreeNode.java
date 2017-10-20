
public class TreeNode {
	private String data;
	private TreeNode rightChild;
	private TreeNode leftChild;
	private boolean isRoot;
	
	public TreeNode(String p, boolean root)throws Exception{
		if(p==null){
			throw new Exception("null data is not allowed");
		}else{
			this.data = p;
			this.rightChild = null;
			this.leftChild = null;
			this.isRoot = root;
		}
	}
	
	public void setRightChild(TreeNode r){
		this.rightChild = r;
	}
	
	public void setLeftChild(TreeNode l){
		this.leftChild = l;
	}
	
	public TreeNode getRightChild(){
		return this.rightChild;
	}
	
	public String getData(){
		return this.data;
	}
	
	public TreeNode getLeftChild(){
		return this.leftChild;
	}
	
	public boolean isRoot(){
		return this.isRoot;
	}
	
}
