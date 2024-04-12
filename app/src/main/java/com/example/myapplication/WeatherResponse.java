package com.example.myapplication;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class WeatherResponse {

    private Location location;
    private Current current;
    private Forecast forecast;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void getcurrentInfo(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String getcurrentInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("Location: ").append(location.getName()).append(", ").append(location.getRegion()).append(", ").append(location.getCountry()).append("\n");
        builder.append("Local Time: ").append(location.getLocaltime()).append("\n\n");

        builder.append("Temperature: ").append(current.gettemp_c()).append("°C (").append(current.gettemp_f()).append("°F)").append("\n");
        builder.append("Condition: ").append(current.getCondition().getText()).append("\n");
        builder.append("Wind: ").append(current.getwind_kph()).append(" km/h ").append(current.getwind_dir()).append("\n");
        builder.append("Pressure: ").append(current.getpressure_mb()).append(" mb (").append(current.getpressure_in()).append(" in)").append("\n");
        builder.append("Humidity: ").append(current.getHumidity()).append("%").append("\n");

        return builder.toString();
    }

    public String getForecastInfo() {
        List<Forecastday> forecastdayList = getForecast().getForecastday();
        StringBuilder builder = new StringBuilder();
        for (int x = 0; x < forecastdayList.size(); x++) {
            builder.append(forecastdayList.get(x).getDate() + " : ").append(forecastdayList.get(x).getDay().getAvgtemp_c() + " °C").append("\n");
        }
        return builder.toString();
    }
}

class air_quality {

    private Double co;
    private Double no2;
    private Double o3;
    private Double so2;
    private Double pm25;
    private Double pm10;
    private Integer usEpaIndex;
    private Integer gbDefraIndex;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getNo2() {
        return no2;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    public Double getO3() {
        return o3;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getPm25() {
        return pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Integer getUsEpaIndex() {
        return usEpaIndex;
    }

    public void setUsEpaIndex(Integer usEpaIndex) {
        this.usEpaIndex = usEpaIndex;
    }

    public Integer getGbDefraIndex() {
        return gbDefraIndex;
    }

    public void setGbDefraIndex(Integer gbDefraIndex) {
        this.gbDefraIndex = gbDefraIndex;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


class Astro {

    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String moon_phase;
    private Integer moon_illumination;
    private Integer is_moon_up;
    private Integer is_sun_up;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    public String getMoonset() {
        return moonset;
    }

    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    public String getmoon_phase() {
        return moon_phase;
    }

    public void setmoon_phase(String moon_phase) {
        this.moon_phase = moon_phase;
    }

    public Integer getmoon_illumination() {
        return moon_illumination;
    }

    public void setmoon_illumination(Integer moon_illumination) {
        this.moon_illumination = moon_illumination;
    }

    public Integer getis_moon_up() {
        return is_moon_up;
    }

    public void setis_moon_up(Integer is_moon_up) {
        this.is_moon_up = is_moon_up;
    }

    public Integer getis_sun_up() {
        return is_sun_up;
    }

    public void setis_sun_up(Integer is_sun_up) {
        this.is_sun_up = is_sun_up;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@Generated("jsonschema2pojo")
class Condition {

    private String text;
    private String icon;
    private Integer code;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


class Current {

    private Integer last_updated_epoch;
    private String last_updated;
    private Double temp_c;
    private Double temp_f;
    private Integer is_day;
    private Condition condition;
    private Double wind_mph;
    private Double wind_kph;
    private Integer wind_degree;
    private String wind_dir;
    private Double pressure_mb;
    private Double pressure_in;
    private Double precip_mm;
    private Double precip_in;
    private Integer humidity;
    private Integer cloud;
    private Double feelslike_c;
    private Double feelslike_f;
    private Double vis_km;
    private Double vis_miles;
    private Double uv;
    private Double gust_mph;
    private Double gust_kph;
    private air_quality air_quality;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Integer getlast_updated_epoch() {
        return last_updated_epoch;
    }

    public void setlast_updated_epoch(Integer last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public String getlast_updated() {
        return last_updated;
    }

    public void setlast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public Double gettemp_c() {
        return temp_c;
    }

    public void settemp_c(Double temp_c) {
        this.temp_c = temp_c;
    }

    public Double gettemp_f() {
        return temp_f;
    }

    public void settemp_f(Double temp_f) {
        this.temp_f = temp_f;
    }

    public Integer getis_day() {
        return is_day;
    }

    public void setis_day(Integer is_day) {
        this.is_day = is_day;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Double getwind_mph() {
        return wind_mph;
    }

    public void setwind_mph(Double wind_mph) {
        this.wind_mph = wind_mph;
    }

    public Double getwind_kph() {
        return wind_kph;
    }

    public void setwind_kph(Double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public Integer getwind_degree() {
        return wind_degree;
    }

    public void setwind_degree(Integer wind_degree) {
        this.wind_degree = wind_degree;
    }

    public String getwind_dir() {
        return wind_dir;
    }

    public void setwind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public Double getpressure_mb() {
        return pressure_mb;
    }

    public void setpressure_mb(Double pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public Double getpressure_in() {
        return pressure_in;
    }

    public void setpressure_in(Double pressure_in) {
        this.pressure_in = pressure_in;
    }

    public Double getprecip_mm() {
        return precip_mm;
    }

    public void setprecip_mm(Double precip_mm) {
        this.precip_mm = precip_mm;
    }

    public Double getprecip_in() {
        return precip_in;
    }

    public void setprecip_in(Double precip_in) {
        this.precip_in = precip_in;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCloud() {
        return cloud;
    }

    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    public Double getfeelslike_c() {
        return feelslike_c;
    }

    public void setfeelslike_c(Double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public Double getfeelslike_f() {
        return feelslike_f;
    }

    public void setfeelslike_f(Double feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public Double getvis_km() {
        return vis_km;
    }

    public void setvis_km(Double vis_km) {
        this.vis_km = vis_km;
    }

    public Double getvis_miles() {
        return vis_miles;
    }

    public void setvis_miles(Double vis_miles) {
        this.vis_miles = vis_miles;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public Double getgust_mph() {
        return gust_mph;
    }

    public void setgust_mph(Double gust_mph) {
        this.gust_mph = gust_mph;
    }

    public Double getgust_kph() {
        return gust_kph;
    }

    public void setgust_kph(Double gust_kph) {
        this.gust_kph = gust_kph;
    }

    public air_quality getair_quality() {
        return air_quality;
    }

    public void setair_quality(air_quality air_quality) {
        this.air_quality = air_quality;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@Generated("jsonschema2pojo")
class Day {

    private Double maxtemp_c;
    private Double maxtemp_f;
    private Double mintemp_c;
    private Double mintemp_f;
    private Double avgtemp_c;
    private Double avgtemp_f;
    private Double maxwind_mph;
    private Double maxwind_kph;
    private Double totalprecip_mm;
    private Double totalprecip_in;
    private Double totalsnow_cm;
    private Double avgvis_km;
    private Double avgvis_miles;
    private Integer avghumidity;
    private Integer daily_will_it_rain;
    private Integer daily_chance_of_rain;
    private Integer daily_will_it_snow;
    private Integer daily_chance_of_snow;
    private Condition condition;
    private Double uv;
    private air_quality air_quality;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Double getMaxtemp_c() {
        return maxtemp_c;
    }

    public void setMaxtemp_c(Double maxtemp_c) {
        this.maxtemp_c = maxtemp_c;
    }

    public Double getMaxtemp_f() {
        return maxtemp_f;
    }

    public void setMaxtemp_f(Double maxtemp_f) {
        this.maxtemp_f = maxtemp_f;
    }

    public Double getMintemp_c() {
        return mintemp_c;
    }

    public void setMintemp_c(Double mintemp_c) {
        this.mintemp_c = mintemp_c;
    }

    public Double getMintemp_f() {
        return mintemp_f;
    }

    public void setMintemp_f(Double mintemp_f) {
        this.mintemp_f = mintemp_f;
    }

    public Double getAvgtemp_c() {
        return avgtemp_c;
    }

    public void setAvgtemp_c(Double avgtemp_c) {
        this.avgtemp_c = avgtemp_c;
    }

    public Double getAvgtemp_f() {
        return avgtemp_f;
    }

    public void setAvgtemp_f(Double avgtemp_f) {
        this.avgtemp_f = avgtemp_f;
    }

    public Double getMaxwind_mph() {
        return maxwind_mph;
    }

    public void setMaxwind_mph(Double maxwind_mph) {
        this.maxwind_mph = maxwind_mph;
    }

    public Double getMaxwind_kph() {
        return maxwind_kph;
    }

    public void setMaxwind_kph(Double maxwind_kph) {
        this.maxwind_kph = maxwind_kph;
    }

    public Double getTotalprecip_mm() {
        return totalprecip_mm;
    }

    public void setTotalprecip_mm(Double totalprecip_mm) {
        this.totalprecip_mm = totalprecip_mm;
    }

    public Double getTotalprecip_in() {
        return totalprecip_in;
    }

    public void setTotalprecip_in(Double totalprecip_in) {
        this.totalprecip_in = totalprecip_in;
    }

    public Double gettotalsnow_cm() {
        return totalsnow_cm;
    }

    public void settotalsnow_cm(Double totalsnow_cm) {
        this.totalsnow_cm = totalsnow_cm;
    }

    public Double getAvgvis_km() {
        return avgvis_km;
    }

    public void setAvgvis_km(Double avgvis_km) {
        this.avgvis_km = avgvis_km;
    }

    public Double getAvgvis_miles() {
        return avgvis_miles;
    }

    public void setAvgvis_miles(Double avgvis_miles) {
        this.avgvis_miles = avgvis_miles;
    }

    public Integer getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(Integer avghumidity) {
        this.avghumidity = avghumidity;
    }

    public Integer getdaily_will_it_rain() {
        return daily_will_it_rain;
    }

    public void setdaily_will_it_rain(Integer daily_will_it_rain) {
        this.daily_will_it_rain = daily_will_it_rain;
    }

    public Integer getdaily_chance_of_rain() {
        return daily_chance_of_rain;
    }

    public void setdaily_chance_of_rain(Integer daily_chance_of_rain) {
        this.daily_chance_of_rain = daily_chance_of_rain;
    }

    public Integer getdaily_will_it_snow() {
        return daily_will_it_snow;
    }

    public void setdaily_will_it_snow(Integer daily_will_it_snow) {
        this.daily_will_it_snow = daily_will_it_snow;
    }

    public Integer getdaily_chance_of_snow() {
        return daily_chance_of_snow;
    }

    public void setdaily_chance_of_snow(Integer daily_chance_of_snow) {
        this.daily_chance_of_snow = daily_chance_of_snow;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public air_quality getair_quality() {
        return air_quality;
    }

    public void setair_quality(air_quality air_quality) {
        this.air_quality = air_quality;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@Generated("jsonschema2pojo")
class Forecast {

    private List<Forecastday> forecastday;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();


    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@Generated("jsonschema2pojo")
class Forecastday {

    private String date;
    private Integer date_epoch;
    private Day day;
    private Astro astro;
    private List<Hour> hour;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getdate_epoch() {
        return date_epoch;
    }

    public void setdate_epoch(Integer date_epoch) {
        this.date_epoch = date_epoch;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public List<Hour> getHour() {
        return hour;
    }

    public void setHour(List<Hour> hour) {
        this.hour = hour;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@Generated("jsonschema2pojo")
class Hour {

    private Integer time_epoch;
    private String time;
    private Double temp_c;
    private Double temp_f;
    private Integer is_day;
    private Condition condition;
    private Double wind_mph;
    private Double wind_kph;
    private Integer wind_degree;
    private String wind_dir;
    private Double pressure_mb;
    private Double pressure_in;
    private Double precip_mm;
    private Double precip_in;
    private Double snow_cm;
    private Integer humidity;
    private Integer cloud;
    private Double feelslike_c;
    private Double feelslike_f;
    private Double windchill_c;
    private Double windchill_f;
    private Double heatindex_c;
    private Double heatindex_f;
    private Double dewpoint_c;
    private Double dewpoint_f;
    private Integer will_it_rain;
    private Integer chance_of_rain;
    private Integer will_it_snow;
    private Integer chance_of_snow;
    private Double vis_km;
    private Double vis_miles;
    private Double gust_mph;
    private Double gust_kph;
    private Double uv;
    private air_quality air_quality;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public Integer gettime_epoch() {
        return time_epoch;
    }

    public void settime_epoch(Integer time_epoch) {
        this.time_epoch = time_epoch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double gettemp_c() {
        return temp_c;
    }

    public void settemp_c(Double temp_c) {
        this.temp_c = temp_c;
    }

    public Double gettemp_f() {
        return temp_f;
    }

    public void settemp_f(Double temp_f) {
        this.temp_f = temp_f;
    }

    public Integer getis_day() {
        return is_day;
    }

    public void setis_day(Integer is_day) {
        this.is_day = is_day;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Double getwind_mph() {
        return wind_mph;
    }

    public void setwind_mph(Double wind_mph) {
        this.wind_mph = wind_mph;
    }

    public Double getwind_kph() {
        return wind_kph;
    }

    public void setwind_kph(Double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public Integer getwind_degree() {
        return wind_degree;
    }

    public void setwind_degree(Integer wind_degree) {
        this.wind_degree = wind_degree;
    }

    public String getwind_dir() {
        return wind_dir;
    }

    public void setwind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public Double getpressure_mb() {
        return pressure_mb;
    }

    public void setpressure_mb(Double pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public Double getpressure_in() {
        return pressure_in;
    }

    public void setpressure_in(Double pressure_in) {
        this.pressure_in = pressure_in;
    }

    public Double getprecip_mm() {
        return precip_mm;
    }

    public void setprecip_mm(Double precip_mm) {
        this.precip_mm = precip_mm;
    }

    public Double getprecip_in() {
        return precip_in;
    }

    public void setprecip_in(Double precip_in) {
        this.precip_in = precip_in;
    }

    public Double getsnow_cm() {
        return snow_cm;
    }

    public void setsnow_cm(Double snow_cm) {
        this.snow_cm = snow_cm;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCloud() {
        return cloud;
    }

    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    public Double getfeelslike_c() {
        return feelslike_c;
    }

    public void setfeelslike_c(Double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public Double getfeelslike_f() {
        return feelslike_f;
    }

    public void setfeelslike_f(Double feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public Double getwindchill_c() {
        return windchill_c;
    }

    public void setwindchill_c(Double windchill_c) {
        this.windchill_c = windchill_c;
    }

    public Double getwindchill_f() {
        return windchill_f;
    }

    public void setwindchill_f(Double windchill_f) {
        this.windchill_f = windchill_f;
    }

    public Double getheatindex_c() {
        return heatindex_c;
    }

    public void setheatindex_c(Double heatindex_c) {
        this.heatindex_c = heatindex_c;
    }

    public Double getheatindex_f() {
        return heatindex_f;
    }

    public void setheatindex_f(Double heatindex_f) {
        this.heatindex_f = heatindex_f;
    }

    public Double getdewpoint_c() {
        return dewpoint_c;
    }

    public void setdewpoint_c(Double dewpoint_c) {
        this.dewpoint_c = dewpoint_c;
    }

    public Double getdewpoint_f() {
        return dewpoint_f;
    }

    public void setdewpoint_f(Double dewpoint_f) {
        this.dewpoint_f = dewpoint_f;
    }

    public Integer getwill_it_rain() {
        return will_it_rain;
    }

    public void setwill_it_rain(Integer will_it_rain) {
        this.will_it_rain = will_it_rain;
    }

    public Integer getchance_of_rain() {
        return chance_of_rain;
    }

    public void setchance_of_rain(Integer chance_of_rain) {
        this.chance_of_rain = chance_of_rain;
    }

    public Integer getwill_it_snow() {
        return will_it_snow;
    }

    public void setwill_it_snow(Integer will_it_snow) {
        this.will_it_snow = will_it_snow;
    }

    public Integer getchance_of_snow() {
        return chance_of_snow;
    }

    public void setchance_of_snow(Integer chance_of_snow) {
        this.chance_of_snow = chance_of_snow;
    }

    public Double getvis_km() {
        return vis_km;
    }

    public void setvis_km(Double vis_km) {
        this.vis_km = vis_km;
    }

    public Double getvis_miles() {
        return vis_miles;
    }

    public void setvis_miles(Double vis_miles) {
        this.vis_miles = vis_miles;
    }

    public Double getgust_mph() {
        return gust_mph;
    }

    public void setgust_mph(Double gust_mph) {
        this.gust_mph = gust_mph;
    }

    public Double getgust_kph() {
        return gust_kph;
    }

    public void setgust_kph(Double gust_kph) {
        this.gust_kph = gust_kph;
    }

    public Double getUv() {
        return uv;
    }

    public void setUv(Double uv) {
        this.uv = uv;
    }

    public air_quality getair_quality() {
        return air_quality;
    }

    public void setair_quality(air_quality air_quality) {
        this.air_quality = air_quality;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@Generated("jsonschema2pojo")
class Location {

    private String name;
    private String region;
    private String country;
    private Double lat;
    private Double lon;
    private String tzId;
    private Integer localtime_epoch;
    private String localtime;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getTzId() {
        return tzId;
    }

    public void setTzId(String tzId) {
        this.tzId = tzId;
    }

    public Integer getLocaltime_epoch() {
        return localtime_epoch;
    }

    public void setLocaltime_epoch(Integer localtime_epoch) {
        this.localtime_epoch = localtime_epoch;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}



