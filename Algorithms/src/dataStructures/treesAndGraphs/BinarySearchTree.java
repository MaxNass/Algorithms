/**
 * 
 */
package dataStructures.treesAndGraphs;

/**
 * @author MaxNass
 *
 */
public class BinarySearchTree {
	
	private Node root;
	
	/** 
	 * Constructor 
	 */
	public BinarySearchTree() {
		this.setRoot(null);
	}
	
	/**
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}
	
	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}
	
	/**
	 * Find the element.
	 * @param id
	 * @return false or true
	 */
	public boolean find (int id) {
		
		Node current = root;
		while (current !=null) {
			if (current.data == id) {
				return true;
			} else {
				if (id > current.data){
					current = current.right;
				} else {
					current = current.left;
				}
			}
		}
		return false;
	}
	
	/**
	 * Delete the element. 
	 * @param id
	 * @return
	 */
	public boolean delete(int id) {
		Node parent = root; 
		Node current = root;
		boolean isLeftChild = false; 
		while (current.data != id) {
			parent = current;
			if (current.data > id) {
				isLeftChild = true;
				current = current.left;
			} else {
				isLeftChild = false;
				current = current.right;
			}
			if (current == null){
				return false; 
			}
		}
		//Case 1: if node to be deleted has no children
		if(current.left==null && current.right==null){
			if(current==root){
				root = null;
			}
			if(isLeftChild ==true){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		//Case 2 : if node to be deleted has only one child
		else if(current.right==null){
			if(current==root){
				root = current.left;
			}else if(isLeftChild){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}
		else if(current.left==null){
			if(current==root){
				root = current.right;
			}else if(isLeftChild){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}else if(current.left!=null && current.right!=null){
			
			//now we have found the minimum element in the right sub tree
			Node successor	 = getSuccessor(current);
			if(current==root){
				root = successor;
			}else if(isLeftChild){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = current.left;
		}		
		return true;
	}
	
	/**
	 * Insert an element
	 * @param id
	 */
	public void insert(int id){
		
		Node newNode = new Node(id);
		if (root == null) {
			root = newNode;
			return;
		} 
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if (id < current.data) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
		
	}
	
	
	/**
	 * GetSuccessor of an element
	 * @param node
	 * @return the successor
	 */
	public Node getSuccessor (Node node) {
		//TODO
		Node successor = null; 
		return successor;
	}
	
	/**
	 * Display node
	 * @param node
	 */
	public void display(Node node) {
		//TODO
	}

}
