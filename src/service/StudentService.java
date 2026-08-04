package service;

import java.util.ArrayList;
import model.Student;

public class StudentService {

    // Shared across the whole application
    private static ArrayList<Student> students = new ArrayList<>();

    public void registerStudent(Student student) {

        students.add(student);

        System.out.println("\n======================================");
        System.out.println("Student Registered Successfully!");
        System.out.println("======================================");
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Registered.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
        }
    }

    public boolean studentExists(String id){

    for(Student student : students){

        if(student.getId().equalsIgnoreCase(id)){
            return true;
        }

    }
    

    return false;
}
public Student searchStudent(String id){

    for(Student student : students){

        if(student.getId().equalsIgnoreCase(id)){
            return student;
        }

    }

    return null;
}

public boolean deleteStudent(String id){

    for(int i = 0; i < students.size(); i++){

        if(students.get(i).getId().equalsIgnoreCase(id)){

            students.remove(i);
            return true;

        }

    }

    return false;

}


}

