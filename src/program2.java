import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class program2 {
    public static void main(String[] args) {
        String str = "Regular Expression";
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(str);

        if(matcher.matches()){
            System.out.println("matches successfully");
        }else{
            System.out.println("does not match");
        }

        while(matcher.find()){
            System.out.println(str.substring(matcher.start(),matcher.end()));
        }
    }
}
