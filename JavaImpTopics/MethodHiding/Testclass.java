package JavaImpTopics.MethodHiding;

public class Testclass {

    public static void main(String[] args) {
        Subclass sub= new Subclass();
        sub.names();
        
        Subclass.display();
        Superclass.display();

    }
    
}
