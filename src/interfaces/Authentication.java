package interfaces;

public interface Authentication {

    boolean login(String email, String password);

    void logout();

}