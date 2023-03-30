package OOPSConcepts.Inheritance.MutlilevelInheritance;

public class Testclass {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.start();
        audi.engine();
        audi.autoParking();

        Cars cars = new Cars();
        cars.start();
        cars.engine();

        Vehicles vehicles = new Audi();
        vehicles.engine();
        vehicles.start();
    }
}
