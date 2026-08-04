package model;

public class Application {

    private String applicationId;
    private String studentId;
    private String jobId;
    private String status;

    public Application() {

    }

    public Application(String applicationId, String studentId,
                       String jobId, String status) {

        this.applicationId = applicationId;
        this.studentId = studentId;
        this.jobId = jobId;
        this.status = status;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getJobId() {
        return jobId;
    }

    public String getStatus() {
        return status;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayApplication() {

        System.out.println("\n====== APPLICATION DETAILS ======");
        System.out.println("Application ID : " + applicationId);
        System.out.println("Student ID     : " + studentId);
        System.out.println("Job ID         : " + jobId);
        System.out.println("Status         : " + status);
        System.out.println("=================================");
    }
}