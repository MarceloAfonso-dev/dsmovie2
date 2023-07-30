package com.devmarcelo.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devmarcelo.dsmovie.dto.MovieDTO;
import com.devmarcelo.dsmovie.services.MovieService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	@Autowired
	private MovieService service;

	@GetMapping("/todos")
	public Page<MovieDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}

	@GetMapping
	public MovieDTO findByID(@PathVariable Long id) {
		return service.findById(id);
	}
	@GetMapping("/oi")
	public Map<String, String> teste(){
		Map<String, String> map = new HashMap<>();
		map.put("value","Hello World");
		return map;
	}
}
