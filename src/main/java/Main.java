import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the password : ");
        String in = scan.nextLine();

        if (PasswordChecker.passwordIsValid(in)) {
            System.out.println("Password : " + in + " : is Valid");
        } else {
            System.out.println("Password : " + in + " : is InValid");
        }

        System.out.println("---------------------");

        if (PasswordChecker.passwordIsOk(in)) {
            System.out.println("Password : " + in + " : is OK");
        } else {
            System.out.println("Password : " + in + " : is not OK ");
        }
    }
}
