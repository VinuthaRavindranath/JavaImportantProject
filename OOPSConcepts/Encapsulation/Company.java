package OOPSConcepts.Encapsulation;

public class Company {

    private String CompanyName;
    private int employeeCount;
    private double sharePrice;

    
    
    public Company(String companyName, int employeeCount, double sharePrice) {
        this.CompanyName = companyName;
        this.employeeCount = employeeCount;
        this.sharePrice = sharePrice;
    }
    public String getCompanyName() {
        return CompanyName;
    }
    public int getEmployeeCount() {
        return employeeCount;
    }
    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }
    public double getSharePrice() {
        return sharePrice;
    }
    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }


    
    
}
