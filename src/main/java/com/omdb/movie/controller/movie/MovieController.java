package com.omdb.movie.controller.movie;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String index(Model model, HttpServletRequest request) throws IOException {

		MovieListDto   test1 = omdbApiService.getMovieList();
		MovieDetailDto test2 = omdbApiService.getMovieDetail("tt10872600");

		model.addAttribute("test1", test1);
		model.addAttribute("test2", test2);

		return "movie/list";
	}
}