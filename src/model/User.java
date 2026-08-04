package model;

public class User {

    // Attributes
    private String id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;

    // Default Constructor
    public User() {

    }

    // Parameterized Constructor
    public User(String id, String name, String email,
                String password, String phoneNumber) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    // Getters

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Display User Details
    public void displayUser() {

        System.out.println("======================================");
        System.out.println("User ID      : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Email        : " + email);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("======================================");
    }
}
