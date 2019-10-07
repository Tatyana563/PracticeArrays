import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCoincidence {
    public static void main(String[] args) {
        String str = "applepie, applejam, pppapplecake, orange, plum";
        Pattern myPattern = Pattern.compile("(\\w*)apple(\\w*)");
        Matcher myMtcher =myPattern.matcher(str);
        while(myMtcher.find()){
            System.out.println(myMtcher.group());
        }
        String newStr = str.replaceAll("(\\w*)apple(\\w*)", "pear");
        System.out.println(newStr);
    }
}
