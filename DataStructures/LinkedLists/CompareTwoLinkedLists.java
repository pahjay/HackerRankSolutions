package DataStructures.LinkedLists;

/**
 * Created by Ryan on 1/20/2017.
 */
public class CompareTwoLinkedLists {
    int CompareLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        Node list1 = headA;
        Node list2 = headB;

        while (list1 != null && list2 != null) {
            if (list1.data == list2.data) {
                if ((list1.next == null && list2.next != null) || (list2.next == null && list1.next != null)) {
                    return 0;
                } else {
                    list1 = list1.next;
                    list2 = list2.next;
                }
            } else {
                return 0;
            }
        }

        return 1;
    }
}