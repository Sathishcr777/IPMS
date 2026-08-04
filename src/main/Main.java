package main;

import java.util.Scanner;

import model.Student;
import service.StudentService;
import model.Company;
import service.CompanyService;
import service.JobService;
import service.PlacementOfficerService;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StudentService studentService = new StudentService();
    static CompanyService companyService = new CompanyService();
    static JobService jobService = new JobService();
    static PlacementOfficerService placementOfficerService = new PlacementOfficerService();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n====================================================");
            System.out.println("     INTERNSHIP & PLACEMENT MANAGEMENT SYSTEM");
            System.out.println("====================================================");
            System.out.println("1. Student Portal");
            System.out.println("2. Company Portal");
            System.out.println("3. Placement Officer");
            System.out.println("4. Exit");
            System.out.println("====================================================");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    studentMenu();
                    break;

                case 2:
                    companyMenu();
                    break;

                case 3:
                    placementOfficerMenu();
                    break;

                case 4:
                    System.out.println("\nThank You for Using IPMS!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static void studentMenu() {

        while (true) {

            System.out.println("\n============== STUDENT PORTAL ==============");
            System.out.println("1. Register Student");
            System.out.println("2. View Students");
            System.out.println("3. Back");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Student ID : ");
                    String id = sc.nextLine();

                    System.out.print("Name : ");
                    String name = sc.nextLine();

                    System.out.print("Email : ");
                    String email = sc.nextLine();

                    System.out.print("Password : ");
                    String password = sc.nextLine();

                    System.out.print("Phone : ");
                    String phone = sc.nextLine();

                    System.out.print("Department : ");
                    String department = sc.nextLine();

                    System.out.print("CGPA : ");
                    double cgpa = sc.nextDouble();

                    System.out.print("Year : ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    Student student = new Student(
                        id, name, email, password, phone,
                        department, cgpa, year);

                    studentService.registerStudent(student);
                    break;

                case 2:
                    studentService.viewStudents();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }


}
