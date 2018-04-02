
public class Tree {
	private static TreeNode root;
	private int counter = 0;
	public Tree(String data){
		try{
			this.root = new TreeNode(""+data,true,""+counter);
			this.counter++;
		}catch(Exception e){
			
		}
	}
	
	public void add(TreeNode parent,TreeNode child){
		if(parent!=null&&child!=null){
			if(!parent.addChild(child)){
				System.out.print("This parent/child pairing is invalid\n");
			}else{
				counter++;
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
