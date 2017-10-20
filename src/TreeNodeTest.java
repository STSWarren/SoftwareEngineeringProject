import junit.framework.TestCase;


public class TreeNodeTest extends TestCase {

	public void testTreeNode() {
		TreeNode node = null;
		try{
			node = new TreeNode("null",false);
		}catch(Exception e){
			
		}
		assertEquals(node.getData(), "null");
	}

	public void testSetRightChild() {
		fail("Not yet implemented");
	}

	public void testSetLeftChild() {
		fail("Not yet implemented");
	}

}
