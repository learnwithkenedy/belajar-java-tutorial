
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        String names = "22";

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(names);
        
        while(matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println(matcher.matches());

        if(matcher.matches()) {
            System.out.println(matcher.group());
        }
    }
}
