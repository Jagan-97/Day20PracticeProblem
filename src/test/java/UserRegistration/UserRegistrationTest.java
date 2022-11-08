package UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest extends UserRegistration {
    UserRegistration UserRegistration = new UserRegistration();
    @Test
    public void firstNameValidate() {
        Assert.assertEquals(true, UserRegistration.UserRegistrationUC1("Jagan"));
    }

    @Test
    public void firstNameValidateNegative() {
        Assert.assertEquals(false, UserRegistration.UserRegistrationUC1("jagan"));
    }

    @Test
    public void lastNameValidatePositive() {
        Assert.assertEquals(true, UserRegistration.UserRegistrationUC2("Saran"));
    }

    @Test
    public void lastNameValidateNegative() {
        Assert.assertEquals(false, UserRegistration.UserRegistrationUC2("saran"));
    }

    @Test
    public void emailIDValidatePositive() {
        Assert.assertEquals(true, UserRegistration.UserRegistrationUC3("jagan.psaran38@gmail.com"));
    }

    @Test
    public void emailIDValidateNegative() {
        Assert.assertEquals(false, UserRegistration.UserRegistrationUC3("jagan.psaran38gmail"));
    }

    @Test
    public void phoneNumberValidatePositive() {
        Assert.assertEquals(true, UserRegistration.UserRegistrationUC4("91 9940698983"));
    }

    @Test
    public void phoneNumberValidateNegative() {
        Assert.assertEquals(false, UserRegistration.UserRegistrationUC4("999940698983"));
    }

    @Test
    public void passwordValidatePositive() {
        Assert.assertEquals(true, UserRegistration.UserRegistrationUC8("Jagansaran123@"));
    }

    @Test
    public void passwordValidateNegative() {
        Assert.assertEquals(false, UserRegistration.UserRegistrationUC8("jagansaran123"));
    }
}