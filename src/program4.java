import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class program4 {
    public static void main(String[] args) {
        String input = "12345asdf";
        // for the digut ----- \\d
        Pattern pattern = Pattern.compile("\\d");  // for the digit
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(input.substring(matcher.start(),matcher.end()));
        }

        // for the non-digit --- \\D
        Pattern pattern1 = Pattern.compile("\\D");
        Matcher matcher1 = pattern1.matcher(input);

        while(matcher1.find()){
            System.out.println(input.substring(matcher1.start(),matcher1.end()));
        }


    }
}

