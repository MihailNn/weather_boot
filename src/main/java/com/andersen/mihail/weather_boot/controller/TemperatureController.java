package com.andersen.mihail.weather_boot.controller;

import com.andersen.mihail.weather_boot.entity.City;
import com.andersen.mihail.weather_boot.entity.Weather;
import com.andersen.mihail.weather_boot.service.TemperatureResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {
    @Autowired
    private final TemperatureResolver temperatureResolver;

    public TemperatureController(TemperatureResolver temperatureResolver) {
        this.temperatureResolver = temperatureResolver;
    }

//    @PostMapping(value = "/temp", produces = {MediaType.APPLICATION_JSON_VALUE})
    @PostMapping("/temp")
    public Weather temperatureHandler(@RequestBody City city) {

        return temperatureResolver.getTemperature(city);
    }
}
