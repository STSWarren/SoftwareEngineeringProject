import java.util.Random;

public class main {
	public static void main(String args[]){
		Tree tree = new Tree("data1");
		try{
			TreeNode n = new TreeNode(""+2,false,""+tree.getTreeSize());
			tree.add(tree.getRoot(),n);
			n = new TreeNode(""+3,false,""+tree.getTreeSize());
			tree.add(tree.getRoot(),n);
			n = new TreeNode(""+4,false,""+tree.getTreeSize());
			int index = randInt(0,tree.getRoot().getChildren().size()-1);
			TreeNode parent = tree.getRoot().getChild(index);
			tree.add(parent,n);
			n = new TreeNode(""+5,false,""+tree.getTreeSize());
			index = randInt(0,tree.getRoot().getChildren().size()-1);
			parent = tree.getRoot().getChild(index);
			tree.add(parent,n);
			n = new TreeNode(""+6,false,""+tree.getTreeSize());
			index = randInt(0,parent.getChildren().size()-1);
			parent = parent.getChild(index);
			tree.add(parent,n);
			n = new TreeNode(""+7,false,""+tree.getTreeSize());
			index = randInt(0,parent.getChildren().size()-1);
			parent = parent.getChild(index);
			tree.add(parent,n);
		}catch(Exception e){
		
		}
		
		try{
			TreeNode LCA=null;
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
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}

