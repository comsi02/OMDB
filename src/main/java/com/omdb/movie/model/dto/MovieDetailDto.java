package com.omdb.movie.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MovieDetailDto {

  @JsonProperty("Title")
  String title;

  @JsonProperty("Year")
  String year;

  @JsonProperty("Rated")
  String rated;

  @JsonProperty("Released")
  String released;

  @JsonProperty("Runtime")
  String runtime;

  @JsonProperty("Genre")
  String genre;

  @JsonProperty("Director")
  String director;

  @JsonProperty("Writer")
  String writer;

  @JsonProperty("Actors")
  String actors;

  @JsonProperty("Plot")
  String plot;

  @JsonProperty("Language")
  String language;

  @JsonProperty("Country")
  String country;

  @JsonProperty("Awards")
  String awards;

  @JsonProperty("Poster")
  String poster;

  @JsonProperty("Ratings")
  List<RatingDto> ratings;

  @JsonProperty("Metascore")
  String metascore;

  @JsonProperty("imdbRating")
  BigDecimal imdbRating;

  @JsonProperty("imdbVotes")
  String imdbVotes;

  @JsonProperty("imdbID")
  String imdbId;

  @JsonProperty("Type")
  String type;

  @JsonProperty("DVD")
  String dvd;

  @JsonProperty("BoxOffice")
  String boxOffice;

  @JsonProperty("Production")
  String production;

  @JsonProperty("Website")
  String website;

  @JsonProperty("Response")
  Boolean response;
}