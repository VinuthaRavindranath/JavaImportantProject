package JavaImpTopics.InterfacePrac;

//Since Java 8, we can have default and static methods in an interface.

//Since Java 9, we can have private methods in an interface.

public interface InterfaceDemo {

    int num=10;//static and final by default

    public void demo1(); //abstract method

    public static void demo2(){
        System.out.println("Static method");
    }

    //private method
    private void demo3()
    {
        System.out.println("Demo3 method");
    }

    //default method
    default void demo4(){
        System.out.println("Demo4 method");
    }
}
