import java.util.ArrayList;
import java.util.List;

public class PangramChecker {

    public boolean isPangram(String input) {
        // 97 = a, 122 = z
        for (int i = 97; i <= 122; i++) {
            String character = Character.toString((char) i);
            if (!input.contains(character)) {
                return false;
            }
        }
        return true;
    }

}
