package com.omdb.movie.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MovieBriefDto {

  @JsonProperty("Title")
  String title;

  @JsonProperty("Year")
  String year;

  @JsonProperty("imdbID")
  String imdbId;

  @JsonProperty("Type")
  String type;

  @JsonProperty("Poster")
  String poster;

  public String getTitle() {
    return title;
  }

  public String getYear() {
    return year;
  }

  public String getImdbId() {
    return imdbId;
  }

  public String getType() {
    return type;
  }

  public String getPoster() {
    return poster;
  }
}