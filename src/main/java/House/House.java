package House;

import java.util.*;

public class House {
    public static void main(String[] args) {
        Map<String, Integer> personInfo = new HashMap<>();

        personInfo.put("Фролова Мария Ивановна", 32);
        personInfo.put("Фролов Игорь Петрович", 44);
        personInfo.put("Фролов Матвей Игоревич", 8);
        personInfo.put("Фролова Алина Игоревна", 12);
        personInfo.put("Фролова Антонина Владимировна", 74);
        personInfo.put("Фролов Петр Борисович", 76);

        ArrayList<String> arrayFio = new ArrayList<String>();

        for (Map.Entry<String, Integer> entry : personInfo.entrySet()) {
            if (entry.getValue() > 18)
                arrayFio.add(entry.getKey());
        }

        Collections.sort(arrayFio);
        for (int i = 0; i < arrayFio.size(); i++) {
            System.out.println(arrayFio.get(i));
        }
    }
}
