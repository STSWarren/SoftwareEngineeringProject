public class BinaryTree{
	private static TreeNode root;
	private int counter = 0;
	
	public BinaryTree(int data){
		this.root = new TreeNode(""+data,true);
		this.counter++;
	}
	
	public void add(TreeNode parent,TreeNode child, String orientation){
		if (orientation.equals("left"))
        {
           parent.setLeftChild(child);
        }
        else
        {
            parent.setRightChild(child);
        }
		this.counter++;
	}
	
	public int getTreeSize(){
		return this.counter;
	}
}