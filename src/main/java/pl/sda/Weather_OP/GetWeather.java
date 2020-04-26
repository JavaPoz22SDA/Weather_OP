package pl.sda.Weather_OP;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class GetWeather {
    public static  void main(String[] args) throws IOException {
         String  KEY_API="fa46382e8f2367be6182d405ed06c3e7";
        WeatherService weatherService = new WeatherService(
                "http://api.weatherstack.com/current",KEY_API);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj miasto:");
        String city = scanner.nextLine();
        Weather weather = weatherService.getCityWeather(city);

        System.out.println("Temperatura w " + weather.getLocation().getName() +
                " wynosi: " +weather.getCurrent().getTemperature());

    }
}
