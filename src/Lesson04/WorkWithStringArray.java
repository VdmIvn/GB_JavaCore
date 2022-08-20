package Lesson04;

import java.util.HashMap;
import java.util.Map;

public class WorkWithStringArray {
    private String[] stringArray;

    public WorkWithStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }


    public void findArrayStrings() {
        HashMap<String, Integer> mapWords = getMapStrings(stringArray);
        for (Map.Entry entry : mapWords.entrySet()) {
            if (entry.getValue().equals(1)) {
                System.out.println(entry.getKey());
            }
        }
    }

    private HashMap<String, Integer> getMapStrings(String[] stringArray) {
        HashMap<String, Integer> mapWords = new HashMap<>();
        for (int i = 0; i < stringArray.length; i++) {
            if (mapWords.containsKey(stringArray[i])) {
                mapWords.put(stringArray[i], mapWords.get(stringArray[i]) + 1);
            } else {
                mapWords.put(stringArray[i], 1);
            }
        }
        return mapWords;
    }
}
