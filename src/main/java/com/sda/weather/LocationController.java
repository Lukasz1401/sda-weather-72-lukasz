package com.sda.weather;

public class LocationController { // todo rename to LocationController

    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    public String addNewLocation(String city, Integer latitude, Integer longitude, String region, String country) {
        Location newLocation = locationService.createNewLocation(city, latitude, longitude, region, country);
        return String.format("{\"id\": %s, \"city\": \"%s\", \"latitude\": \"%s\", \"longitude\": \"%s\", \"region\": \"%s\", \"country\": \"%s\"}",
              newLocation.getId(), newLocation.getCity(), newLocation.getLatitude(), newLocation.getLongitude(), newLocation.getRegion(), newLocation.getCountry());
    }
}
