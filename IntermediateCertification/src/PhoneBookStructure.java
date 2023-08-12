import java.util.*;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

public class PhoneBookStructure {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> phoneBookStructure = new HashMap<>();

        addEntry(phoneBookStructure, "Иван", "+7 911 111 22 33");
        addEntry(phoneBookStructure, "Иван", "+7 901 111 22 33");
        addEntry(phoneBookStructure, "Иван", "+7 911 111 22 33");
        addEntry(phoneBookStructure, "Иван", "+7 911 111 22 35"); // номер другой

        addEntry(phoneBookStructure, "Иоган", "+7 941 111 22 33");
        addEntry(phoneBookStructure, "Иоган", "+7 941 111 22 33");
        addEntry(phoneBookStructure, "Иоган", "+7 951 111 22 33");

        addEntry(phoneBookStructure, "Михаил", "+7 961 111 22 33");
        addEntry(phoneBookStructure, "Михаил", "+7 971 111 22 33");

        addEntry(phoneBookStructure, "Джон", "+7 921 111 22 33");
        addEntry(phoneBookStructure, "Джон", "+7 931 111 22 33");

        addEntry(phoneBookStructure, "Майкл", "+7 981 111 22 33");

        printPhoneBook(phoneBookStructure);
    }

    public static void addEntry(HashMap<String, HashSet<String>> phoneBookStructure, String name, String phone) {
        if (phoneBookStructure.containsKey(name)) {
            HashSet<String> phones = phoneBookStructure.get(name);
            phones.add(phone);
        } else {
            HashSet<String> phones = new HashSet<>();
            phones.add(phone);
            phoneBookStructure.put(name, phones);
        }

    }

    public static void printPhoneBook(HashMap<String, HashSet<String>> phoneBookStructure) {
        List<Map.Entry<String, HashSet<String>>> entries = new ArrayList<>(phoneBookStructure.entrySet());
        entries.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

        for (Map.Entry<String, HashSet<String>> entry : entries) {
            System.out.println(entry.getKey() + ":");
            
            HashSet<String> phones = entry.getValue();

            for (String phone : phones) {
                System.out.println(phone);
            }

            System.out.println();
        }
    }
}
