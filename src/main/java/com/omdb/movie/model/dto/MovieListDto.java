package com.omdb.movie.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MovieListDto {

	@JsonProperty("Search")
	List<MovieDetailDto> search;

	String totalResults;

	@JsonProperty("Response")
	String Response;

	public List<MovieDetailDto> getSearch() {
		return search;
	}

	public String getTotalResults() {
		return totalResults;
	}

	public String getResponse() {
		return Response;
	}
}