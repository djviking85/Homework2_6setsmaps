import java.util.*;


public class Main {
    public static void main(String[] args) {
        // обучение
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
        // задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 5, 10, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (!isChetnoe(num))
            System.out.println( "значение не четное " + num );
                    }

        for (int i = 0; i < nums.size(); i++) {
            System.out.println( i + " <- Элемент, значение ->" + nums.get(i));
        }
        // задание 2
        Collections.sort(nums);
        Set<Integer> numSet = new HashSet<>(nums);
        System.out.println(numSet);
        for (Integer num: numSet) {
            if (isChetnoe(num)) {
                System.out.println("значения четные - "+num);
            }

        }
        // задание 3
        List<String> strings = new ArrayList<>(List.of("Hi", "My", "name", "is", "Alexander", "and", "Hi", "again"));
        System.out.println(strings);
        // преобразуем лист в хэш, дающий ему уникальность
        Set<String> stringText = new HashSet<>(strings);
        System.out.println(stringText);
        // задание 4
        // делаем из листа мапу
        Map<String, Integer> howManyInStringReturnes = new HashMap<>();
        System.out.println(howManyInStringReturnes);
        // бегаем по словам
        for (String string: strings) {
            // если слово - нуль то путаем в слово - 1
            if (howManyInStringReturnes.get(string) == null) {
                howManyInStringReturnes.put(string, 1);
                System.out.println(howManyInStringReturnes);
            } else {
                // но если ключ  есть мы путаем в вольюм +1 и получаем по ключам сумму
                howManyInStringReturnes.put(string, howManyInStringReturnes.get(string) + 1);
                System.out.println(howManyInStringReturnes);
            }
            System.out.println(howManyInStringReturnes);
        }
    }
    // метод говорящий о том, что числа четные
    private static boolean isChetnoe(Integer num) {
        return num % 2 == 0;
    }
}