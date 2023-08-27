package com.omdb.movie.service.web;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import reactor.netty.http.client.HttpClient;

@Configuration
public class WebClientService {

	private static final int BASE_TIME_OUT = 3000;
	private static final int OMDB_TIME_OUT = 3000;

	@Bean("baseWebClient")
	public WebClient baseWebClient() {
		HttpClient httpClient = HttpClient.create().option(ChannelOption.CONNECT_TIMEOUT_MILLIS, BASE_TIME_OUT)
				.responseTimeout(Duration.ofMillis(BASE_TIME_OUT))
				.doOnConnected(conn -> conn.addHandlerLast(new ReadTimeoutHandler(BASE_TIME_OUT, TimeUnit.MILLISECONDS))
						.addHandlerLast(new WriteTimeoutHandler(BASE_TIME_OUT, TimeUnit.MILLISECONDS)));

		WebClient client = WebClient.builder().clientConnector(new ReactorClientHttpConnector(httpClient)).build();

		return client;
	}

	@Bean("omdbWebClient")
	public WebClient omdbWebClient() {
		HttpClient httpClient = HttpClient.create().option(ChannelOption.CONNECT_TIMEOUT_MILLIS, BASE_TIME_OUT)
				.responseTimeout(Duration.ofMillis(OMDB_TIME_OUT))
				.doOnConnected(conn -> conn.addHandlerLast(new ReadTimeoutHandler(OMDB_TIME_OUT, TimeUnit.MILLISECONDS))
						.addHandlerLast(new WriteTimeoutHandler(OMDB_TIME_OUT, TimeUnit.MILLISECONDS)));

		WebClient client = WebClient.builder().clientConnector(new ReactorClientHttpConnector(httpClient)).build();

		return client;
	}
}