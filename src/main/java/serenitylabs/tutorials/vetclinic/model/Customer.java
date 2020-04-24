package serenitylabs.tutorials.vetclinic.model;

import java.time.LocalDate;
import java.util.List;

public class Customer {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String country;
    private final String address;
    private final LocalDate dateOfBirth;
    private final List<String> purchases;

    public Customer(String id,
                    String firstName,
                    String lastName,
                    String country,
                    String address,
                    LocalDate dateOfBirth,
                    List<String> purchases) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.purchases = purchases;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public List<String> getPurchases() {
        return purchases;
    }
}
