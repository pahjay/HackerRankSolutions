package DataStructures.LinkedLists;

/**
 * Created by ryan on 1/26/17.
 */
public class InsertNodeSortedDoublyLL {
    Node SortedInsert(Node head, int data) {
        // create pointer for traversing the list
        Node node = head;

        // if node == null then we know that we are at the beginning of the list
        // all we need to do is make a new node and assign it to the base position and return
        if (node == null) {
            node = new Node();
            node.data = data;
            return node;
        }
        // we traverse the list until it reaches null
        while (node != null) {
            // once the data value has equaled or is more than the current node position value
            // we know we can assign the current node value to a new node, and connect both the
            // previous value to node.prev and the next value to the current 'node'
            if (node.data >= data) {
                Node x = new Node();
                x.prev = node.prev;
                x.data = data;
                x.next = node;
                node.prev = x;
                // if x.prev is == to null then we know that we are assigning a value to the begining
                // of the list. we should return x as it is the only value
                if (x.prev == null) {
                    return x;
                } else {
                    // otherwise we set the value in the list to x and return the head of the list
                    x.prev.next = x;
                    return head;
                }
            }
            // same deal but if node.next is null then we know we are at the end of the list so we make
            // a new node value and assign it to node.next and then assign the node after x to null signifying
            // the end of the list.
            if (node.next == null) {
                Node x = new Node();
                x.data = data;
                x.prev = node;
                x.next = null;
                node.next = x;
                break;
            }
            node = node.next;
        }
        return head;
    }
}
