package com.thoughtworks.movierental;

import org.junit.Test;

import static com.thoughtworks.movierental.Movie.CHILDRENS;
import static com.thoughtworks.movierental.Movie.NEW_RELEASE;
import static com.thoughtworks.movierental.Movie.REGULAR;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RentalTest {
  @Test
  public void shouldValidateAmountWithNewReleaseMovie() {
    Rental newRental = new Rental(new Movie("ABC", NEW_RELEASE), 3);
    assertThat(newRental.amount(), is(9.0));
  }
  @Test
  public void shouldValidateAmountWithRegularMovie() {
    Rental newRental = new Rental(new Movie("ABC", REGULAR), 3);
    assertThat(newRental.amount(), is(3.5));
  }
  @Test
  public void shouldValidateAmountWithChildrenMovie() {
    Rental newRental = new Rental(new Movie("ABC", CHILDRENS), 3);
    assertThat(newRental.amount(), is(1.5));
  }
  @Test
  public void shouldCalculateFrequentRenterPointsWithNewReleaseMovieRentedForMoreThan1Day() {
    Rental newRental = new Rental(new Movie("ABC", NEW_RELEASE), 3);
    assertThat(newRental.frequentRenterPoints(), is(2));
  }
  @Test
  public void shouldCalculateFrequentRenterPointsWithNewReleaseMovieRentedFor1Day() {
    Rental newRental = new Rental(new Movie("ABC", NEW_RELEASE), 1);
    assertThat(newRental.frequentRenterPoints(), is(1));
  }
  @Test
  public void shouldCalculateFrequentRenterPointsWithRegularMovie() {
    Rental newRental = new Rental(new Movie("ABC", REGULAR), 3);
    assertThat(newRental.frequentRenterPoints(), is(1));
  }
  @Test
  public void shouldCalculateFrequentRenterPointsWithChildrenMovie() {
    Rental newRental = new Rental(new Movie("ABC", CHILDRENS), 3);
    assertThat(newRental.frequentRenterPoints(), is(1));
  }
  //edge cases
}