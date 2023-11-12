package Lottery;

import java.lang.reflect.Array;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            arrayList.add(i);
        }
        Collections.shuffle(arrayList);
        Integer[] shuffledArray = arrayList.toArray(new Integer[0]);
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(4));
        System.out.println(arrayList.get(5));
        System.out.println(arrayList.get(6));
        System.out.println(arrayList.get(7));
        System.out.println(arrayList.get(8));
        System.out.println(arrayList.get(9));
    }
}