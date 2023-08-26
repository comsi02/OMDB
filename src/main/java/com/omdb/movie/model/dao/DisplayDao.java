package com.omdb.movie.model.dao;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class DisplayDao {
	List<MovieDao> search;
	String totalResults;
	String Response;
}