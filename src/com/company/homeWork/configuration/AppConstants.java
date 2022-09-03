package com.company.homeWork.configuration;

public class AppConstants {

    private static AppConstants INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "AN6OXwnp4yyBuFzvSZx9gxDrOopDTpRWЖ";

    private AppConstants() {
    }

    public static AppConstants getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new AppConstants();
        }
        return INSTANCE;
    }

    public String getSelectedCity() {
        return selectedCity;
    }
    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }
    public String getApiKey() {
        return this.API_KEY;
    }
}
