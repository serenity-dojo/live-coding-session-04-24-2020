package serenitylabs.tutorials.vetclinic.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ACustomer {
    public static Customer fromGermany() {
        return new Customer("1234567","Herman","The German",
                "DE",
                "1 main street, Berlin",
                LocalDate.of(1980,6,10),
                new ArrayList<>());
    }

    public static ACustomer who() {
        return new ACustomer();
    }

    Country country;
    List<String> purchases = new ArrayList<>();

    public ACustomer isFrom(Country countryCode) {
        country = countryCode;
        return this;
    }

    public ACustomer hasPurchased(String item) {
        purchases.add(item);
        return this;
    }

    public Customer build() {
        return new Customer("1234567","Herman","The German",
                country.getCountryCode(),
                "1 main street, Berlin",
                LocalDate.of(1980,6,10),
                purchases);
    }
}
