package serenitylabs.tutorials.vetclinic.model;

public enum Country {
    UK("UK"), USA("USA"), Germany("DE"), France("FR");

    private String countryCode;

    Country(String countryCode) {

        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
