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

  @JsonProperty("Driector")
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

  public String getTitle() {
    return title;
  }

  public String getYear() {
    return year;
  }

  public String getRated() {
    return rated;
  }

  public String getReleased() {
    return released;
  }

  public String getRuntime() {
    return runtime;
  }

  public String getGenre() {
    return genre;
  }

  public String getDirector() {
    return director;
  }

  public String getWriter() {
    return writer;
  }

  public String getActors() {
    return actors;
  }

  public String getPlot() {
    return plot;
  }

  public String getLanguage() {
    return language;
  }

  public String getCountry() {
    return country;
  }

  public String getAwards() {
    return awards;
  }

  public String getPoster() {
    return poster;
  }

  public List<RatingDto> getRatings() {
    return ratings;
  }

  public String getMetascore() {
    return metascore;
  }

  public BigDecimal getImdbRating() {
    return imdbRating;
  }

  public String getImdbVotes() {
    return imdbVotes;
  }

  public String getImdbId() {
    return imdbId;
  }

  public String getType() {
    return type;
  }

  public String getDvd() {
    return dvd;
  }

  public String getBoxOffice() {
    return boxOffice;
  }

  public String getProduction() {
    return production;
  }

  public String getWebsite() {
    return website;
  }

  public Boolean getResponse() {
    return response;
  }
}