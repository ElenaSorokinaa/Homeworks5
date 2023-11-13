package Lottery;

import java.lang.reflect.Array;
//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class LotteryNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            arrayList.add(i);
        }
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        for (int y = 0; y < 10; y++) {
            System.out.println(arrayList.get(y));
        }
    }
}
