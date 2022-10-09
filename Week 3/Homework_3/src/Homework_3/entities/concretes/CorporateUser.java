package Homework_3.entities.concretes;

public class CorporateUser extends User{
    private String companyName;
    private String taxNumber;

    public CorporateUser(int id, String email, String companyName, String taxNumber) {
        super(id, email);
        this.companyName = companyName;
        this.taxNumber = taxNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}
