import java.util.ArrayList;
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
	
	public static TreeNode findLCA(TreeNode A, TreeNode B){
		if(A.isRoot()){
			return A;
		}
		if(B.isRoot()){
			return B;
		}
		if(B.searchParents(B, A)){
			return A;
		}
		if(A.searchParents(A, B)){
			return B;
		}
		NodeAndDepth LCAWithDepth = findLCAWithDepth(A,B,1);
		TreeNode LCA = LCAWithDepth.node;
		return LCA;
	}
	
	public static NodeAndDepth findLCAWithDepth(TreeNode A, TreeNode B, int depth){
		NodeAndDepth returnable;
		if(A.isRoot()){
			returnable = new NodeAndDepth(A,depth);
			return returnable;
		}
		if(B.isRoot()){
			returnable = new NodeAndDepth(B,depth);
			return returnable;
		}
		if(B.searchParents(B, A)){
			returnable = new NodeAndDepth(A,depth);
			return returnable;
		}
		if(A.searchParents(A, B)){
			returnable = new NodeAndDepth(B,depth);
			return returnable;
		}
		ArrayList<TreeNode> AParents = A.getParents();
		NodeAndDepth[] results = new NodeAndDepth[AParents.size()];
		int newDepth = depth+1;
		for(int i = 0; i<AParents.size();i++){
			results[i] = findLCAWithDepth(AParents.get(i),B,newDepth);
		}
		returnable = results[0];
		for(int i = 0; i<results.length;i++){
			if(results[i].depth<returnable.depth){
				returnable = results[i];
			}
		}
		return returnable;
	}
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}
