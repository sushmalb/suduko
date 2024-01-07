import java.util.LinkedList;

public class SimpleQ {
    private LinkedList<Integer> queue;

    public SimpleQ() {
        queue = new LinkedList<>();
    }

    public void enqueue(int val) {
        queue.addLast(val);
    }

    public void dequeue() {
        queue.removeFirst();
    }

    public void display() {
        System.out.println("Queue:");
        for (int i : queue) {
            System.out.println(i);
        }
    }




}

class Main{
    public static void main(String[] args) {
        SimpleQ q = new SimpleQ();
        q.enqueue(10);
        q.enqueue(20);
        q.display();
    }
}






