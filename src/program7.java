import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class program7 {
    public static void main(String[] args) {
        String input = "122sdf234sd213ghj";
        Pattern pattern1 = Pattern.compile("\\D");
        Matcher matcher1 = pattern1.matcher(input);

        while(matcher1.find()){
            System.out.println(matcher1.group());
        }
    }
}
