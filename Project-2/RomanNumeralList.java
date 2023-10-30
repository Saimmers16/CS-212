public class RomanNumeralList {
    private Node head;
	public RomanNumeralList() {
		head = null;
	}
	
	public String find(int n) {
		Node current = head;
		int count = 0;
		while (count < n) {
			current = current.getNext();
			if (current == null) {
				throw new IndexOutOfBoundsException("Cannot find item at position " + n);
			}
			count++;
		}
		return current.getData();
	}
	
	public void insert(int pos, String val) {
		Node newNode = new Node(val, null);
		
		if (pos == 0) {
			newNode.setNext( head );
			head = newNode;
			return;
		}
		
		Node current = head;
		int count = 0;
		while (count < pos-1) {
			current = current.getNext();
			if (current == null) {
				throw new IndexOutOfBoundsException("Cannot find item at position " + (pos-1));
			}
			count++;
		}
		
		newNode.setNext( current.getNext() );
		current.setNext( newNode );
	}
	
	public void delete(int pos) {
		if (pos == 0) {
			head = head.getNext();
			return;
		}
		
		Node current = head;
		int count = 0;
		while (count < pos-1) {
			current = current.getNext();
			if (current == null) {
				throw new IndexOutOfBoundsException("Cannot find item at position " + (pos-1));
			}
			count++;
		}
		
		if (current.getNext() == null) {
			throw new IndexOutOfBoundsException("Cannot find item at position " + pos);
		}
		
		current.setNext( current.getNext().getNext() );
	}

	public String toString() {
		String output = "";
		Node current = head;
		while (current != null) {
			output += current.getData() + ", ";
			current = current.getNext();
		}
		
		return output;
	}

	
}

class Node {
	private String data;
	private Node next;
	
	public Node(String d, Node nx) {
		data = d;
		next = nx;
	}
	
	public String getData() { return data; }
	public Node getNext() { return next; }
	public void setData(String d) { data = d; }
	public void setNext(Node n) { next = n; }
}