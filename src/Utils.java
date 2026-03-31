import java.util.List;

public class Utils {

    public static boolean hasSameItemInList(String item, List<String> list) {
        for (String element : list) {
            if (element.equals(item)) {
                return true;
            }
        }
        return false;
    }

}
