package DataStructures.LinkedLists;

/**
 * Created by Ryan on 1/23/2017.
 */
public class GetNodeValue {

//    Get Nth element from the end in a linked list of integers
//    Number of elements in the list will always be greater than N.
//    Node is defined as
//    class Node {
//       int data;
//       Node next;
//    }


    int GetNode(Node head, int n) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        if(head == null){
            return 0;
        } else {
            Node node = null;
            while (head != null){
                Node tmp = node;
                node = new Node();
                node.data = head.data;
                node.next = tmp;
                head = head.next;
            }

            for (int i = 0; i < n; i++){
                node = node.next;
            }
            return node.data;
        }
    }
}
