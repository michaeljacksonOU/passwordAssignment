import java.util.Scanner;


public class App {

    boolean length(String Password) {
        if (Password.length() >= 8 && Password.length() <= 16) {
            return true;
        } else {
            return false;
        }
    }

    boolean upperCase(String Password) {
        for (int i = 0; i < Password.length(); i++) {
            if (Character.isUpperCase(Password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    boolean lowerCase(String Password) {
        for (int i = 0; i < Password.length(); i++) {
            if (Character.isLowerCase(Password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    boolean specialCharacter(String Password) {
        for (int i = 0; i < Password.length(); i++) {
            if (!Character.isLetterOrDigit(Password.charAt(i))) {
                return true;
            }
        }
        return false;
        
    }

    boolean number(String Password) {
        for (int i = 0; i < Password.length(); i++) {
            if (Character.isDigit(Password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public void main(String[] args) throws Exception {
    Scanner scnr = new Scanner(System.in);
    String Password;
    int Count = 0;
    System.out.println("Enter a password. Your password must contain at least 3 of the following 4 types of characters: uppercase, lowercase, digit, special character. Password length should be between 8 and 16 characters.");
    Password = scnr.nextLine();
    length(Password);

    if (length(Password) == true) {
        upperCase(Password);
        if (upperCase(Password) == true) {
            Count++;
        }
        lowerCase(Password);
        if (lowerCase(Password) == true) {
            Count++;
        }
        specialCharacter(Password);
        if (specialCharacter(Password) == true) {
            Count++;
        }
        number(Password);
        if (number(Password) == true) {
            Count++;
        }
        if (Count >= 3) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid: Password should contain at least 3 of the following 4 types of characters: uppercase, lowercase, digit, special character.");
        }
    }else {
        System.out.println("Password is invalid: Password length should be between 8 and 16 characters.");
    }



}   
}
