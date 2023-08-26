package com.omdb.movie;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@AutoConfigureMockMvc
@SpringBootTest
class MovieApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	void contextLoads() {
	}

	@Test
	public void displayApiFailTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("http://www.omdbapi.com/?s=Home&apikey=apikey")).andDo(print())
				.andExpect(status().is4xxClientError());
	}

	@Test
	public void displayApiSuccTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("http://www.omdbapi.com/?s=Home&apikey=c5ef16e2")).andDo(print())
				.andExpect(status().isOk());
	}

}