package com.sda.weather;

public class EntryService {


    public Entry createNewEntry(String city, Integer latitude, Integer longitude, String region, String country) {
        if (city == null) {
            throw new RuntimeException("City is required");
        }
        if (latitude < -90 || latitude > 90) {
            throw new RuntimeException("Latitude must be in range of - 90 to 90");
        }
        if (longitudeude < -90 || latitude > 90) {
            throw new RuntimeException("Latitude must be in range of - 180 to 180");
        }

    }
}
