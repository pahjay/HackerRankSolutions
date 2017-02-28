package DataStructures.LinkedLists;

import java.util.Stack;

/**
 * Created by Ryan on 1/19/2017.
 */
public class PrintInReverse {
    void ReversePrint(Node head){
        Stack<Integer> results = new Stack<>(); // create secondary data structure to hold reverse value3s
        Node node = head;

        while(node != null){
            results.push(node.data);
            node = node.next;
        }
        for (int i = results.size()-1; i > 0; i--){
            System.out.println(results.elementAt(i));
        }

    }
}
