package pl.sda.Weather_OP;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        //Request request = new Request("city", "Poznan");
       // Location location = new Location("Poznan", "Poland");
       // Weather weather = new Weather(23.5, "Poznan", request, location);

       // mapper.writeValue(new File("data.json"), weather);

       // Weather readWeather = mapper.readValue(new File("data.json"), Weather.class);
       // System.out.println(readWeather.getRequest().getType());
       // System.out.println(readWeather.getCity());
       // System.out.println(readWeather.getTemperature());





    }
}
