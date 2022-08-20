package Lesson04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneList {
    private HashMap<String, HashSet<String>> phoneList = new HashMap<>();

    public void addToPhoneList(String name, String number) {
        HashSet<String> phones;
        if (phoneList.containsKey(name)) {
            phones = phoneList.get(name);
        }
        else {
            phones = new HashSet<>();
        }
        phones.add(number);
        phoneList.put(name,phones);
    }

    public Set<String> getPhones(String name){
        return phoneList.get(name);
    }
}
