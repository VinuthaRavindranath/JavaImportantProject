package OOPSConcepts.Abstraction;

public class TestClass {
    
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.title();
        sub.displayLogo();
        sub.url();
        sub.pageLoadingTime();


        System.out.println("-----------------------");
        //top casting with abstarct class reference and child class object
        AbstractDemo ab =  new SubClass();
        ab.title();
        ab.displayLogo();
        ab.url();
        ab.pageLoadingTime();

        System.out.println("-----------------------");
        SubClass sub2 = new SubClass(10);
        sub2.displayLogo();
    }
}
