package pl.sda.Weather_OP;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherService {
    private String finalURL;
    private ObjectMapper mapper = new ObjectMapper();
    public WeatherService(String url, String key) {

        finalURL=url+ "?access_key=" +key;
    }
    public Object getCityWeather(String city) throws IOException {
        finalURL = finalURL + "&query=" + city.replace(" ", "%20");
        try {
            return mapper.readValue(new URL(finalURL), Weather.class); // bere do sebe url, a wertaje nam weather
        } catch (UnrecognizedPropertyException e) {
            return mapper.readValue(new URL(finalURL), ErrorWeatherException.class); // bere do sebe url , a wertaje nam error
        }
    }
}
