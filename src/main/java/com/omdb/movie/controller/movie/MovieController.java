package com.omdb.movie.controller.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("movie")
public class MovieController {
	@RequestMapping(value = "/list")
	public String index() {
		return "movie/list";
	}
}
