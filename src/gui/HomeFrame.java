package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class HomeFrame extends JFrame {

    public HomeFrame() {

        setTitle("Internship & Placement Management System");
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Color background = new Color(20, 25, 40);
        Color sidebar = new Color(15, 20, 35);
        Color blue = new Color(0, 120, 215);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(background);

        // ================= LEFT PANEL =================

        JPanel leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(260, 700));
        leftPanel.setBackground(sidebar);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(new EmptyBorder(40, 25, 40, 25));

        JLabel logo = new JLabel("IPMS");
        logo.setForeground(Color.WHITE);
        logo.setFont(new Font("Segoe UI", Font.BOLD, 38));
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel college = new JLabel("<html><center>Easwari Engineering College</center></html>");
        college.setForeground(Color.LIGHT_GRAY);
        college.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        college.setAlignmentX(Component.CENTER_ALIGNMENT);

        leftPanel.add(logo);
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(college);

        // ================= CENTER PANEL =================

        JPanel center = new JPanel();
        center.setBackground(background);
        center.setLayout(null);

        JLabel title = new JLabel("Internship & Placement Management System");
        title.setBounds(130, 60, 700, 45);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Segoe UI", Font.BOLD, 30));

        JLabel subtitle = new JLabel("Welcome to the Internship & Placement Portal");
        subtitle.setBounds(190, 105, 600, 30);
        subtitle.setForeground(Color.LIGHT_GRAY);
        subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        JButton student = createButton("Student Portal", blue);
        student.setBounds(210, 190, 360, 55);

        student.addActionListener(e -> {
            dispose();
            new StudentFrame();
        });

        JButton company = createButton("Company Portal", blue);
        company.setBounds(210, 275, 360, 55);

        company.addActionListener(e -> {
            dispose();
            new CompanyFrame();
        });

        JButton officer = createButton("Placement Officer", blue);
        officer.setBounds(210, 360, 360, 55);

        JButton exit = createButton("Exit", new Color(220, 53, 69));
        exit.setBounds(280, 470, 220, 50);

        exit.addActionListener(e -> System.exit(0));

        JLabel footer = new JLabel("© 2026 Easwari Engineering College");
        footer.setBounds(220, 585, 400, 25);
        footer.setForeground(Color.GRAY);
        footer.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        center.add(title);
        center.add(subtitle);
        center.add(student);
        center.add(company);
        center.add(officer);
        center.add(exit);
        center.add(footer);

        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(center, BorderLayout.CENTER);

        add(mainPanel);

        setVisible(true);
    }

    private JButton createButton(String text, Color color) {

        JButton button = new JButton(text);

        button.setBackground(color);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setFont(new Font("Segoe UI", Font.BOLD, 18));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        return button;
    }
}