package DataStructures.LinkedLists;

/**
 * Created by ryan on 1/27/17.
 */

/*
    1. hold head.next in temp
    2. swap head.next and head.prev
    3. assign head.next to temp
*/


public class ReversingADoublyLL {
    Node Reverse(Node head) {

        if (head == null) {
            return null;
        }

        while (head.next != null) {
            // if at beginning, set end to null and previous to next and set head one to the right
            if (head.prev == null){
                head.prev = head.next;
                head.next = null;
                head = head.prev;

                // in the middle, then swap next and previous and set head to one to the right
            } else {

                Node temp = head.next;
                head.next = head.prev;
                head.prev = temp;
                head = head.prev;

            }

            //  reached the end of the unreversed list, or beginning of reversed list, swap and break
            if (head.next == null) {
                head.next = head.prev;
                head.prev = null;
                break;
            }
        }

            return head;
    }
}


