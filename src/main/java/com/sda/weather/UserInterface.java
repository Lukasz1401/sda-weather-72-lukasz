package com.sda.weather;

import java.util.Scanner;

public class UserInterface {

    private LocationController locationController;

    public UserInterface(LocationController locationController) {
        this.locationController = locationController;
    }

    public void runApplication() {
        System.out.println("Aplikacja jest uruchomiona");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Jesteś w aplikacji pogodowej, wybierz co chcesz zrobić?");
            System.out.println("1. Dodaj lokalizację do bazy danych");
            System.out.println("2. Wyświetl dodane lokalizacje");
            System.out.println("3. Pobierz wartości pogodowe");
            System.out.println("0. Zamknij aplikację");

            int actionNumber = scanner.nextInt();

            switch (actionNumber) {
                case 1:
                    addLocation();
                    break;
                case 0:
                    return;

            }
        }
    }

    private void addLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz nazwę miasta:");
        String city = scanner.nextLine();
        System.out.println("Podaj szerokość geograficzną:");
        Integer latitude = scanner.nextInt();
        System.out.println("Podaj długość geograficzną:");
        Integer longitude = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wpisz region:");
        String region = scanner.nextLine();
        System.out.println("Wpisz kraj:");
        String country = scanner.nextLine();
        String response = locationController.addNewLocation(city, latitude, longitude, region, country);
        System.out.println("Nowa lokalizacja została dodoana do bazy danych: " + response);

    }
}
