import java.util.ArrayList;

public class TreeNode {
	private String data;
	private ArrayList<TreeNode> children;
	private ArrayList<TreeNode> parents;
	private final String Node_ID;
	private boolean noChildren = true;
	private boolean isRoot;
	
	public TreeNode(String p, boolean root,String ID)throws Exception{
		if(p==null){
			throw new Exception("null data is not allowed");
		}else{
			this.data = p;
			this.isRoot = root;
			this.Node_ID = ID;
		}
	}
	
	public boolean addChild(TreeNode C){
		if(this.children.contains(C)){
			return false;
		}
		if(searchParents(this, C)){
			return false;
		}else{
			children.add(C);
			C.addParent(this);
			if(this.noChildren()){
				this.setNoChildren(false);
			}
			return true;
		}
	}
	
	public boolean addParent(TreeNode p){
		if(this.parents.contains(p)){
			return false;
		}
		if(this.isRoot()){
			return false;
		}
		if(searchChildren(this,p)){
			return false;
		}else{
			parents.add(p);
			p.addChild(this);
			return true;
		}
	}
	
	public void setNoChildren(boolean a){
		this.noChildren = a;
	}
	public boolean noChildren(){
		return this.noChildren;
	}
	
	public String getData(){
		return this.data;
	}
	
	public boolean isRoot(){
		return this.isRoot;
	}
	
	public String getID(){
		return this.Node_ID;
	}
	public ArrayList<TreeNode> getParents(){
		return this.parents;
	}
	
	public ArrayList<TreeNode> getChildren(){
		return this.children;
	}
	public boolean searchParents(TreeNode a, TreeNode b){
		if(a.isRoot()){
			return false;
		}else{
			ArrayList<TreeNode> parents = a.getParents();
			for(int i = 0; i<parents.size();i++){
				if(parents.get(i).getID().equals(b.getID())){
					return true;
				}
			}
			for(int i = 0; i<parents.size();i++){
				if(searchParents(parents.get(i),b)){
					return true;
				}
			}
			return false;
		}
	}
	
	public boolean searchChildren(TreeNode a, TreeNode b){
		if(a.noChildren()){
			return false;
		}else{
			ArrayList<TreeNode> children = a.getChildren();
			for(int i = 0; i<children.size();i++){
				if(children.get(i).getID().equals(b.getID())){
					return true;
				}
			}
			for(int i = 0; i<children.size();i++){
				if(searchParents(children.get(i),b)){
					return true;
				}
			}
			return false;
		}
	}
	
	public TreeNode getChild(int index){
		if(index<this.children.size()&&!this.noChildren){
			return this.children.get(index);
		}else{
			return null;
		}
	}
}
