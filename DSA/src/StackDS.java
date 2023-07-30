import java.util.Arrays;

public class StackDS {

    public Object[] arr;
    public int size;
    public int index;

    public StackDS(int size) {
        this.size = size;
        arr = new Object[size];
        index = -1;
    }

    public void push(Object element){
        //arr[size]= element;
        if(index== size-1){
            System.out.println("Array is full !! Cannot insert");
            return;
        }
        index++;
        arr[index] = element;
    }

    public void remove(){
        arr[index]= null;
        index --;
    }

    @Override
    public String toString() {
        return "StackDS{" +
                "arr=" + Arrays.toString(arr) ;//+
//                ", size=" + size +
//                ", index=" + index +
//                '}';
    }

    public static void main(String[] args) {

        StackDS ob  = new StackDS(5);
        ob.push(1);
        ob.push(2);
        ob.push(3);
        System.out.println(ob);
        ob.remove();
        System.out.println(ob);
    }
}






