package com.omdb.movie.controller.movie;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.omdb.movie.service.movie.OmdbApiService;

import jakarta.servlet.http.HttpServletRequest;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("movie")
public class MovieController {

	@Autowired
	OmdbApiService omdbApiService;

	@RequestMapping(value = "/list")
	public String index(Model model, HttpServletRequest request) throws IOException {

		String test1= omdbApiService.GetMovieList();
		String test2= omdbApiService.GetMovieDetail("tt0104431");

		model.addAttribute("test1", test1);
		model.addAttribute("test2", test2);

		return "movie/list";
	}
}