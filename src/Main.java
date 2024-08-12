// Regex
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class program1 {
    void checked(Matcher matcher){
        if(matcher.matches()){
            System.out.println("Pattern match successfully");
        }else{
            System.out.println("does not match pattrn");
        }
    }
    public static void main(String[] args) {
        // 1st
        Pattern pattern = Pattern.compile("abc");
        Matcher matcher = pattern.matcher("abc");
        program1 obj = new program1();
        obj.checked(matcher);

        // 2nd
        Pattern pattern1 = Pattern.compile("[abc]");
        Matcher matcher1 = pattern1.matcher("a");
        obj.checked(matcher1);

        // 3rd
        Matcher mat1 = pattern1.matcher("z");
        obj.checked(mat1);

        // 4th
        Pattern pattern2 = Pattern.compile("[a-z]");
        Matcher matcher2 = pattern2.matcher("u");
        obj.checked(matcher2);
        Matcher mat2 = pattern2.matcher("Z");
        obj.checked(mat2);

        // 5th
        Pattern pattern3 = Pattern.compile("[0-9]");
        Matcher matcher3 = pattern3.matcher("6");
        obj.checked(matcher3);

        // 6th
        Pattern pattern4 = Pattern.compile("[^abc]");
        Matcher matcher4 = pattern4.matcher("z");
        obj.checked(matcher4);
        Matcher mat4 = pattern4.matcher("a");
        obj.checked(mat4);

    }
}