
public class LinkedList {
	Node head; //Node <String> y object to String
	int size;

	public void add(Object data) {
		if (head == null) {
			head = new Node(data, null);
		} else {
			Node temp = new Node(data,null);
			if (head.getNext() == null) {
				Node current = head;
				current.setNext(temp);
			} else {
				Node current = head;
				if (current != null) {
					while (current.getNext() != null) {
						current = current.getNext();
					}
					current.setNext(temp);
				}
			}
		}
		size++;
	}

	public void add(Object data, int index) throws IndexOutOfBoundsException {
		Node temp = new Node(data,null);
		Node current = head;
		if (index == 0) {
			head = new Node(data, current);
		} else {
			if (current != null) {
				if (index <= size - 1){
					for (int i = 0; i < index - 1; i++) {
						current = current.getNext();
					}
				temp.setNext(current.getNext());
				current.setNext(temp);
				}
			}
		}
		size++;
	}

	public Object get(int index) {
		Node current = head;
		if (index == 0) {
			return head.getData();
		} else {
			if (index <= size - 1) {
				for (int i = 1; i <= index; i++) {
					current = current.getNext();
				}
				return current.getData();
			}

		}
		return "Index Out Of Bounds";

	}
	
	public String remove(int index) throws IndexOutOfBoundsException{
		Node current = head;
		Node temp = null;
		if (index == 0) {
			head = current.getNext();
			size --;
		} else {
			if (index <= size - 1) {
				for (int i = 1; i <= index-1; i++) {
					current = current.getNext();
				}
			    temp = current;
			    current.setNext(temp.getNext().getNext());
				size --;
			}

		}
		return null;
	}
	
	public boolean contains(String s){
		for(int i=0; i < size; i++){
			if(get(i).equals(s)){
				return true;
			}
		}
		return false;
	}

	public int indexOf(String s) {
		Node current = head;
		for (int i = 0; i < size ; i++) {
			if (current.getData().equals(s)) {
				return i;
			}
			current = current.getNext();
		}
		return -1;
	}

	public String getHead() {
		return head.getData().toString();
	}

	public String getTail() {
		return get(size() - 1).toString();
	}

	public int size() {
		return size;
	}

	public void clear() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

}
