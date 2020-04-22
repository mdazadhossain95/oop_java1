package Generics;

import java.util.ArrayList;

public class introduction {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("AZAD");
        items.add(4);
        items.add(5);

        printDubled(items);

    }

    private static void printDubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println( i * 2);
        }
    }
}
