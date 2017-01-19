/**
 * Created by Ryan on 1/19/2017.
 */
class Node {
    int data;
    Node next;
}
public class PrintElementOfLinkedList {
    void Print(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}

