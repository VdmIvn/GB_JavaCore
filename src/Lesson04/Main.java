package Lesson04;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    String[] array = {"Car", "Bike", "Truck", "Bus", "Trolleybus", "Tram", "Train", "Bike", "Bus", "Truck"};
    Set<String> uniqueStrings = new HashSet<String>(Arrays.asList(array));
    System.out.println(uniqueStrings);

    System.out.println();

    elementCounter(array, "Bus");

    System.out.println();

    WorkWithStringArray workWithStringArray = new WorkWithStringArray(array);
    workWithStringArray.findArrayStrings();

    System.out.println();

    viewPhoneList();

    }

    // метод для подсчета количества повторов элемента в массиве
    public static void elementCounter(String[] arr, String element) {
        int count = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i].equals(element)) {
                count++;
            }
        }
        System.out.println(element + " occurs in the array " + count + " times");
    }


    private static void viewPhoneList() {

    PhoneList phoneList = new PhoneList();
    phoneList.addToPhoneList("Vadim","1111111");
    phoneList.addToPhoneList("Vadim","(8029)1-111-111");
    phoneList.addToPhoneList("Sasha","2222222");
    phoneList.addToPhoneList("Andrei","3333333");

    System.out.println("Vadim: " + phoneList.getPhones("Vadim"));
    System.out.println("Sasha: " + phoneList.getPhones("Sasha"));
    System.out.println("Andrei: " + phoneList.getPhones("Andrei"));
    }

}



