package com.omdb.movie.service.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateService {

  private static final int BASE_TIME_OUT = 3000;
  private static final int OMDB_TIME_OUT = 2000;

  @Bean("baseRestTemplate")
  public RestTemplate baseRestTemplate() {
    SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
    requestFactory.setConnectTimeout(BASE_TIME_OUT);
    requestFactory.setReadTimeout(BASE_TIME_OUT);
    return new RestTemplate(requestFactory);
  }

  @Bean("omdbRestTemplate")
  public RestTemplate omdbRestTemplate() {
    SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
    requestFactory.setConnectTimeout(OMDB_TIME_OUT);
    requestFactory.setReadTimeout(OMDB_TIME_OUT);
    return new RestTemplate(requestFactory);
  }
}
