// Email Validation
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class program8 {
    boolean emailValidation(String email){
        String regexStr = "^[a-zA-Z0-9]+([.-_]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-z]{2,}$";
        Pattern pattern = Pattern.compile(regexStr);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()){
            return true;
        }

        return false;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Email Id :");
        String emailID = br.readLine();
        program8 obj = new program8();
        if(obj.emailValidation(emailID)){
            System.out.println("Valid Email Id");
        }else{
            System.out.println("Invalid Email Id");
        }
    }
}
