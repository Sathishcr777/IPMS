package service;

import java.util.ArrayList;
import model.Application;

public class ApplicationService {

    private ArrayList<Application> applications = new ArrayList<>();

    public void applyJob(Application application) {

        applications.add(application);

        System.out.println("\n======================================");
        System.out.println("Application Submitted Successfully!");
        System.out.println("======================================");
    }

    public void viewApplications() {

        if (applications.isEmpty()) {
            System.out.println("No Applications Found.");
            return;
        }

        for (Application application : applications) {
            application.displayApplication();
        }
    }

    public Application searchApplication(String applicationId) {

        for (Application application : applications) {

            if (application.getApplicationId().equalsIgnoreCase(applicationId)) {
                return application;
            }
        }

        return null;
    }

    public int getTotalApplications() {
        return applications.size();
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }
}