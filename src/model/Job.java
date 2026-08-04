package model;

public class Job {

    private String jobId;
    private String companyName;
    private String jobRole;
    private String location;
    private double salary;

    public Job() {

    }

    public Job(String jobId, String companyName, String jobRole,
               String location, double salary) {

        this.jobId = jobId;
        this.companyName = companyName;
        this.jobRole = jobRole;
        this.location = location;
        this.salary = salary;
    }

    public String getJobId() {
        return jobId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobRole() {
        return jobRole;
    }

    public String getLocation() {
        return location;
    }

    public double getSalary() {
        return salary;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayJob() {

        System.out.println("\n========== JOB DETAILS ==========");
        System.out.println("Job ID       : " + jobId);
        System.out.println("Company      : " + companyName);
        System.out.println("Job Role     : " + jobRole);
        System.out.println("Location     : " + location);
        System.out.println("Salary (LPA) : " + salary);
        System.out.println("=================================");
    }
}