package com.omdb.movie.service.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.google.gson.Gson;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OmdbApiService {

	@Autowired
	WebClient omdbWebClient;

	@Autowired
	Gson gson;

	@Value("${app.config.omdb.api-scheme}")
	String omdbApiScheme;

	@Value("${app.config.omdb.api-host}")
	String omdbApiHost;

	@Value("${app.config.omdb.api-key}")
	String omdbApiKey;

	public String GetMovieList() {

		ResponseEntity<String> response = omdbWebClient.get().uri(uriBuilder -> uriBuilder.scheme("http")
				.host(omdbApiHost).queryParam("apikey", omdbApiKey).queryParam("s", "home").build()).retrieve()
				.toEntity(String.class).log().block();

		System.out.println(response);

		return response.toString();
	}
	
	public String GetMovieDetail(String movieId) {
		ResponseEntity<String> response = omdbWebClient.get().uri(uriBuilder -> uriBuilder.scheme("http")
				.host(omdbApiHost).queryParam("apikey", omdbApiKey).queryParam("t", movieId).build()).retrieve()
				.toEntity(String.class).log().block();

		System.out.println(response);

		return response.toString();
	}
}