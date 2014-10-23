package treetraversal;

public class BinaryTreeTestApp {
	
	public static void main(String args[]){
		Node leaf1 = new Node(null, null, 1);
		Node leaf2 = new Node(null, null, 3);
		Node leaf3 = new Node(null, null, 5);
		Node leaf4 = new Node(null, null, 7);
		Node node1 = new Node(leaf1, leaf2, 2);
		Node node2 = new Node(leaf3, leaf4, 6);
		Node root = new Node(node1, node2, 4);
		BinaryTree tree = new BinaryTree(root);
		tree.addNode(node1);
		tree.addNode(node2);
		tree.addNode(leaf1);
		tree.addNode(leaf2);
		tree.addNode(leaf3);
		tree.addNode(leaf4);
		tree.printTree();

	}

}
