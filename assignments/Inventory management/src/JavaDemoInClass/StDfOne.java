package demo;

public interface StDfOne {

    public String getName();

    public static String getNameOne(){
        return "example of static method";

    }

    public default String getNameTwo(){
        return "example of static method";
    }

}






}