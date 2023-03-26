package OOPSConcepts.Encapsulation;

public class CompanyTest {
    public static void main(String[] args) {
        // Company comp= new Company();
        // comp.setCompanyName("ABC Company");
        // comp.setEmployeeCount(200);
        // comp.setSharePrice(666.78);

        Company comp = new Company("ABC Company", 200, 666.78);

        System.out.println(comp.getCompanyName());
        System.out.println(comp.getEmployeeCount());
        System.out.println(comp.getSharePrice());
        System.out.println("---------------------------");

        /**
         * you can use constructor as setter but what in case if you have to update the
         * value?
         * Constructor is just one time activity and you cannot update, so setters are
         * required to update the value
         * For example i can an employee count as 300
         */

        comp.setEmployeeCount(300);
        comp.setSharePrice(566.98);
        System.out.println(comp.getCompanyName());
        System.out.println(comp.getEmployeeCount());
        System.out.println(comp.getSharePrice());
    }

}
