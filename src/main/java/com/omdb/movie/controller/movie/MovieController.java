package com.omdb.movie.controller.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.omdb.movie.model.dto.MovieDetailDto;
import com.omdb.movie.model.dto.MovieListDto;
import com.omdb.movie.service.movie.OmdbApiService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("movie")
public class MovieController {

	@Autowired
	OmdbApiService omdbApiService;

	@RequestMapping(value = "/list")
	public String list(Model model, HttpServletRequest request,
			@RequestParam(value = "search", defaultValue = "home") String search,
			@RequestParam(value = "page", defaultValue = "1") int page) {

		MovieListDto movieListDto = omdbApiService.getMovieList(search, page);
		model.addAttribute("movieListDto", movieListDto);

		return "movie/list";
	}

	@RequestMapping(value = "/detail/{imdbId}")
	public String detail(Model model, HttpServletRequest request, @PathVariable(required = true) String imdbId) {

		MovieDetailDto movieDetailDto = omdbApiService.getMovieDetail(imdbId);
		model.addAttribute("movieDetailDto", movieDetailDto);

		return "movie/detail";
	}
}