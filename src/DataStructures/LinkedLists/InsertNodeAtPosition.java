package DataStructures.LinkedLists;

/**
 * Created by Ryan on 1/19/2017.
 */

/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

public class InsertNodeAtPosition {
    Node insert(Node head, int data, int position) {
        Node node = head; // assigns node to head value in order to traverse
        if (position == 0) {
            node = new Node(); // creates new node object to be inserted
            node.data = data;  // assigns data value to node
            node.next = head;  // moves the highest point to n+1
            return node;       // returns node because node is the highest point in the tree now
        } else {
            for (int i = 0; i < position-1; i++) {
                node = node.next; // traverses the list to find the position
            }

            Node temp = node.next;  // assigns temp Node to n+1 value
            node.next = new Node(); // creates new Node object for insertion
            node.next.data = data;  // assigns new Node object data value at n+1
            node.next.next = temp;  // assigns n+2 position to the previous n+1 node

            return head;
        }
    }
}
