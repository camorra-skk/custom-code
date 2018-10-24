package binaryTree;

public class TreeNode {
	int data;
	TreeNode leftChild;
	TreeNode rightChild;
	
	public TreeNode(int data) {
		this.data = data;
	}
	// Setter and Getter Methods
	public int getData() {
		return data;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	// End of Setter and Getter Methods
	public TreeNode find(int data) {
		if(this.data == data) {
			return this;
		}
		if (this.data >= data && leftChild!=null) {
			return leftChild.find(data);
		}
		if (this.data < data && rightChild!=null) {
			return rightChild.find(data);
		}
		return null;
	}
	
	public void insert(int data) {
		if(this.data <=data) {
			if(this.rightChild!=null) {
				this.rightChild.insert(data);
			} else {
				this.rightChild = new TreeNode(data);
			}
		} else {
			if(this.leftChild!=null) {
				this.leftChild.insert(data);
			} else {
				this.leftChild = new TreeNode(data);
			}
		}
	}
	
	public int smallest() {
		while(this.leftChild!=null) {
			this.leftChild.smallest();
		}
		return this.data;
	}
	
	public int largest() {
		if(this.rightChild!=null) {
			return this.rightChild.largest();
		} 
		return this.data;
	}
}
