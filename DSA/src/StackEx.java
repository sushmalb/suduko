import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(3);
        stack.add(1);
        stack.add(4);

        System.out.println(stack);

        //Returns the item at the top of the stack without removing it.
        System.out.println("the last element is:"+ stack.peek());
        System.out.println(stack);
        System.out.println("The last element removed is:"+ stack.pop());
        System.out.println(stack);

        // Add a new element
        System.out.println(stack.push(2));
        System.out.println(stack);

        System.out.println("Is the stack empty:"+ stack.empty());

        System.out.println("is 2 in the stack?"+ stack.search(2));
        System.out.println("The size of the stack is:"+ stack.size());
        System.out.println("Is the stack empty:"+ stack.isEmpty());
        stack.clear();
        System.out.println(stack);
    }
}
