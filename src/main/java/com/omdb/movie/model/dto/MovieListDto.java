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

  @JsonProperty("paramSearch")
  String paramSearch;

  @JsonProperty("paramPage")
  int paramPage;

  public List<MovieBriefDto> getSearch() {
    return search;
  }

  public void setSearch(List<MovieBriefDto> search) {
    this.search = search;
  }

  public int getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(int totalResults) {
    this.totalResults = totalResults;
  }

  public Boolean getResponse() {
    return response;
  }

  public void setResponse(Boolean response) {
    this.response = response;
  }

  public String getParamSearch() {
    return paramSearch;
  }

  public void setParamSearch(String mSearch) {
    this.paramSearch = mSearch;
  }

  public int getParamPage() {
    return paramPage;
  }

  public void setParamPage(int mPage) {
    this.paramPage = mPage;
  }
}