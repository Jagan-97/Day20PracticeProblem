package UserRegistration;

public class UserRegistration {
    String regex = "^[A-Z]{1}[a-z]{3,}$";
    protected boolean UserRegistrationUC1(String firstName) {
        boolean result1 = firstName.matches(regex);
        return result1;
    }
    protected boolean UserRegistrationUC2(String lastName) {
        boolean result2 = lastName.matches(regex);
        return result2;
    }

    protected boolean UserRegistrationUC3(String emailID) {
        String regex3 = "^[A-Za-z0-9+_.-]+@(.+)$";
        boolean result3 = emailID.matches(regex3);
        return result3;
    }

    protected boolean UserRegistrationUC4(String mobileNumber) {
        String regex4 = "[91]{2} [0-9]{10}";
        boolean result4 = mobileNumber.matches(regex4);
        return result4;
    }

    protected boolean UserRegistrationUC8(String password) {
        String regex8 = "[A-Z][a-z0-9]{6,}[$&+,:;=?@#|'<>.-^*()%!]";
        boolean result8 = password.matches(regex8);
        return result8;
    }

}
