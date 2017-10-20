public class BinaryTree{
	private static TreeNode root;
	private int counter = 0;
	
	public BinaryTree(int data){
		try{
			this.root = new TreeNode(""+data,true);
		}catch(Exception e){
			
		}
		
		this.counter++;
	}
	
	public void add(TreeNode parent,TreeNode child, String orientation){
		if(parent!=null&&child!=null){
			if (orientation.equals("left")){
				parent.setLeftChild(child);
	           this.counter++;
	        }
	        else{
	        	if(orientation.equals("right")){
	        		parent.setRightChild(child);
		            this.counter++;
	        	}else{
	        		System.out.print("Enter a valid orientation (left/right)\n");
	        	}
	        }
		}else{
			System.out.print("Null nodes are not allowed\n");
		}
	}
	
	public int getTreeSize(){
		return this.counter;
	}
	public TreeNode getRoot(){
		return root;
	}
}