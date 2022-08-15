package Lesson03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        homeWorkMethod();

    // проверка работы метода для перемены местами двух элементов массива местами
        System.out.println("------------------------------------------------------------");
            Integer[] intArr = {1, 4, 5, 6};
            String[] strArr = {"One", "Two", "Three"};
            swapArrayElement(intArr, 0, 3);
            swapArrayElement(strArr, 0, 2);
        }

    public static void homeWorkMethod () {
        FruitBox<Apple> boxWithApples = new FruitBox<>(1.0f);
        FruitBox<Orange> boxWithOranges = new FruitBox<>(1.5f);
        FruitBox<Orange> boxWithOranges2 = new FruitBox<>(1.5f);

        int appleSum = 0;
        int orangeSum = 0;
        for (int i = 0; i < 5; i++) {
            boxWithApples.addFruit(new Apple());
            System.out.println("Apple is added to the box with apples");
            boxWithOranges.addFruit(new Orange());
            System.out.println("Orange is added to the box with oranges");

            appleSum++;
            orangeSum++;
        }
        System.out.println();
        boxWithOranges.compare(boxWithApples);
        boxWithApples.compare(boxWithApples);
        System.out.println();
        System.out.println("Apples quantity after adding is equal to " + appleSum);
        System.out.println("Oranges quantity after adding is equal to " + orangeSum);
        System.out.println();
        System.out.println("Weight of the box with apples is equal to " + boxWithApples.getWeight());
        System.out.println("Weight of the box with oranges is equal to " + boxWithOranges.getWeight());
        System.out.println();
        boxWithOranges2.addFruit(new Orange());
        boxWithOranges.addFruitsToBox(boxWithOranges2);

    }
    // метод для перемены местами двух элементов массива (1 задание)
        public static <T > void swapArrayElement (T[]arr,int index1, int index2){
            T var = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = var;

            System.out.println(Arrays.toString(arr));
        }

}







