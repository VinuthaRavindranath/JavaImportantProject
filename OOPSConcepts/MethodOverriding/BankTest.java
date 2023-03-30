package OOPSConcepts.MethodOverriding;

public class BankTest {

    public static void main(String[] args) {
        AxisBank axis = new AxisBank();
        int axisBankInterestRate=axis.getRateOfInterest();

        IciciBank icici= new IciciBank();
        int iciciBankInterestRate=icici.getRateOfInterest();

        SbiBank sbi= new SbiBank();
        int sbiBankInterestRate=sbi.getRateOfInterest();

        System.out.println(axisBankInterestRate);
        System.out.println(iciciBankInterestRate);
        System.out.println(sbiBankInterestRate);

    
      //Top casting or up casting
       Bank bank= new AxisBank();
       int bankInterestRate=bank.getRateOfInterest();
       System.out.println(bankInterestRate);
       bank.getLoan();
       //bank.homeLoan(); this is the child class method, which cannot be accessed in case of topcasting
       //This bank.homeLoan(); will throw complie time error as reference type check will fail
       //From the above example, it can be clearly understood that we can not access child class members using a parent class reference even though it is of the child type
       //And from the above example, we can also observe that we are able to access the parent class members and child class’s overridden methods using the same parent class reference object. 


       //down casting
       AxisBank axisbank=(AxisBank) new Bank();
       axisbank.getLoan();
       //java.lang.ClassCastException
       //n Java, we cannot assign a parent class reference object to the child class, but if we perform downcasting, 
       //we will not get any compile-time error. However, when we run it, it throws the "ClassCastException". 
       //Now the point is if downcasting is not possible in Java, then why is it allowed by the compiler? In Java, some scenarios allow us to perform downcasting. Here, the subclass object is referred by the parent class.
    }
    
}
