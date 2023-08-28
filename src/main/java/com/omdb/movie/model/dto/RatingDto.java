package com.omdb.movie.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RatingDto {

  @JsonProperty("Source")
  String source;

  @JsonProperty("Value")
  String value;
}
