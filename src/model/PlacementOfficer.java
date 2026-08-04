package model;

public class PlacementOfficer extends User {

    private String employeeId;
    private String designation;

    public PlacementOfficer() {
        super();
    }

    public PlacementOfficer(String id, String name, String email,
                            String password, String phoneNumber,
                            String employeeId, String designation) {

        super(id, name, email, password, phoneNumber);

        this.employeeId = employeeId;
        this.designation = designation;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void displayPlacementOfficer() {

        displayUser();

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Designation : " + designation);
        System.out.println("--------------------------------");
    }
}