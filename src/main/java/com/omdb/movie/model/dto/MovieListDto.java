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
  
  @JsonProperty("mSearch")
  String mSearch;

  @JsonProperty("mPage")
  int mPage;
}