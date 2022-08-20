package Lesson05;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


            AppData app = new AppData();
            app.readCSV("HW.csv");
            System.out.println(Arrays.toString(app.getHeader()));
            System.out.println(Arrays.deepToString(app.getData()));

            app.writeToCSV("NW.csv");


        }
    }

