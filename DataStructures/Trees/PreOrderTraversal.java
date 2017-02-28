package DataStructures.Trees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ryan on 2/28/17.
 */
public class PreOrderTraversal
{
    private class Node
    {
        private int data;
        private Node left, right;
    }
    void preOrder(Node root) {

        // inOrder traversal goes:
        // left until null, pop to parent, then right until null, pop
        Stack<Node> s = new Stack<>();
        ArrayList<Integer> i = new ArrayList<>();
        s.push(root);

        while(!s.isEmpty())
        {
            Node x = s.pop();
            i.add(x.data);

            if (x.right != null)
                s.push(x.right);

            if (x.left != null)
                s.push(x.left);

        }

        for (Integer p : i)
            System.out.print(p + " ");
    }
}
