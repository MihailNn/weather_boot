package com.andersen.mihail.weather_boot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Weather {
    private AddMain main;


    @Getter
    @Setter
    @NoArgsConstructor
    public static class AddMain {
        private String temp;
    }
}
