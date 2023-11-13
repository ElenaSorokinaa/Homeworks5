package House;

import java.security.KeyStore;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class House {
    public static void main(String[] args) {
        Map<Integer, String> personInfo = new HashMap<>();

        personInfo.put(32, "Фролова Мария Ивановна");
        personInfo.put(44, "Фролов Игорь Петрович");
        personInfo.put(8, "Фролов Матвей Игоревич");
        personInfo.put(12, "Фролова Алина Игоревна");
        personInfo.put(74, "Фролова Антонина Владимировна");
        personInfo.put(76, "Фролов Петр Борисович");

        for (Map.Entry<Integer, String> entry : personInfo.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key > 18)
                System.out.println(value);

            int[] emptyArray = new int[0];
            String[] emptyStringArray = new String[0];

            ArrayList<String> listOfValues = personInfo.values().stream()
                    .collect(Collectors.toCollection(ArrayList::new));

            Collections.sort(listOfValues);
            System.out.println("Список жильцов " + listOfValues);
        }
    }
}
