package com.andersen.mihail.weather_boot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
//@AllArgsConstructor
@Data
public class Weather {
//    private String temp;
    private AddMain main;

//    public Weather(String temp) {
//        this.temp = temp;
//    }

    public String getTemp() {

       return this.main.temp;
    }

//    public void setTemp(String temp) {
//        this.temp = temp;
//    }
    @Getter
//    @Setter
    @NoArgsConstructor
    class AddMain {
        private String temp;
    }
}
