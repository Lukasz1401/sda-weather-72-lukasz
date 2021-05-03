package com.sda.weather;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LocationService {

    private LocationRepository locationRepository;
    private ObjectMapper objectMapper;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // todo rename to createLocation
    public Location createNewLocation(String city, Integer latitude, Integer longitude, String region, String country) {
        if (city == null) {
            throw new RuntimeException("City is required");
        }
        if (latitude < -90 || latitude > 90) {
            throw new RuntimeException("Latitude must be in range of - 90 to 90");
        }
        if (longitude < -180 || longitude > 180) {
            throw new RuntimeException("Longitude must be in range of - 180 to 180");
        }
        if (city == null) {
            throw new RuntimeException("City is required");
        }

        Location location = new Location(null, city, latitude, longitude, region, country);
        Location savedLocation = locationRepository.save(location);

        return savedLocation;
    }


}

