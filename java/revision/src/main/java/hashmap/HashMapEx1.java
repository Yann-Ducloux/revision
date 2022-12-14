package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<String, String>();

        phonebook.put("01000005", "Tom");
        phonebook.put("01000002", "Jerry");
        phonebook.put("01000003", "Tom");
        phonebook.put("01000004", "Donald");

        Set<String> phoneNumbers = phonebook.keySet();

        for (String phoneNumber : phoneNumbers) {
            String name = phonebook.get(phoneNumber);

            System.out.println("Phone Number: " + phoneNumber + " ==> Name: " + name);
        }
    }
}