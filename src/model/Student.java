package model;

public class Student extends User {

    private String department;
    private double cgpa;
    private int year;

    // Default Constructor
    public Student() {
        super();
    }

    // Parameterized Constructor
    public Student(String id, String name, String email,
                   String password, String phoneNumber,
                   String department, double cgpa, int year) {

        super(id, name, email, password, phoneNumber);

        this.department = department;
        this.cgpa = cgpa;
        this.year = year;
    }

    // Getters

    public String getDepartment() {
        return department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getYear() {
        return year;
    }

    // Setters

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Display Student Details

    public void displayStudent() {

        displayUser();

        System.out.println("Department : " + department);
        System.out.println("CGPA       : " + cgpa);
        System.out.println("Year       : " + year);

        System.out.println("-------------------------------------");
    }
}