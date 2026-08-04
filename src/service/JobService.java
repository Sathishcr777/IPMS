package service;

import java.util.ArrayList;
import model.Job;

public class JobService {

    private ArrayList<Job> jobs = new ArrayList<>();

    public void addJob(Job job) {

        jobs.add(job);

        System.out.println("\n======================================");
        System.out.println("Job Posted Successfully!");
        System.out.println("======================================");
    }

    public void viewJobs() {

        if (jobs.isEmpty()) {
            System.out.println("No Jobs Available.");
            return;
        }

        for (Job job : jobs) {
            job.displayJob();
        }
    }

    public Job searchJob(String jobId) {

        for (Job job : jobs) {

            if (job.getJobId().equalsIgnoreCase(jobId)) {
                return job;
            }
        }

        return null;
    }

    public int getTotalJobs() {
        return jobs.size();
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }
}