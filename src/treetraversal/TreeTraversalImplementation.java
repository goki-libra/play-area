package treetraversal;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TreeTraversalImplementation {

	public static void dfs(BinaryTree tree) {
		Node root = tree.getRoot();
		// all depth first traversal techniques
		System.out.println("INORDER TRAVERSAL");
		inorderTraversal(root);
		System.out.println("____________________");
		System.out.println("PREORDER TRAVERSAL");
		preOrderTraversal(root);
		System.out.println("____________________");
		System.out.println("POSTORDER TRAVERSAL");
		postOrderTraversal(root);
		System.out.println("____________________");
		// breadth first traversal
		System.out.println("BFS");
		bfs(root);
		System.out.println("____________________");
		// mirror of the tree
		System.out.println("MIRROR");
		mirror(root);
		bfs(root);
		// revert the mirroring
		mirror(root);
		System.out.println("____________________");
	}

	public static void inorderTraversal(Node node) {
		if (node == null) {
			return;
		}
		inorderTraversal(node.leftChild);
		System.out.println(node.toString() + "  ");
		inorderTraversal(node.rightChild);
	}

	public static void preOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.toString() + "  ");
		preOrderTraversal(node.leftChild);
		preOrderTraversal(node.rightChild);
	}

	public static void postOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		postOrderTraversal(node.leftChild);
		postOrderTraversal(node.rightChild);
		System.out.println(node.toString() + "  ");
	}

	public static void bfs(Node node) {
		Queue<Node> queue = new LinkedBlockingQueue<Node>();
		System.out.println(node.toString() + "  ");
		if (node.leftChild != null) {
			queue.offer(node.leftChild);
		}
		if (node.rightChild != null) {
			queue.offer(node.rightChild);
		}
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.println(temp.toString() + "  ");
			if (temp.leftChild != null) {
				queue.offer(temp.leftChild);
			}
			if (temp.rightChild != null) {
				queue.offer(temp.rightChild);
			}
		}
	}

	public static void mirror(Node node) {
		if (node.leftChild != null) {
			mirror(node.leftChild);
		}
		if (node.rightChild != null) {
			mirror(node.rightChild);
		}
		Node temp = node.leftChild;
		node.leftChild = node.rightChild;
		node.rightChild = temp;
	}

	public static void isBalancedTree(Node node) {
		int max = maxDepth(node);
		System.out.println(max);
		int min = minDepth(node);
		System.out.println(min);
		if ((max - min) <= 1) {
			System.out.println("Is balanced");
		}
		else{
			System.out.println("Not balanced");
		}

	}

	public static int minDepth(Node node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math
				.min(minDepth(node.leftChild), minDepth(node.rightChild));

	}

	public static int maxDepth(Node node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math
				.max(maxDepth(node.leftChild), maxDepth(node.rightChild));
	}
	
	public static int countNodeValues(Node node){
		if (node == null){
			return 0;
		}
		return node.value + countNodeValues(node.leftChild) + countNodeValues(node.rightChild);
	}
	
	public static int countNodes(Node node){
		if (node == null){
			return 0;
		}
		return 1 + countNodes(node.leftChild) + countNodes(node.rightChild);
	}

}
