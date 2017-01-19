package DataStructures.LinkedLists;

/**
 * Created by Ryan on 1/19/2017.
 */
public class DeleteNodeAtPosition {
    Node Delete(Node head, int position){
        Node node = head; // creates reference node
        if(position == 0){
            return node.next; // returns n+1 position and leaves n for garbage collection
        }

        for(int i = 0; i < position - 1; i++){
                node = node.next; // iterates through tree
            }

        node.next = node.next.next; // assigns n+2 value to n+1, leaving n+1 available for garbage collection
        return head; // returns head of tree
    }
}
