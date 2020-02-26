package com.bw.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.movie.domain.Movie;
import com.bw.movie.service.MovieService;
import com.bw.movie.vo.MovieVO;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@RequestMapping("list")
	public String list(MovieVO vo,Model m){
		
		List<Movie> list = service.list(vo);
		
		m.addAttribute("list", list);
		m.addAttribute("vo", vo);
		
		return "list";
	}
}
