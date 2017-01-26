package DataStructures.LinkedLists;

/**
 * Created by ryan on 1/25/17.
 */
import java.util.*;

// this method iterates completely through headA until a match is found
// might be able to save time by using a hashtable


public class MergePointOfTwoLists {
    int FindMergeNode(Node headA, Node headB){
        Node node = headA;
        HashSet<Node> hash = new HashSet<>();

        //input A into set
        while (headA != null){
            hash.add(headA);
        }

        while(headB != null){
            while(node != null && node.next != null){
                node = node.next;
                if(node == headB){
                    return node.data;
                }
            }
            node = headA;
        }
        return -1;
    }
}
