package com.sda.weather;

public class EntryController { // todo rename to LocationController

    private EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    public String addLocation(String city, Integer latitude, Integer longitude, String region, String country) {
        Entry newEntry = entryService.createNewEntry(city, latitude, longitude, region, country);
        return null;
    }
}
