package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView currentLocation;
    private TextView currentLocationTempC;

    private static final String defaultLocation = "Romania, Iasi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        currentLocation = findViewById(R.id.id_current_location);
        currentLocationTempC= findViewById(R.id.id_current_location_temp_c);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        performActions();
    }



    private void performActions() {
        WeatherApiManager apiManager = new WeatherApiManager(this);
        apiManager.getCurrentWeather(defaultLocation);
    }

    @SuppressLint("SetTextI18n")
    public void updateUI(WeatherResponse weatherResponse) {
        if (weatherResponse != null) {
            currentLocation.setText(defaultLocation);
            currentLocationTempC.setText(String.valueOf(weatherResponse.getcurrentInfo()));
        } else {
            currentLocationTempC.setText("EROARE API");
        }
    }
}
