// WeatherApiManager.java
package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.Debug;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherApiManager {
    private final Context context;
    private WeatherResponse weatherResponse;

    public WeatherApiManager(Context context) {
        this.context = context;
    }

    public void getCurrentWeather(String location) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WeatherApiInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WeatherApiInterface service = retrofit.create(WeatherApiInterface.class);

//        Call<WeatherResponse> call = service.getCurrentWeather(WeatherApiInterface.API_KEY, location, "no");
        Call<WeatherResponse> call = service.getForecastWeather(WeatherApiInterface.API_KEY, location, 4, "yes", "no");
        call.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(@NonNull Call<WeatherResponse> call, @NonNull Response<WeatherResponse> response) {
                if (response.isSuccessful()) {
                    weatherResponse = response.body();
                    if (weatherResponse != null) {
                        Log.e("**DEBUG**", "weatherResponse is true");
                        setWeatherResponse(weatherResponse);

                        // Procesam raspunsul
                        processWeatherResponse();
                    }
                } else {
                    Toast.makeText(context, "Eroare: " + response.code(), Toast.LENGTH_SHORT).show();
                    System.out.println("WeatherApiManager: Error occurred");
                    System.out.println("RESPONSE: " + response);
                    System.out.println("RESPONSE: " + call);
                }
            }

            @Override
            public void onFailure(@NonNull Call<WeatherResponse> call, @NonNull Throwable t) {
                Toast.makeText(context, "Network error", Toast.LENGTH_SHORT).show();
                System.out.println("WeatherApiManager: Network error");
                System.out.println(t);
            }
        });
    }

    private void processWeatherResponse() {
        ((MainActivity) context).updateUI(weatherResponse);
    }

    public void setWeatherResponse(WeatherResponse weatherResponseX) {
        weatherResponse = weatherResponseX;
    }

}