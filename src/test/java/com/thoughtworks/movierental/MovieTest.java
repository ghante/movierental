package com.thoughtworks.movierental;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
  @Test
  public void shouldReturnTrueIfTheMovieIsNewRelease() {
      Movie newReleaseMovie = new Movie("ABCD", Movie.NEW_RELEASE);
      assertTrue(newReleaseMovie.isNewRelease());
  }

  @Test
  public void shouldReturnFalseIfTheMovieIsNotANewRelease() {
    Movie newReleaseMovie = new Movie("ABCD", Movie.REGULAR);
    assertFalse(newReleaseMovie.isNewRelease());
  }
}