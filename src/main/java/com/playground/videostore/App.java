package com.playground.videostore;

import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Movie starWars = new Movie("Star Wars", Movie.REGULAR);
        Movie kingOfLions = new Movie("King of Lions", Movie.CHILDRENS);
        Movie jamesBond = new Movie("James Bond", Movie.NEW_RELEASE);

        Customer john = new Customer("John");

        Rental rentalOfStarWars = new Rental(starWars, 2);
        Rental rentalOfKingOfLion = new Rental(kingOfLions, 5);
        Rental rentalOfJamesBond = new Rental(jamesBond, 4);

        john.addRental(rentalOfStarWars);
        john.addRental(rentalOfKingOfLion);
        john.addRental(rentalOfJamesBond);

        LOGGER.info(john.statement());
    }
}
