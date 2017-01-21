package DataStructures.LinkedLists;

/**
 * Created by Ryan on 1/20/2017.
 */
public class MergeTwoSortedLinkedLists {
    Node MergeLists(Node headA, Node headB){
        if(headA == null){
            return headB;
        }
        if(headB == null){
            return headA;
        }
        if(headA.data < headB.data){
            headA.next = MergeLists(headA.next, headB); // A is good, move pointer one to the right and check against B
            return headA;
        } else {
            headB.next = MergeLists(headA, headB.next); // B is good, move pointer one to the right and check against A
            return headB;
        }

    }
}