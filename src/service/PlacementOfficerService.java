package service;

import java.util.ArrayList;
import model.Student;
import model.Company;
import model.Job;

public class PlacementOfficerService {

    public void viewStudents(ArrayList<Student> students) {

        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
        }
    }

    public void viewCompanies(ArrayList<Company> companies) {

        if (companies.isEmpty()) {
            System.out.println("No Companies Found.");
            return;
        }

        for (Company company : companies) {
            company.displayCompany();
        }
    }

    public void viewJobs(ArrayList<Job> jobs) {

        if (jobs.isEmpty()) {
            System.out.println("No Jobs Found.");
            return;
        }

        for (Job job : jobs) {
            job.displayJob();
        }
    }

    public void generateReport() {

        System.out.println("\n======================================");
        System.out.println("      PLACEMENT REPORT GENERATED");
        System.out.println("======================================");
        System.out.println("Report Status : SUCCESS");
        System.out.println("======================================");
    }
}