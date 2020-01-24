//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.Test;
import org.junit.jupiter.api.Test;

class PasswordCheckerTest {

    PasswordChecker password = new PasswordChecker();

//    @Test
//    void passwordIsValid() throws Exception {
//        boolean pass = password.passwordIsValid("asjskhj5655kUUU?");
//        assertTrue(true);
//        boolean faails = PasswordChecker.passwordIsValid("sajSSss..ass");
//        assertTrue(true);
//        boolean fail = password.passwordIsValid("jsjhYYUos5555");
//        assertTrue(true);
//
//
////        assertThrows(true, password.passwordIsOk(""))
//    }


    @Test
    void passwordIsValid()  throws Exception
    {
        assertThrows(digitException.class, ()-> {
            password.passwordIsValid("sUUUskja@@as");
        });

        assertThrows(SpecialException.class, ()-> {
            password.passwordIsValid("AAkijdsjkwoe98959");
        });

        assertThrows(lowerCase.class, ()-> {
            password.passwordIsValid("SMKMAMKL565454JBBS...");
        });

        assertThrows(lengthException.class, ()-> {
            password.passwordIsValid("AaHN87.@");
        });

        assertThrows(upperCaseException.class, ()-> {
            password.passwordIsValid("kjhdqdy898...");
        });


    }

    @Test
    void passwordIsOk() {

    }
}