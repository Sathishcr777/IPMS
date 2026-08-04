package model;

public class Interview {

    private String interviewId;
    private String studentId;
    private String companyName;
    private String interviewDate;
    private String interviewTime;

    public Interview() {

    }

    public Interview(String interviewId, String studentId,
                     String companyName, String interviewDate,
                     String interviewTime) {

        this.interviewId = interviewId;
        this.studentId = studentId;
        this.companyName = companyName;
        this.interviewDate = interviewDate;
        this.interviewTime = interviewTime;
    }

    public String getInterviewId() {
        return interviewId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public String getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewId(String interviewId) {
        this.interviewId = interviewId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public void setInterviewTime(String interviewTime) {
        this.interviewTime = interviewTime;
    }

    public void displayInterview() {

        System.out.println("\n======== INTERVIEW DETAILS ========");
        System.out.println("Interview ID : " + interviewId);
        System.out.println("Student ID   : " + studentId);
        System.out.println("Company      : " + companyName);
        System.out.println("Date         : " + interviewDate);
        System.out.println("Time         : " + interviewTime);
        System.out.println("===================================");
    }
}