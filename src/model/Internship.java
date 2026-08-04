package model;

public class Internship {

    private String internshipId;
    private String companyName;
    private String role;
    private int duration;
    private String stipend;

    public Internship() {

    }

    public Internship(String internshipId, String companyName,
                      String role, int duration, String stipend) {

        this.internshipId = internshipId;
        this.companyName = companyName;
        this.role = role;
        this.duration = duration;
        this.stipend = stipend;
    }

    public String getInternshipId() {
        return internshipId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRole() {
        return role;
    }

    public int getDuration() {
        return duration;
    }

    public String getStipend() {
        return stipend;
    }

    public void setInternshipId(String internshipId) {
        this.internshipId = internshipId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setStipend(String stipend) {
        this.stipend = stipend;
    }

    public void displayInternship() {

        System.out.println("\n====== INTERNSHIP DETAILS ======");
        System.out.println("Internship ID : " + internshipId);
        System.out.println("Company       : " + companyName);
        System.out.println("Role          : " + role);
        System.out.println("Duration      : " + duration + " Months");
        System.out.println("Stipend       : " + stipend);
        System.out.println("================================");
    }
}