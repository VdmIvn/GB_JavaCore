package com.company.homeWork;

import newHomeWork.homeWork.enums.AppOptions;
import newHomeWork.homeWork.enums.ForecastPeriod;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Controller {

    AccuWeather accuWeather = new AccuWeather();

    Map<Integer, AppOptions> variantResult = new HashMap();

    public Controller() {
        variantResult.put(1, AppOptions.GET_CURRENT_WEATHER);
        variantResult.put(2, AppOptions.GET_WEATHER_IN_NEXT_5_DAYS);
        variantResult.put(3, AppOptions.EXIT);
    }

    public void onUserInput(String input) throws IOException {
        int command = Integer.parseInt(input);
        switch (variantResult.get(command)) {
            case GET_CURRENT_WEATHER:
                getCurrentWeather();
                break;
            case GET_WEATHER_IN_NEXT_5_DAYS:
                getFiveDaysWeather();
                break;
            case EXIT:
                exitApp();
                break;
        }
    }

    public void getCurrentWeather() throws IOException{
        accuWeather.getWeather(ForecastPeriod.NOW);
    }

    public void getFiveDaysWeather() throws IOException {
        accuWeather.getWeather(ForecastPeriod.FIVE_DAYS);
    }


    public void exitApp() throws IOException {
        System.out.println("Application is closed");
        System.exit(3);
    }
}
