package DataStructures.LinkedLists;

public class DeleteDuplicateValues {
	
	Node RemoveDuplicates(Node head){
		Node node = head;
		while (node.next != null) {
			if (node.data == node.next.data) {
				node.next = node.next.next;
			} else {
				node = node.next;
			}
		}
		return head;
	}

}
