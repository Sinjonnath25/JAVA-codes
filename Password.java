import java.util.*;
import java.lang.String;
import java.lang.Character;
  
public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = input.next();
        if (isValid(password)) {
            System.out.println("Password is valid: "+password);
        } else {
             System.out.println("Password is invalid: "+password);
        }
    }
    public static boolean isValid(String password) {
        if (password.length() < 8) { 
            return false;
        } else {    
            char c;
            int count = 1; 
            for (int i = 0; i < password.length() - 1; i++) {
                c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {        
                    return false;
                } else if (Character.isDigit(c)) {
                    count++;
                    if (count < 2)   {   
                        return false;
                    }   
                }
            }
        }
        return true;
    }
}