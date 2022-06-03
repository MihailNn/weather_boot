package com.andersen.mihail.weather_boot.service;

import com.andersen.mihail.weather_boot.entity.City;
import com.andersen.mihail.weather_boot.entity.Weather;
import com.andersen.mihail.weather_boot.entity.WeatherDuplicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TemperatureResolver {
    @Autowired
    RestTemplate restTemplate;
    @Value("${constant.server.api.url}")
    String apiUrl;

    public WeatherDuplicate getTemperature(City city){
        String url = apiUrl + city.getRegion();
        //invoke the API and get the response as JSON string
        Weather weather =restTemplate.getForObject(url, Weather.class);

        assert weather != null;
        return new WeatherDuplicate(weather.getMain().getTemp());
    }
}
