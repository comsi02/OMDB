package com.omdb.movie.service.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.omdb.movie.model.dto.MovieDetailDto;
import com.omdb.movie.model.dto.MovieListDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OmdbApiService {

  @Autowired
  WebClient omdbWebClient;

  @Value("${app.config.omdb.api-scheme}")
  String omdbApiScheme;

  @Value("${app.config.omdb.api-host}")
  String omdbApiHost;

  @Value("${app.config.omdb.api-key}")
  String omdbApiKey;

  public MovieListDto getMovieList(String search, int page) {
    ResponseEntity<MovieListDto> responseMovieListDto = omdbWebClient.get()
        .uri(uriBuilder -> uriBuilder.scheme("http").host(omdbApiHost).queryParam("apikey", omdbApiKey)
            .queryParam("s", search).queryParam("page", page).build())
        .accept(MediaType.APPLICATION_JSON).retrieve().toEntity(MovieListDto.class).log().block();

    MovieListDto movieListDto = responseMovieListDto.getBody();
    movieListDto.setParamSearch(search);
    movieListDto.setParamPage(page);
    return movieListDto;
  }

  public MovieDetailDto getMovieDetail(String movieId) {
    ResponseEntity<MovieDetailDto> responseMovieDetailDto = omdbWebClient.get()
        .uri(uriBuilder -> uriBuilder.scheme("http").host(omdbApiHost).queryParam("apikey", omdbApiKey)
            .queryParam("i", movieId).build())
        .accept(MediaType.APPLICATION_JSON).retrieve().toEntity(MovieDetailDto.class).log().block();

    return responseMovieDetailDto.getBody();
  }
}