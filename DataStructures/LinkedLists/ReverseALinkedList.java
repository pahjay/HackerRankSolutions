package DataStructures.LinkedLists;

/**
 * Created by Ryan on 1/20/2017.
 */
public class ReverseALinkedList {
    Node Reverse(Node head) {

        if (head == null) {
            return null;
        } else {
            Node node = null;
            while (head != null) {
                Node tmp = node; // assigns value of node, which is null initially, then the head.data value after
                node = new Node();
                node.data = head.data; // assigns the value of node to the current position of the head tree
                node.next = tmp; // adds the tmp value to the node tree at position 1
                head = head.next; // moves the head tree to the next object
            }
            return node;
        }
    }
}
