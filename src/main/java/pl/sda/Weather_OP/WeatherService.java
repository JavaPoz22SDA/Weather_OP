package pl.sda.Weather_OP;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherService {
    private String finalURL;
    private ObjectMapper mapper = new ObjectMapper();
    public WeatherService(String url, String key) {

        finalURL=url+ "?access_key=" +key;
    }
    public Weather getCityWeather(String city) throws IOException {
        finalURL = finalURL + "&query=" + city;
        return mapper.readValue(new URL(finalURL), Weather.class);
    }
}
