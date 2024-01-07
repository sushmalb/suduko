class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class StackUsingLL<T> {

    Node<T> head = null;
    int size = 0;

    public void push(T data) {
        Node<T> newNode = new Node<>(data); // Fixed the creation of a new node with the provided data
        if (size == 0) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop() { // Changed the return type from int to T to match the type of data in the Node
        if (size == 0) {
            System.out.println("List is empty!!");
            return null; // Changed the return type from int to T to match the type of data in the Node
        } else {
            T removedVal = head.data;
            head = head.next;
            size--;
            return removedVal;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        StackUsingLL<Integer> st = new StackUsingLL<>();
        st.push(10);
        st.push(20);
        st.display();
    }
}
