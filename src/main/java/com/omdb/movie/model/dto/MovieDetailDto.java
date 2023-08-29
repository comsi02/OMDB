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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getRated() {
    return rated;
  }

  public void setRated(String rated) {
    this.rated = rated;
  }

  public String getReleased() {
    return released;
  }

  public void setReleased(String released) {
    this.released = released;
  }

  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public String getActors() {
    return actors;
  }

  public void setActors(String actors) {
    this.actors = actors;
  }

  public String getPlot() {
    return plot;
  }

  public void setPlot(String plot) {
    this.plot = plot;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getAwards() {
    return awards;
  }

  public void setAwards(String awards) {
    this.awards = awards;
  }

  public String getPoster() {
    return poster;
  }

  public void setPoster(String poster) {
    this.poster = poster;
  }

  public List<RatingDto> getRatings() {
    return ratings;
  }

  public void setRatings(List<RatingDto> ratings) {
    this.ratings = ratings;
  }

  public String getMetascore() {
    return metascore;
  }

  public void setMetascore(String metascore) {
    this.metascore = metascore;
  }

  public BigDecimal getImdbRating() {
    return imdbRating;
  }

  public void setImdbRating(BigDecimal imdbRating) {
    this.imdbRating = imdbRating;
  }

  public String getImdbVotes() {
    return imdbVotes;
  }

  public void setImdbVotes(String imdbVotes) {
    this.imdbVotes = imdbVotes;
  }

  public String getImdbId() {
    return imdbId;
  }

  public void setImdbId(String imdbId) {
    this.imdbId = imdbId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDvd() {
    return dvd;
  }

  public void setDvd(String dvd) {
    this.dvd = dvd;
  }

  public String getBoxOffice() {
    return boxOffice;
  }

  public void setBoxOffice(String boxOffice) {
    this.boxOffice = boxOffice;
  }

  public String getProduction() {
    return production;
  }

  public void setProduction(String production) {
    this.production = production;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Boolean getResponse() {
    return response;
  }

  public void setResponse(Boolean response) {
    this.response = response;
  }
}