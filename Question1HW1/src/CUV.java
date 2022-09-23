import java.util.regex.*;
public class CUV {
    public static boolean isitaValidUsername(String name)
    {

        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
}
