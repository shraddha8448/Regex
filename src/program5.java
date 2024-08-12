import java.util.regex.Pattern;
import java.util.regex.Matcher;
// mobile number validation
public class program5 {
    public static void main(String[] args) {

        String input = "8877587653";
        Pattern pattern = Pattern.compile("[789]{1}[0-9]{9}");
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            System.out.println("valid");
        }else{
            System.out.println("Invalid");
        }

    }
}
