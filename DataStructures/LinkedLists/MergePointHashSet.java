package DataStructures.LinkedLists;

import java.util.HashSet;

/**
 * Created by ryan on 1/25/17.
 */
public class MergePointHashSet {
    int FindMergeNode(Node headA, Node headB){
        HashSet<Node> hash = new HashSet<>();

        //input A into set
        while (headA != null){
            hash.add(headA);
        }

        while(headB != null){
            if(hash.contains(headB)){
                return headB.data;
            }
            headB = headB.next;
        }

        return -1;
    }
}
