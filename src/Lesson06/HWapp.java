package Lesson06;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class HWapp {

    public static void main(String[] args) throws IOException {

        final String HOST = "dataservice.accuweather.com";
        final String FORECAST = "forecasts";
        final String VERSION = "v1";
        final String FREQUENCY = "daily";
        final String PERIOD = "5day";
        final String LOCATION_KEY = "474212_PC";
        final String API_KEY = "AN6OXwnp4yyBuFzvSZx9gxDrOopDTpRW";

        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(HOST)
                .addPathSegment(FORECAST)
                .addPathSegment(VERSION)
                .addPathSegment(FREQUENCY)
                .addPathSegment(PERIOD)
                .addPathSegment(LOCATION_KEY)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        Request request = new Request.Builder().url(url).build();

        String response = client.newCall(request).execute().body().string();
        System.out.println(response);
    }
}
