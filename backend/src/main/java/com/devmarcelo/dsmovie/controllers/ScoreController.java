package com.devmarcelo.dsmovie.controllers;

import com.devmarcelo.dsmovie.dto.MovieDTO;
import com.devmarcelo.dsmovie.dto.ScoreDTO;
import com.devmarcelo.dsmovie.services.MovieService;
import com.devmarcelo.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@Autowired
	private ScoreService service;
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
	}
}
