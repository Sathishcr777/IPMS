package service;

import java.util.ArrayList;
import model.Interview;

public class InterviewService {

    private ArrayList<Interview> interviews = new ArrayList<>();

    public void scheduleInterview(Interview interview) {

        interviews.add(interview);

        System.out.println("\n======================================");
        System.out.println("Interview Scheduled Successfully!");
        System.out.println("======================================");
    }

    public void viewInterviews() {

        if (interviews.isEmpty()) {
            System.out.println("No Interviews Scheduled.");
            return;
        }

        for (Interview interview : interviews) {
            interview.displayInterview();
        }
    }

    public Interview searchInterview(String interviewId) {

        for (Interview interview : interviews) {

            if (interview.getInterviewId().equalsIgnoreCase(interviewId)) {
                return interview;
            }
        }

        return null;
    }

    public int getTotalInterviews() {
        return interviews.size();
    }

    public ArrayList<Interview> getInterviews() {
        return interviews;
    }
}