// WeatherApiManager.java
package com.example.myapplication;

import android.content.Context;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherApiManager {
    private final Context context;

    public WeatherApiManager(Context context) {
        this.context = context;
    }

    public void getCurrentWeather(String location) {
        // Initializare Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WeatherApiService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Creează instanța interfeței WeatherApiService
        WeatherApiService service = retrofit.create(WeatherApiService.class);

        // trimite cererea api.
        Call<WeatherResponse> call = service.getCurrentWeather(WeatherApiService.API_KEY, location, "no");
        call.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                // Procesare cerere daca raspunsul este bun
                if (response.isSuccessful()) {
                    WeatherResponse weatherResponse = response.body();
                    if (weatherResponse != null) {
                        System.out.println(weatherResponse.getCurrentWeatherInfo());
                    }
                } else {
                    Toast.makeText(context, "Eroare: " + response.code(), Toast.LENGTH_SHORT).show();
                    System.out.println("WeatherApiManager: Error occurred");
                }
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                Toast.makeText(context, "Network error", Toast.LENGTH_SHORT).show();
                System.out.println("WeatherApiManager: Network error");
            }
        });
    }
}
