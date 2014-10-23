package treetraversal;

public class Node {
	
	public Node leftChild;
	public Node rightChild;
	public int value;
	public State state;
	
	public Node(Node leftChild, Node rightChild, int value){
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.value = value;
		this.state = State.Unvisited;
	}
	
	public boolean isLeaf(){
		if (this.leftChild == null && this.rightChild == null){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		StringBuffer string = new StringBuffer();
		string.append(" "+this.value);
		if (this.leftChild != null){
			string.append(" leftchild:"+leftChild.value);
		}
		else {
			string.append(" No leftchild");
		}
		if(this.rightChild != null){
			string.append(" rightchild:"+rightChild.value);
		}
		else {
			string.append(" No rightchild");
		}
		return string.toString();
	}

}
