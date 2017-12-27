package com.thoughtworks.movierental;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {
    @Test
    public void shouldGenerateStatement(){
        Customer customer = new Customer("Customer Name");
        Rental regular = new Rental(new Movie("Hello brother", Movie.REGULAR), 4);
        Rental newRelease = new Rental(new Movie("Thor", Movie.NEW_RELEASE), 4);
        Rental childrens = new Rental(new Movie("Home alone", Movie.CHILDRENS), 4);
        customer.addRental(regular);
        customer.addRental(newRelease);
        customer.addRental(childrens);

        String statement = customer.statement();

        assertThat(statement, is("Rental Record for Customer Name\n" +
            "\tHello brother\t5.0\n" +
            "\tThor\t12.0\n" +
            "\tHome alone\t3.0\n" +
            "Amount owed is 20.0\n" +
            "You earned 4 frequent renter points"));
    }

}