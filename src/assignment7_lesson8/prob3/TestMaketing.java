package assignment7_lesson8.prob3;

import java.util.*;

public class TestMaketing {
    public static void main(String[] args) {
        ArrayList<Marketing> markets = new ArrayList<>();
        markets.add(new Marketing("John","PlayStaion5",4000));
        markets.add(new Marketing("Sarah","Iphone15Pro",3800));
        markets.add(new Marketing("Chris","VisionPro",3800));
        markets.add(new Marketing("Rich","Xbox 360 Pro",1000));
        Marketing marketing = new Marketing("Jerry","Mac Pro",2300);
        //markets.add(new Marketing("Jerry","Mac Pro",3000));
        markets.add(marketing);
        System.out.println("Remove obj: " + markets.remove(marketing));
        System.out.println("List size is " + markets.size());
        Marketing marketing1 = markets.get(0);
        marketing1.setSalesamount(5000);
        markets.set(0, marketing1);
        System.out.println(Arrays.toString(markets.toArray()));
        Collections.sort(markets,new MarketingComparator());
        System.out.println(Arrays.toString(markets.toArray()));
        System.out.println(Arrays.toString(listMoreThan1000(markets).toArray()));

    }
    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        ArrayList<Marketing> marketings = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesamount() > 1000){
                marketings.add(marketing);
            }
        }
        Collections.sort(marketings,(m1, m2) -> m1.getEmployeename().compareTo(m2.getEmployeename()));
        return marketings;
    }
}
