package OOPSConcepts.MethodOverriding;

public class AxisBank extends Bank {

    @Override
    int getRateOfInterest() {
        return 7;
    }

    public void homeLoan() {
        System.out.println("Axis bank home loan");
    }

}
