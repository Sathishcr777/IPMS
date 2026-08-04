package model;

public class Officer extends User {

    public Officer() {
        super();
    }

    public Officer(String id, String name, String email,
                   String password, String phoneNumber) {

        super(id, name, email, password, phoneNumber);
    }

    @Override
    public void displayUser() {

        System.out.println("====== PLACEMENT OFFICER ======");

        super.displayUser();

        System.out.println("===============================");

    }

}