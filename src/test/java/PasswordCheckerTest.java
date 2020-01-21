//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

class PasswordCheckerTest {

    PasswordChecker password = new PasswordChecker();

    @Test
    void passwordIsValid() throws Exception {
        boolean pass = password.passwordIsValid("asjskhj5655kUUU?");
        assertTrue(true);
        boolean faails = PasswordChecker.passwordIsValid("sajSSss..ass");
        assertTrue(true);
        boolean fail = password.passwordIsValid("jsjhYYUos5555");
        assertTrue(true);
    }

    @Test
    void passwordIsOk() {

    }
}