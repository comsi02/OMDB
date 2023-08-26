package com.omdb.movie.model.dao;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DetailDao {
	String title;
	String year;
	String rated;
	String released;
	String runtime;
	String genre;
	String director;
	String writer;
	String actors;
	String plot;
	String language;
	String country;
	String awards;
	String poster;
	List<RatingDao> ratings;
	int metascore;
	BigDecimal imdbRating;
	int imdbVotes;
	String imdbId;
	String type;
	String dvd;
	String boxOffice;
	String production;
	String website;
	Boolean Response;
}
