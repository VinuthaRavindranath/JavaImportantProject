package OOPSConcepts.Abstraction;

public abstract class AbstractDemo {
    //can have constructor
    public AbstractDemo(){
        System.out.println("Abstract class constructor");
    }

    public AbstractDemo(int i){
        System.out.println("Abstract class constructor"+i);
    }

    public abstract void title();
    public abstract void displayLogo();
    
    public void url(){
        System.out.println("Abstract class URL()");
    }

    public void pageLoadingTime(){
        System.out.println("Abstract class Page loading time()");
    }

    
}
