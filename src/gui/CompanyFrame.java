package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CompanyFrame extends JFrame {

    public CompanyFrame() {

        setTitle("Company Portal");
        setSize(1200,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Color background = new Color(20,25,40);
        Color sidebar = new Color(15,20,35);
        Color blue = new Color(0,120,215);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(sidebar);
        leftPanel.setPreferredSize(new Dimension(250,700));
        leftPanel.setLayout(new BoxLayout(leftPanel,BoxLayout.Y_AXIS));
        leftPanel.setBorder(new EmptyBorder(40,20,20,20));

        JLabel title = new JLabel("COMPANY");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Segoe UI",Font.BOLD,30));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        leftPanel.add(title);
        leftPanel.add(Box.createVerticalStrut(40));

        JButton registerBtn = createButton("Register Company", blue);
        JButton jobsBtn = createButton("Post Job", blue);
        JButton viewBtn = createButton("View Companies", blue);
        JButton backBtn = createButton("Back", Color.RED);

        leftPanel.add(registerBtn);
        leftPanel.add(Box.createVerticalStrut(20));

        leftPanel.add(jobsBtn);
        leftPanel.add(Box.createVerticalStrut(20));

        leftPanel.add(viewBtn);
        leftPanel.add(Box.createVerticalGlue());

        leftPanel.add(backBtn);

        JPanel center = new JPanel(null);
        center.setBackground(background);

        JLabel heading = new JLabel("Company Dashboard");
        heading.setBounds(180,40,500,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Segoe UI",Font.BOLD,32));

        JLabel sub = new JLabel("Manage Company and Job Postings");
        sub.setBounds(180,85,500,25);
        sub.setForeground(Color.LIGHT_GRAY);
        sub.setFont(new Font("Segoe UI",Font.PLAIN,18));

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setFont(new Font("Consolas",Font.PLAIN,16));

        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(180,150,650,350);

        registerBtn.addActionListener(e ->
                area.setText("Company Registration\n\nBackend will be connected next.")
        );

        jobsBtn.addActionListener(e ->
                area.setText("Post Job\n\nJob posting module will be connected next.")
        );

        viewBtn.addActionListener(e ->
                area.setText("View Companies\n\nRegistered companies will appear here.")
        );

        backBtn.addActionListener(e -> {
            dispose();
            new HomeFrame();
        });

        center.add(heading);
        center.add(sub);
        center.add(scroll);

        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(center, BorderLayout.CENTER);

        add(mainPanel);

        setVisible(true);
    }

    private JButton createButton(String text, Color color) {

        JButton btn = new JButton(text);

        btn.setMaximumSize(new Dimension(200,50));
        btn.setBackground(color);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Segoe UI", Font.BOLD,16));
        btn.setFocusPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        return btn;
    }
}