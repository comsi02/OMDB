package com.omdb.movie;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.util.Assert;

import com.omdb.movie.model.dto.MovieDetailDto;
import com.omdb.movie.model.dto.MovieListDto;
import com.omdb.movie.service.movie.OmdbApiService;

@AutoConfigureMockMvc
@SpringBootTest
class MovieApplicationTests {

  @Value("${app.config.omdb.api-scheme}")
  String omdbApiScheme;

  @Value("${app.config.omdb.api-host}")
  String omdbApiHost;

  @Value("${app.config.omdb.api-key}")
  String omdbApiKey;

  @Autowired
  private MockMvc mvc;

  @Autowired
  OmdbApiService omdbApiService;

  private final String itemIdSucc = "tt6751668";
  private final String itemIdFail = "000000000";
  private final String searchSucc = "Parasite";
  private final String searchFail = "";
  private final Integer pageSucc = 1;

  @Test
  void contextLoads() {
    assertThat(omdbApiScheme).isNotNull();
    assertThat(omdbApiHost).isNotNull();
    assertThat(omdbApiKey).isNotNull();
    assertThat(omdbApiService).isNotNull();
  }

  @Test
  public void movieListApiTest() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/movie/api/list")).andDo(print()).andExpect(status().isOk())
        .andExpect(jsonPath("$.response").value(true));
  }

  @Test
  public void movieListApiTestWithSearch() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/movie/api/list").param("search", searchSucc)).andDo(print())
        .andExpect(status().isOk()).andExpect(jsonPath("$.mSearch").value(searchSucc));
  }

  @Test
  public void movieListApiTestWithPage() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/movie/api/list").param("page", pageSucc.toString())).andDo(print())
        .andExpect(status().isOk()).andExpect(jsonPath("$.mPage").value(pageSucc));
  }

  @Test
  public void movieDetailApiWithSuccImdbId() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/movie/api/detail/{itemIdSucc}", itemIdSucc)).andDo(print())
        .andExpect(status().isOk()).andExpect(jsonPath("$.response").value(true));
  }

  @Test
  public void movieDetailApiWithFailImdbId() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/movie/api/detail/{itemIdFail}", itemIdFail)).andDo(print())
        .andExpect(status().isOk()).andExpect(jsonPath("$.response").value(false));
  }

  @Test
  public void movieListControllerWithSearch() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/movie/list").param("search", searchSucc)).andExpect(status().isOk());
  }

  @Test
  public void movieDetailControllerWithSearch() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/movie/detail/{itemIdSucc}", itemIdSucc)).andExpect(status().isOk());
  }

  @Test
  public void omdbApiServiceMovieListSucc() throws Exception {
    MovieListDto moveListDto = omdbApiService.getMovieList(searchSucc, pageSucc);
    Assert.isTrue(moveListDto.getResponse(), () -> "This value must be true");
    Assert.isTrue(moveListDto.getTotalResults() > 0, () -> "This value must be great then 0");
    Assert.notEmpty(moveListDto.getSearch(), () -> "This List must be not empty");
  }

  @Test
  public void omdbApiServiceMovieListFail() throws Exception {
    MovieListDto moveListDto = omdbApiService.getMovieList(searchFail, pageSucc);
    Assert.isTrue(moveListDto.getResponse().equals(false), () -> "This value must be false");
  }

  @Test
  public void omdbApiServiceMovieDetailSucc() throws Exception {
    MovieDetailDto moveDetailDto = omdbApiService.getMovieDetail(itemIdSucc);
    Assert.isTrue(moveDetailDto.getResponse(), () -> "This value must be true");
    Assert.isTrue(moveDetailDto.getTitle().equals(searchSucc), () -> "This value must be '" + moveDetailDto.getTitle() + "'");
  }

  @Test
  public void omdbApiServiceMovieDetailFail() throws Exception {
    MovieDetailDto moveDetailDto = omdbApiService.getMovieDetail(itemIdFail);
    Assert.isTrue(moveDetailDto.getResponse().equals(false), () -> "This value must be false");
  }
}