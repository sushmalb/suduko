package JavaDemoInClass;

public class CustomException{
    public static void main(String[] args) {
        try{
            throw new CustomExceptionMsg("I am coming from the custom exception\"");
        }
        catch(CustomExceptionMsg e){
e.printStackTrace();
        }
    }
}