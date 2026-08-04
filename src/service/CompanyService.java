package service;

import java.util.ArrayList;
import model.Company;

public class CompanyService {

    private ArrayList<Company> companies = new ArrayList<>();

    public void registerCompany(Company company) {

        companies.add(company);

        System.out.println("\n======================================");
        System.out.println("Company Registered Successfully!");
        System.out.println("======================================");
    }

    public void viewCompanies() {

        if (companies.isEmpty()) {
            System.out.println("\nNo Companies Registered.");
            return;
        }

        for (Company company : companies) {
            company.displayCompany();
        }
    }

    public Company searchCompany(String email) {

        for (Company company : companies) {

            if (company.getEmail().equalsIgnoreCase(email)) {
                return company;
            }
        }

        return null;
    }

    public int getTotalCompanies() {
        return companies.size();
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }
}