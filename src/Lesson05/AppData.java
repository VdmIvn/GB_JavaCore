package Lesson05;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private Integer[][] data;
    private String separator = "; ";

    public String[] getHeader() {
        return header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void readCSV(String file) {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            ArrayList<Integer[]> arrList = new ArrayList<>();
            header = (reader.readLine().split(separator));
            String str;
            while ((str = reader.readLine()) != null) {
                String[] strArr = str.split(separator);
                Integer[] intArr = new Integer[strArr.length];
                for (int i = 0; i < strArr.length; i++) {
                    intArr[i] = Integer.parseInt(strArr[i].trim());
                }
                arrList.add(intArr);
            }
            data = arrList.toArray(new Integer[][]{});

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void writeToCSV(String resultFileName) {
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(resultFileName), StandardCharsets.UTF_8)))
        {

            StringBuffer oneLine = new StringBuffer();
            for (int i = 0; i < header.length; i++) {
                oneLine.append(header[i]);
                oneLine.append(separator);
            }
            writer.write(oneLine.toString());
            writer.newLine();

            for (int i = 0; i < data.length; i++) {
                Integer[] rowData = data[i];
                oneLine.delete(0, oneLine.length());
                for (int j = 0; j < rowData.length; j++) {
                    oneLine.append(rowData[j]);
                    oneLine.append(separator);
                }
                writer.write(oneLine.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
