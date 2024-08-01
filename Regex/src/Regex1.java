import java.util.regex.*;
public class Regex1{
    public static void main(String args[]){
        Pattern p = Pattern.compile(".s[abc]");
        Matcher m = p.matcher("asb");
        boolean b = m.matches();

        boolean b3 = Pattern.matches(".s", "as");

        boolean b4 = Pattern.matches(".*(ee).*","Sheel");
        boolean b5 = Pattern.matches(".* (ee).*","Sheel ab ee");

        System.out.println(m.group());

        System.out.println(b+" "+b3 + " " + b4 + " " + b5);



    }}