package DataStructures.LinkedLists;

/**
 * Created by Ryan on 1/19/2017.
 */
public class InsertNodeAtTail {
/*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

class Node {
    int data;
    Node next;
}

Node Insert(Node head, int data){
    if(head == null){
        head = new Node();
    }
    else {
        Node node = head;
        while(node.next != null)
            node = node.next;
        node.next = new Node();
        node.next.data = data;
    }
    return head;
}

}
