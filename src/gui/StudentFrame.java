package gui;

import javax.swing.*;
import java.awt.*;
import service.StudentService;
import model.Student;

public class StudentFrame extends JFrame {

    StudentService studentService = new StudentService();

    JTextField txtId;
    JTextField txtName;
    JTextField txtEmail;
    JTextField txtPassword;
    JTextField txtPhone;
    JTextField txtDepartment;
    JTextField txtCGPA;
    JTextField txtYear;

    JButton btnRegister;
    JButton btnView;
    JButton btnClear;
    JButton btnDelete;
    JButton btnBack;

    JTextArea outputArea;

    public StudentFrame() {

        setTitle("Student Portal");
        setSize(1200,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        initializeComponents();

        setVisible(true);
    }

    private void initializeComponents() {



        JLabel title = new JLabel("Student Registration");
        title.setBounds(430,20,350,40);
        title.setFont(new Font("Segoe UI",Font.BOLD,28));
        add(title);

        JLabel lblId = new JLabel("Student ID");
        lblId.setBounds(300,90,120,25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(450,90,250,30);
        add(txtId);

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(300,140,120,25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(450,140,250,30);
        add(txtName);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(300,190,120,25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(450,190,250,30);
        add(txtEmail);
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(300,240,120,25);
        add(lblPassword);

        txtPassword = new JTextField();
        txtPassword.setBounds(450,240,250,30);
        add(txtPassword);

        JLabel lblPhone = new JLabel("Phone");
        lblPhone.setBounds(300,290,120,25);
        add(lblPhone);

        txtPhone = new JTextField();
        txtPhone.setBounds(450,290,250,30);  
        add(txtPhone);

        JLabel lblDepartment = new JLabel("Department");
        lblDepartment.setBounds(300,340,120,25);
        add(lblDepartment);

        txtDepartment = new JTextField();
        txtDepartment.setBounds(450,340,250,30);
        add(txtDepartment);

        JLabel lblCGPA = new JLabel("CGPA");
        lblCGPA.setBounds(300,390,120,25);
        add(lblCGPA);

        txtCGPA = new JTextField();
        txtCGPA.setBounds(450,390,250,30);
        add(txtCGPA);

        JLabel lblYear = new JLabel("Year");
        lblYear.setBounds(300,440,120,25);
        add(lblYear);

        txtYear = new JTextField();
        txtYear.setBounds(450,440,250,30);
        add(txtYear);
        btnRegister = new JButton("Register");
        btnRegister.setBounds(300,520,120,40);
        add(btnRegister);

        btnView = new JButton("View Students");
        btnView.setBounds(440,520,140,40);
        add(btnView);

        btnClear = new JButton("Clear");
        btnClear.setBounds(600,520,100,40);
        add(btnClear);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(720,520,100,40);
        add(btnDelete);

        btnBack = new JButton("Back");
        btnBack.setBounds(720,520,100,40);
        add(btnBack);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setBounds(750,90,380,430);
        add(scrollPane);
        btnBack.addActionListener(e -> {
        dispose();
        new HomeFrame();
    });

    


add(scrollPane);

btnBack.addActionListener(e -> {
    dispose();
    new HomeFrame();
});

btnRegister.addActionListener(e -> {

    if(studentService.studentExists(txtId.getText())){

    JOptionPane.showMessageDialog(
            this,
            "Student ID already exists!"
    );

    return;

}

    try {

        Student student = new Student(

                txtId.getText(),
                txtName.getText(),
                txtEmail.getText(),
                txtPassword.getText(),
                txtPhone.getText(),
                txtDepartment.getText(),
                Double.parseDouble(txtCGPA.getText()),
                Integer.parseInt(txtYear.getText())

        );

        studentService.registerStudent(student);

        JOptionPane.showMessageDialog(
                this,
                "Student Registered Successfully!"
        );

        txtId.setText("");
        txtName.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtPhone.setText("");
        txtDepartment.setText("");
        txtCGPA.setText("");
        txtYear.setText("");

    } catch (Exception ex) {

        JOptionPane.showMessageDialog(
                this,
                "Please enter valid details!"
        );

    }


});

btnView.addActionListener(e -> {

    outputArea.setText("");

    if(studentService.getStudents().isEmpty()){

        outputArea.setText("No Students Registered.");

        return;
    }

    for(Student student : studentService.getStudents()){

        outputArea.append("Student ID : " + student.getId() + "\n");
        outputArea.append("Name       : " + student.getName() + "\n");
        outputArea.append("Email      : " + student.getEmail() + "\n");
        outputArea.append("Phone      : " + student.getPhoneNumber() + "\n");
        outputArea.append("Department : " + student.getDepartment() + "\n");
        outputArea.append("CGPA       : " + student.getCgpa() + "\n");
        outputArea.append("Year       : " + student.getYear() + "\n");
        outputArea.append("----------------------------------------\n\n");

    }

});
txtId.addActionListener(e -> txtName.requestFocus());

txtName.addActionListener(e -> txtEmail.requestFocus());

txtEmail.addActionListener(e -> txtPassword.requestFocus());

txtPassword.addActionListener(e -> txtPhone.requestFocus());

txtPhone.addActionListener(e -> txtDepartment.requestFocus());

txtDepartment.addActionListener(e -> txtCGPA.requestFocus());

txtCGPA.addActionListener(e -> txtYear.requestFocus());

txtYear.addActionListener(e -> btnRegister.doClick());

btnClear.addActionListener(e -> {

    txtId.setText("");
    txtName.setText("");
    txtEmail.setText("");
    txtPassword.setText("");
    txtPhone.setText("");
    txtDepartment.setText("");
    txtCGPA.setText("");
    txtYear.setText("");

    txtId.requestFocus();

});
btnDelete.addActionListener(e -> {

    String id = JOptionPane.showInputDialog(
            this,
            "Enter Student ID to Delete"
    );

    if(id == null || id.isEmpty()){
        return;
    }

    if(studentService.deleteStudent(id)){

        JOptionPane.showMessageDialog(
                this,
                "Student Deleted Successfully!"
        );

    }
    else{

        JOptionPane.showMessageDialog(
                this,
                "Student Not Found!"
        );

    }

});
}
}