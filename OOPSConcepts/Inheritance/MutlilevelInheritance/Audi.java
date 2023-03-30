package OOPSConcepts.Inheritance.MutlilevelInheritance;

public class Audi extends Cars{

    @Override
    public void start(){
        System.out.println("Audi start");
    }

    @Override
    public void engine(){
        System.out.println("Audi engine");
    }
    
    public void autoParking(){
        System.out.println("Audi autoparking");

    }
}
