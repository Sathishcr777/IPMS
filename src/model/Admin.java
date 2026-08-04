package model;

public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin(String id, String name, String email,
                 String password, String phoneNumber) {

        super(id, name, email, password, phoneNumber);
    }

    @Override
    public void displayUser() {

        System.out.println("=========== ADMIN ===========");

        super.displayUser();

        System.out.println("=============================");

    }

}