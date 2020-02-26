package com.bw.movie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.movie.dao.MovieMapper;
import com.bw.movie.domain.Movie;
import com.bw.movie.service.MovieService;
import com.bw.movie.vo.MovieVO;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieMapper mapper;

	@Override
	public List<Movie> list(MovieVO vo) {
		// TODO Auto-generated method stub
		return mapper.movie(vo);
	}
	
	
	
	
}
