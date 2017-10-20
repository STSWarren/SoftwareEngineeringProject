
public class main {
	public static void main(String args[]){
		BinaryTree tree = new BinaryTree(1);
		try{
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
		}catch(Exception e){
		
		}
		
		try{
			TreeNode LCA = new TreeNode(""+6,false);
			LCA = findLCA(tree.getRoot(),"6", "2");
			if(LCA!=null){
				System.out.print(LCA.getData());
			}else{
				System.out.print("One or more pieces of data were not present in the tree.");
			}
		}catch(Exception e){
			
		}
		
		
	}
	
	public static TreeNode findLCA(TreeNode r,String dataOne,String dataTwo)throws Exception{
		if(dataOne==null||dataTwo==null){
			throw new Exception("null data not allowed");
		}
		if(r == null){
			return null;
		}
		if(r.getData().equals(dataOne)||r.getData().equals(dataTwo)){
			return r;
		}
		
		TreeNode left = findLCA(r.getLeftChild(),dataOne,dataTwo);
		TreeNode right = findLCA(r.getRightChild(),dataOne,dataTwo);
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
