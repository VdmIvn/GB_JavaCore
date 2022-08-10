package Lesson02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] array1 = {
                {"1", "1", "11", "1"},
                {"2", "  ", "2", "2"},
                {"3", "3", "3", "ds"},
                {" 4", "4", "4", "4"}
        };

        String[][] array2 = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"}
        };
        String[][] array3 = {
                {"1", "1", "1", "1"},
                {"2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };
        String[][] array4 = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };


        try {
            stringArrayToInt(array1);
        } catch(MyArraySizeException | MyArrayDataException e) {
            System.out.println("Sent array doesn't meet the requirements of the method: " + e);
        }
        System.out.println();
        try {
            stringArrayToInt(array2);
        } catch(MyArraySizeException | MyArrayDataException e) {
            System.out.println("Sent array doesn't meet the requirements of the method: " + e);
        }
        System.out.println();
        try {
            stringArrayToInt(array3);
        } catch(MyArraySizeException | MyArrayDataException e) {
            System.out.println("Sent array doesn't meet the requirements of the method: " + e);
        }
        System.out.println();
        try {
            stringArrayToInt(array4);
        } catch(MyArraySizeException | MyArrayDataException e) {
            System.out.println("Sent array doesn't meet the requirements of the method: " + e);
        }
    }

    public static void stringArrayToInt(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int length1 = 0;
        int length2 = 0;

        //  цикл на проверку размерности переданного массива
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                length1 = b + 1;
            }
            if (length1 != 4) {
                throw new MyArraySizeException("Array size isn't equal to 4x4");
            }
            length2 = a + 1;

        }
        if (length2 != 4) {
            throw new MyArraySizeException("Array size isn't equal to 4x4");
        }

        //  цикл для преобразования String значений в int значения и последующего суммирования.
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
        //  если раскомментить метод sumValues и применить try-catch блок вместо блока if-else, то метод будет
        //  преобразовывать строки в инты и суммировать их даже после нахождения и выведения на экран строк,
        //  которые невозможно привести к инт значению.
                /*try {
                    sum += sumValues(arr[a][b]);
                } catch (MyArrayDataException e) {
                    System.out.println("Value that can't be converted to int is in the cell [" + a +"]" + "[" + b + "]");
                }*/
                if(isIntValue(arr[a][b])) {
                    sum += Integer.parseInt(arr[a][b]);
                } else {
                    throw new MyArrayDataException("Incorrect type in cell [" + a +"]" + "[" + b + "]");
                }
            }
        }
        System.out.println("The sum of the array values converted to int type is equal to " + sum);
    }

    public static boolean isIntValue(String str) {
         try{
             Integer.parseInt(str);
             return true;
         } catch (NumberFormatException e) {
             return false;
         }
    }

    /*public static int sumValues(String str) throws MyArrayDataException {
        int sum = 0;
        if(isIntValue(str)) {
            sum += Integer.parseInt(str);
        } else {
            throw new MyArrayDataException("MyArrayDataException");
        }
        return sum;
    }*/
}
