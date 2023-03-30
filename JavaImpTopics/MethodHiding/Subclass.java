package JavaImpTopics.MethodHiding;

public class Subclass extends Superclass {
    @Override
    public void names(){
        System.out.println("Sub class names");
    }

    public static void display(){
        System.out.println("Sub class display");
    }
 
}
