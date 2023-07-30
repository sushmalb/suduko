package FunctionalEx;

public class Main {
    public static void main(String[] args) {
        FunctionalOne f = (a,b) -> a+b;
        int result  =  f.getSum(10,15);
        System.out.println(result);
    }
}
