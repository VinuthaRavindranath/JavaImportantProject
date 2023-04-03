package OOPSConcepts.Abstraction;

public class SubClass extends AbstractDemo{

    public SubClass() {
        System.out.println("SubClass constructor");
    }

    public SubClass(int i) {
        System.out.println("SubClass constructor"+i);
    }

    @Override
    public void title() {
        System.out.println("Subclass title method");
    }

    @Override
    public void displayLogo() {
        System.out.println("Subclass displayLogo method");
    }
    
}
