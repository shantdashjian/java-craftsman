package chapter4.avoid_single_letter_names.problem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Supply> sl = new ArrayList<>();

    boolean isInStock(String n) {
        Supply s = new Supply(n);
        int l = 0;
        int h = sl.size() - 1;

        while (l <= h) {
            int m = l + (h - l) / 2;
            int c = sl.get(m).compareTo(s);

            if (c < 0) {
                l = m + 1;
            } else if (c > 0) {
                h = m - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
