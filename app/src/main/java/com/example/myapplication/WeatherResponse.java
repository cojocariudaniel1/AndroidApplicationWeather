package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class WeatherResponse {
    @SerializedName("location")
    private Location location;

    @SerializedName("current")
    private CurrentWeather currentWeather;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public CurrentWeather getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(CurrentWeather currentWeather) {
        this.currentWeather = currentWeather;
    }

    // Method to access current weather information
    public String getCurrentWeatherInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("Location: ").append(location.getName()).append(", ").append(location.getRegion()).append(", ").append(location.getCountry()).append("\n");
        builder.append("Local Time: ").append(location.getLocaltime()).append("\n\n");

        builder.append("Temperature: ").append(currentWeather.getTemp_c()).append("°C (").append(currentWeather.getTemp_f()).append("°F)").append("\n");
        builder.append("Condition: ").append(currentWeather.getCondition().getText()).append("\n");
        builder.append("Wind: ").append(currentWeather.getWind_kph()).append(" km/h ").append(currentWeather.getWind_dir()).append("\n");
        builder.append("Pressure: ").append(currentWeather.getPressure_mb()).append(" mb (").append(currentWeather.getPressure_in()).append(" in)").append("\n");
        builder.append("Humidity: ").append(currentWeather.getHumidity()).append("%").append("\n");
        builder.append("UV Index: ").append(currentWeather.getUv()).append("\n");

        return builder.toString();
    }
}

class Location {
    private String name;
    private String region;
    private String country;
    private String localtime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }
}

class CurrentWeather {
    private double temp_c;
    private double temp_f;
    private Condition condition;
    private double wind_kph;
    private String wind_dir;
    private double pressure_mb;
    private double pressure_in;
    private int humidity;
    private double uv;

    public double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }

    public double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(double temp_f) {
        this.temp_f = temp_f;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public double getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(double pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public double getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(double pressure_in) {
        this.pressure_in = pressure_in;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }
}

class Condition {
    private String text;
    private String icon;
    private int code;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
