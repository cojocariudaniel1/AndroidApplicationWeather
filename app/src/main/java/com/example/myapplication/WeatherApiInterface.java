package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApiInterface {

    String BASE_URL = "https://api.weatherapi.com/v1/";
    String API_KEY = "bff184d2f895455a9f774004240704";

    @GET("current.json")
    Call<WeatherResponse> getCurrentWeather(@Query("key") String key, @Query("q")String q, @Query("aqi") String aqi);

}