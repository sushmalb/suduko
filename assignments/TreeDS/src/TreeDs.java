import java.util.LinkedList;
import java.util.Queue;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BST {
    public static void breadthFirstSearch(Node root) {
        //We start by checking if the root is null, which would indicate an empty tree. If the tree is
        // empty,we simply return.
        if (root == null) return;

        //We create a Queue named queue to hold the nodes as we traverse the tree.
        Queue<Node> queue = new LinkedList<>();
        //We add the root node to the queue to start the traversal.
        queue.add(root);

        while (!queue.isEmpty()) {
            //We dequeue a node from the queue using queue.poll(). This node represents the current node
            // we're processing.
            Node node = queue.poll();
            //We print the value of the current node.
            System.out.print(node.value + " ");
            //If the current node has a left child, we enqueue the left child.
            if (node.left != null)
                queue.add(node.left);

            //If the current node has a right child, we enqueue the right child.
            if (node.right != null)
                queue.add(node.right);
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(10);
        node1.left = new Node(20);
        node1.right = new Node(30);
        node1.left.left = new Node(40);
        node1.left.right = new Node(50);
        node1.right.left = new Node(70);
        node1.right.right = new Node(60);

        breadthFirstSearch(node1);
    }
}
