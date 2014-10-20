package treetraversal;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TreeTraversalImplementation {
	
	public static void dfs(BinaryTree tree){
		Node root = tree.getRoot();
		System.out.println("INORDER TRAVERSAL");
		inorderTraversal(root);
		System.out.println("____________________");
		System.out.println("PREORDER TRAVERSAL");
		preOrderTraversal(root);
		System.out.println("____________________");
		System.out.println("POSTORDER TRAVERSAL");
		postOrderTraversal(root);
		System.out.println("____________________");
		System.out.println("BFS");
		bfs(root);
		System.out.println("____________________");
	}
	
	public static void inorderTraversal(Node node){
		if(node == null){
			return;
		}
		inorderTraversal(node.leftChild);
		System.out.println(node.toString()+ "  ");
		inorderTraversal(node.rightChild);
	}

	public static void preOrderTraversal(Node node){
		if(node == null){
			return;
		}
		System.out.println(node.toString()+ "  ");
		preOrderTraversal(node.leftChild);
		preOrderTraversal(node.rightChild);
	}

	public static void postOrderTraversal(Node node){
		if(node == null){
			return;
		}
		postOrderTraversal(node.leftChild);
		postOrderTraversal(node.rightChild);
		System.out.println(node.toString()+ "  ");
	}
	
	public static void bfs(Node node){
		Queue<Node> queue = new LinkedBlockingQueue<Node>();
		System.out.println(node.toString()+ "  ");
		if(node.leftChild != null){
			queue.offer(node.leftChild);
		}		
		if(node.rightChild != null){
			queue.offer(node.rightChild);
		}
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			System.out.println(temp.toString()+ "  ");
			if(temp.leftChild != null){
				queue.offer(temp.leftChild);
			}
			if(temp.rightChild != null){
				queue.offer(temp.rightChild);
			}
		}
	}
	
	public static void dfs(Node node){
		if( node == null)
			return;
		
		System.out.println(node.toString());
		dfs(node.leftChild);
		dfs(node.rightChild);
	}
	
	public static void printRootToLeaf( Node node , Node[] arr , int i){
		
		if( node == null)
			return;
		
		arr[i] = node;
		i++;
		if( node.leftChild == null && node.rightChild== null){
			//print array 
		}
		
		printRootToLeaf(node.leftChild, arr, i);
		printRootToLeaf(node.rightChild, arr, i);
		
		String str = "abc";
		str.length();
		
	}
	
} //9747730778
