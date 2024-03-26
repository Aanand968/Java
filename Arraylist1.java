package Arrays;

import java.util.ArrayList;

public class Arraylist1 {


    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        ArrayList<Integer> row2 = new ArrayList<>();
        ArrayList<Integer> row3 = new ArrayList<>();
        row1.add(22);
        row1.add(221);
        row2.add(222);
        row2.add(223);
        row2.add(224);
        row3.add(225);
        row3.add(226);
        row3.add(227);
        row3.add(228);

        list.add(row1);
        list.add(row2);
        list.add(row3);

        for (ArrayList<Integer> row : list) {
            for (Integer value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println(list.get(0).size());
        System.out.println(list.get(1).get(1));
    }
}