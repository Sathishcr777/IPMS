package model;

public class Company extends User {

    private String companyName;
    private String location;
    private String industry;

    // Default Constructor
    public Company() {
        super();
    }

    // Parameterized Constructor
    public Company(String id, String name, String email,
                   String password, String phoneNumber,
                   String companyName, String location, String industry) {

        super(id, name, email, password, phoneNumber);

        this.companyName = companyName;
        this.location = location;
        this.industry = industry;
    }

    // Getters
    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }

    public String getIndustry() {
        return industry;
    }

    // Setters
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    // Display Company Details
    public void displayCompany() {

        displayUser();

        System.out.println("Company Name : " + companyName);
        System.out.println("Location     : " + location);
        System.out.println("Industry     : " + industry);

        System.out.println("-------------------------------------");
    }
}