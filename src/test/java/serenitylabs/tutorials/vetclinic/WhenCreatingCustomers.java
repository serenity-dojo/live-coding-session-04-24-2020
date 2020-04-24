package serenitylabs.tutorials.vetclinic;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.model.ACustomer;
import serenitylabs.tutorials.vetclinic.model.Country;
import serenitylabs.tutorials.vetclinic.model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static serenitylabs.tutorials.vetclinic.model.Country.Germany;

public class WhenCreatingCustomers {

    @Test
    public void createACustomerFromGermany() {

        Customer herman = ACustomer.who()
                                   .isFrom(Germany)
                                   .hasPurchased("Clean Coding")
                                   .hasPurchased("Refactoring Patterns")
                                   .build();

        // ... do something with the customer

        // ... check that the customer is handle correctly

        assertThat(herman.getCountry()).isEqualTo("DE");
        assertThat(herman.getPurchases()).contains("Clean Coding", "Refactoring Patterns");
    }
}
