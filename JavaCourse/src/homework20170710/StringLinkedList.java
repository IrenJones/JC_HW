package homework20170710;

public class StringLinkedList {

	Node first; // null

	Node last; // null

	int size; // 0

	public void add(String value) {
		Node node = new Node(value, null);

		if (first == null) {
			first = node;
		} else {
			last.next = node;
		}

		last = node;

		size++;
	}

	public boolean remove(String value) {

		boolean result = false;

		Node current = first;

		Node prev = null;

		while (current != null) {
			if (current.value.equals(value)) {
				if (prev == null) {
					first = current.next;
				} else {
					prev.next = current.next;
				}
				if (current.next == null){
	
					last = prev;
				}
				size--;
				result = true;
				break;
			}
			prev = current;
			current = current.next;
		}

		if (first == null) {
			last = null;
		}

		return result;
	}

	public String remove(int index) {
		String result = "";

		Node current = first;
		Node prev = null;
		int id = 0;

		if (index >= 0 && index < size) {
			while (id<=index) {
				if (id == index) {
					if (prev == null) {
						first = current.next;
					} else {
						prev.next = current.next;
					}
					if (id + 1 == size){
						last = prev;
					}
					size--;
					result = current.value;
					break;
				}
				prev = current;
				current = current.next;
				id++;
			}
		}
		if (first == null) {
			last = null;
		}
		return result;
	}

	@Override
	public String toString() {
		// traverse

		StringBuilder result = new StringBuilder("[");

		if (first != null) {
			result.append(first.value);

			Node current = first.next;

			while (current != null) {
				result.append(", ").append(current.value);
				current = current.next;
			}
		}

		result.append("]");

		return result.toString();
	}
}
