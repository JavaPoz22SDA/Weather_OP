package pl.sda.Weather_OP;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;
import java.util.Scanner;

public class GetWeather {
    public static  void main(String[] args) throws IOException {

         String  KEY_API="fa46382e8f2367be6182d405ed06c3e7";
        WeatherService weatherService = new WeatherService(
                "http://api.weatherstack.com/current",KEY_API);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj miasto:");
        String city = scanner.nextLine();
       Object weather = weatherService.getCityWeather(city);

        if(weather instanceof Weather){ // sprawdza czy ten object jest w instancji
        System.out.println("Temperatura w " + ((Weather) weather).getLocation().getName() + // rzutowanie
                " wynosi: " +((Weather) weather).getCurrent().getTemperature());

    } else if (weather instanceof ErrorWeatherException ) {
           System.out.println("INSTANCJA KLASY ERROR");
            System.out.println(((ErrorWeatherException) weather).getError().getInfo());
       }
}}

