package treetraversal;

import java.util.ArrayList;
import java.util.Iterator;

public class BinaryTree {
	
	public ArrayList<Node> tree = new ArrayList<Node>();
	public Node root;
	
	public BinaryTree(Node root){
		this.root = root;
		this.addNode(root);
	}
	
	public void addNode(Node node){
		tree.add(node);
	}
	
	public Node getRoot(){
		return root;
	}
	
	public void printTree(){
		Iterator<Node> iterator = tree.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
	}

}
