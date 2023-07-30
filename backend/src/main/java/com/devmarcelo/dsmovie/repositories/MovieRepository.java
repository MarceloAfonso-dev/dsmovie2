package com.devmarcelo.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmarcelo.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
