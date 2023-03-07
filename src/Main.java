import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Ivan", "132-14-44-22");
        phonebook.put("Dmitrii", "223-23-44-22");
        System.out.println(phonebook);
        phonebook.put("Ivan", "132-14-44-22");
        System.out.println(phonebook);
        System.out.println(phonebook.get("Ivan"));
        phonebook.remove("Dmitrii");
        System.out.println(phonebook.get("Dmitrii"));
        if (phonebook.containsKey("Dmitrii")) {
            System.out.println(phonebook.get("Dmitrii"));
        } else {
            System.out.println("contact not found");
        }
        if (phonebook.containsValue("132-14-44-22")) {
            System.out.println("Номер 132-14-44-22 уже присутствует в контакт-листе");
        }

        for (String name: phonebook.keySet()) {
            System.out.println("В мапе присутствует контакт по имени - ключ " + name);
        }

        for (String phoneNumber: phonebook.values()) {
            System.out.println("В мапе присутствует номер телефона - значение " + phoneNumber);
            phonebook.put("Ivan", "666-666-666");
            System.out.println(phonebook);
            phonebook.put("Ivan2", "666-666-666");
            phonebook.put("Ivan3", "666-666-666");
            phonebook.put("Ivan4", "666-666-666");
            phonebook.put("Ivan5", "666-666-666");
            phonebook.put("Ivan6", "666-666-666");
            phonebook.put("Ivan7", "666-666-666");
            phonebook.put("Ivan8", "666-666-666");
            System.out.println(phonebook);
        }
    }
}