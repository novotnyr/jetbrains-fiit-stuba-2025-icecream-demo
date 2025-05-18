package com.jetbrains.icecream;

public class OpenMeteoResponse {
    public Current current;

    public static class Current {
        public double temperature_2m;
        public double wind_speed_10m;
    }
}