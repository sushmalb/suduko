import java.util.LinkedList;

public class SimpleStack {
    private LinkedList<Integer> stack;

    public SimpleStack(){
        stack = new LinkedList<>();
    }

    public void pushElem(int val){
        stack.addFirst(val);
    }

    public int removeElem(){
        if(stack.isEmpty()){
            return -1;
        }
        return stack.removeFirst();
    }

    public int peekElem(){
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peekFirst();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("stack:");
            for (int i : stack) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }

}

class Main{
    public static void main(String[] args) {
        SimpleStack stk = new SimpleStack();
        stk.pushElem(10);
        stk.pushElem(20);
        stk.pushElem(30);
        stk.display();

        System.out.println("Removed elem is: "+stk.removeElem());
        stk.display();

        System.out.println("Thelast element is:"+stk.peekElem());
        stk.display();

        System.out.println("Is the stack empty? "+stk.isEmpty());

        System.out.println("element removed is: "+stk.removeElem());
        System.out.println("element removed is: "+stk.removeElem());
        stk.display();

        System.out.println("Is the stack empty? "+stk.isEmpty());
    }
}



