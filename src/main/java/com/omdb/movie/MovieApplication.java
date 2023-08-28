package com.omdb.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication(exclude = { JacksonAutoConfiguration.class })
public class MovieApplication {
  public static void main(String[] args) {
    SpringApplication.run(MovieApplication.class, args);
  }
}