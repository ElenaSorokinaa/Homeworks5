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


        System.out.println(personInfo);

        System.out.println("Удаляем элемент с ключом " + 8);
        personInfo.remove(8);

        System.out.println("Удаляем элемент с ключом " + 12);
        personInfo.remove(12);

        System.out.println("Все пары ключ-значение старше 18 лет " + personInfo.entrySet());

        for (Map.Entry<Integer, String> entry : personInfo.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Возраст " + key + " ФИО " + value);

            ArrayList<Integer> listOfKeys = personInfo.keySet().stream()
                    .collect(Collectors.toCollection(ArrayList::new));

            ArrayList<String> listOfValues = personInfo.values().stream()
                    .collect(Collectors.toCollection(ArrayList::new));
            System.out.println("Список жильцов " + listOfValues);
        }
    }
}