package JavaDemoInClass;

public class ImplOne implements demo.StDfOne {
    @Override
    public String getName() {
        return null;
    }

    public static void main(String[] args) {
        demo.StDfOne obj = new ImplOne();

        System.out.println(demo.StDfOne.getNameOne());
        System.out.println(obj.getNameTwo());
    }
