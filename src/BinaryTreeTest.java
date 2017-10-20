import junit.framework.TestCase;


public class BinaryTreeTest extends TestCase {

	public void testAdd() {
		BinaryTree tree = new BinaryTree(3);
		try{
			tree.add(null, new TreeNode(""+3,false), null);
		}catch(Exception e){
			
		}
	}

	public void testGetTreeSize() {
		BinaryTree tree = new BinaryTree(3);
		try{
			tree.add(null, new TreeNode(""+3,false), null);
		}catch(Exception e){
			
		}
		assertEquals(1, tree.getTreeSize());
	}

}
