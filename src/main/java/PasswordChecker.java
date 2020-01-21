import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {

        static Pattern pt = Pattern.compile("[0-9]+");
        static Pattern let = Pattern.compile(".*[A-Z].*");
        static Pattern spec = Pattern.compile("[!@#$%^&()_~.?/,*;+=-]");
        static Pattern low = Pattern.compile(".*[a-z].*");

        public static boolean passwordIsValid(String pass)  {

            Matcher mac = pt.matcher(pass);
            Matcher letters = let.matcher(pass);
            Matcher lowc = low.matcher(pass);
            Matcher special = spec.matcher(pass);

            try {
                for (int i = 0; i < pass.length(); i += 1) {

                    if (pass.length() >= 8) {
                        if (mac.find()) {
                            System.out.println("It has numbers");
                        }
                        else {
                            throw new Error("It doesn't have Digits");
                        }
                        if (letters.find()){
                            System.out.println("It has Uppercases");
                        }
                        else {
                            throw new Error("Does not Uppercases");
                        }
                        if (lowc.find()){
                            System.out.println("It has lowercases");
                        }
                        else {
                            throw new Error("It does not have lowercases");
                        }
                        if (special.find()){
                            System.out.println("It has special characters");
                        }
                        else{
                            throw new Error("It does not have special characters");
                        }
                    }
                    else {
                        throw new Error("Should have 8 or more characters");
                    }
                    break;
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }

            return false;
        }

        public static boolean passwordIsOk(String password) {

            Matcher mac = pt.matcher(password);
            Matcher letters = let.matcher(password);
            Matcher special = spec.matcher(password);
            Matcher lowc = low.matcher(password);
            try {
                for (int i = 0; i < password.length(); i += 1) {
                    if (password.length() > 7) {
                        if ((mac.find() && letters.find()) || (mac.find() && special.find()) ||
                                (letters.find() && special.find()) || (lowc.find() && letters.find()) ||
                                (lowc.find() && special.find()) || (mac.find() && lowc.find())){
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                }
            }
            catch (Exception w){
                System.out.println(w.getMessage());
            }
            return false;
        }
}


