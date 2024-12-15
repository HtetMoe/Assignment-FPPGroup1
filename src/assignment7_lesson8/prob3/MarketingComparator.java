package assignment7_lesson8.prob3;

import java.util.Comparator;

public class MarketingComparator implements Comparator<Marketing> {
    @Override
    public int compare(Marketing m1, Marketing m2) {
        int res = Double.compare(m1.getSalesamount(), m2.getSalesamount());
        if (res == 0) {
            res = m1.getProductname().compareTo(m2.getProductname());
            if (res == 0)
                return m1.getEmployeename().compareTo(m2.getEmployeename());
            else
                return res;
        }
        else
            return res;
    }
}
