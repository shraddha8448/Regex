import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class program3 {
    public static void main(String[] args) {
        String input = "Welcome1 WelcomeABC WelcomeC";
        Pattern pattern = Pattern.compile("Welcome.");  // append only one character
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(input.substring(matcher.start(),matcher.end()));
        }
    }
}
