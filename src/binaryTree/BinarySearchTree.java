package binaryTree;

public class BinarySearchTree {
	private TreeNode root;
	
	public void insert(int data) {
		if(root!=null) {
			root.insert(data);
		}
		else {
			root = new TreeNode(data);
		}
	}
	
	public TreeNode delete(int data) {
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;
		
		if(current == null)
			return null;
		
		while(current!=null && current.getData()!=data) {
			parent = current;
			if(current.getData()> data) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}
		return root;
	}
	
	public TreeNode find(int data) {
		if(root !=null) {
			root.find(data);
		}
		return null;
	}
	
	public int smallest() {
		if(root == null) {
			return 0;
		}
		return root.smallest();
	}
	
	public int largest() {
		if(root == null) {
			return 0;
		}
		return root.largest();
	}
}
