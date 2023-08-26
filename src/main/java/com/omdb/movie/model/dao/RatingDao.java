package com.omdb.movie.model.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RatingDao {
	String source;
	String value;
}
