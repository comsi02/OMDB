package com.omdb.movie.controller.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.omdb.movie.model.dto.MovieDetailDto;
import com.omdb.movie.model.dto.MovieListDto;
import com.omdb.movie.service.movie.OmdbApiService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("movie/api")
@RequiredArgsConstructor
public class MovieApiController {

  @Autowired
  OmdbApiService omdbApiService;

  private final Gson gson;

  @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
  public String list(@RequestParam(value = "search", defaultValue = "home") String search,
      @RequestParam(value = "page", defaultValue = "1") int page) {

    MovieListDto movieListDto = omdbApiService.getMovieList(search, page);


    return gson.toJson(movieListDto);
  }

  @GetMapping(value = "/detail/{imdbId}", produces = MediaType.APPLICATION_JSON_VALUE)
  public String detail(@PathVariable(required = true) String imdbId) {

    MovieDetailDto movieDetailDto = omdbApiService.getMovieDetail(imdbId);

    return gson.toJson(movieDetailDto);
  }
}