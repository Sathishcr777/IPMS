package utils;

public class Validator {

    public static boolean isValidEmail(String email) {
        return email != null &&
               email.contains("@") &&
               email.contains(".");
    }

    public static boolean isValidPhone(String phone) {
        return phone != null &&
               phone.matches("\\d{10}");
    }

    public static boolean isValidCGPA(double cgpa) {
        return cgpa >= 0.0 && cgpa <= 10.0;
    }

    public static boolean isValidYear(int year) {
        return year >= 1 && year <= 4;
    }

    public static boolean isNotEmpty(String text) {
        return text != null && !text.trim().isEmpty();
    }
}