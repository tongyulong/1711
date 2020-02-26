package com.bw.movie.dao;

import java.util.List;

import com.bw.movie.domain.Movie;
import com.bw.movie.vo.MovieVO;

public interface MovieMapper {

	List<Movie> movie(MovieVO vo);
}
