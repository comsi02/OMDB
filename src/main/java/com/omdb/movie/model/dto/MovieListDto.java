package com.omdb.movie.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MovieListDto {

  @JsonProperty("Search")
  List<MovieBriefDto> search;

  @JsonProperty("totalResults")
  int totalResults;

  @JsonProperty("Response")
  Boolean response;

  public List<MovieBriefDto> getSearch() {
    return search;
  }

  public int getTotalResults() {
    return totalResults;
  }

  public Boolean getResponse() {
    return response;
  }
}