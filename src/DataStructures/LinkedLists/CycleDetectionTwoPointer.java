package DataStructures.LinkedLists;

/**
 * Created by ryan on 1/25/17.
 */
public class CycleDetectionTwoPointer {
    boolean hasCycle(Node head){
        Node fast = head; // starts both pointers off at top of list
        Node slow = head;

        if(head == null) return false;

        while(fast != null && fast.next != null){ // checks to make sure fast pointer hasnt hit null

            fast = fast.next.next; // moves slow pointer one over and fast pointer two over
            slow = slow.next;

            if (fast == slow)
                return true;
        }
        return false;
    }
}
