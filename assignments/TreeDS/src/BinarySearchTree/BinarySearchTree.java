package BinarySearchTree;
class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class BinarySearchTree {
    public Node insert(int val,Node  current){
        if(current  == null){
            Node node = new Node(val);
            return node;
}else {
            if(val< current.val){
                current.left =insert(val,current.left);
            }else{
                current.right = insert(val,current.right);
            }
            return current;
        }
    }

    public static void preorder(Node current){
        if(current == null){
            return;
        }else{
            System.out.println(current.val+" ");
            preorder(current.left);
            preorder(current.right);
        }
    }

    public static void display(Node current){
        if(current == null){
            return;
        }
        else{
            System.out.println(current.val);
            display(current.left);
            display(current.right);
        }

    }

    public static int min(Node current){
if(current == null){
    return -1;
}else if(current.left == null){
        return current.val;
}else{
    return min(current.left);
}
    }

    public static Node delete(Node current,int key){
        if (current == null) {
            return;
        }
        if(key < current.val){
            delete(current.left,key);
        }else if (key > current.val){
            current.right = delete(current.right,key);
        }else{
            if(current.left == null && current.right == null){
                return null;
            }else if(current.left == null){
return current.right;
            }else if(current.right == null){
                return current.left;
            }else{
                
            }
        }
    }

//    public static int search(int data,Node current){
//        if(current == null)
//            return -1;
//    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        Node node = new Node(50);

        bst.insert(30,node);
        bst.insert(40,node);
        bst.insert(80,node);
        bst.insert(70,node);
        System.out.println("Pre-order traversal:");
        preorder(node);

        System.out.println("\nDisplaying all nodes:");
        display(node);
        System.out.println("Mim value is:"+min(node));
    }
}
