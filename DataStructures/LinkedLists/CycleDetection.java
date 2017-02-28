package DataStructures.LinkedLists;

/**
 * Created by ryan on 1/25/17.
 */

import java.util.*;


public class CycleDetection {
    boolean hasCycle(Node head) {

        HashSet<Node> hash = new HashSet<>(); // HashSet will hold Node values and check for repeats

        while (head != null) {
            if (hash.contains(head)) return true;
            hash.add(head);
            head = head.next;
        }
        return false;
    }
}