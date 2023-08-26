package com.omdb.movie.model.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MovieDao {
	String title;
	String year;
	String imdbId;
	String type;
	String poster;
}