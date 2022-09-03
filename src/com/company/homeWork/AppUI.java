package com.company.homeWork;

import newHomeWork.homeWork.configuration.AppConstants;

import java.io.IOException;
import java.util.Scanner;

public class AppUI {

    private final Controller controller = new Controller();

    public void runApplication() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Proceed by selecting one of the following options:" + "\n" +
                    "1: Get current weather " + "\n" +
                    "2: Get weather forecast for the next 5 days " + "\n" +
                    "3: Close the application" + "\n" +
                    "Please, enter number of desired option here:");

            String result = scanner.nextLine();

            try {
                checkUserInput(result);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }

            checkIsExit(result);

            if (result.equals("1") || result.equals("2")) {
                System.out.println("Please, enter city name:");
                String city = scanner.nextLine();
                setGlobalCity(city);
            }
            try {
                notifyController(result);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void checkIsExit(String result) throws IOException {
        if (result.equalsIgnoreCase("3")) {
            controller.exitApp();
        }
    }

    private void setGlobalCity(String city) {
        AppConstants.getInstance().setSelectedCity(city);
    }

    private void checkUserInput(String userInput) throws IOException {
        if (userInput == null || userInput.length() != 1) {
            throw new IOException("Warning! One digit should be entered. Your input is: " + userInput);
        }
        int answer;
        try {
            answer = Integer.parseInt(userInput);
            if (answer >= 4){
                throw new IOException("Incorrect user input: character must be in 1-3 range");
            }
        } catch (NumberFormatException e) {
            throw new IOException("Incorrect user input: character isn't a number.");
        }
    }

    private void notifyController(String input) throws IOException {
        controller.onUserInput(input);
    }

}
