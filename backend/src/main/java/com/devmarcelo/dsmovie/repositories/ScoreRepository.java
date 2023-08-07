package com.devmarcelo.dsmovie.repositories;

import com.devmarcelo.dsmovie.entities.Score;
import com.devmarcelo.dsmovie.entities.ScorePK;
import com.devmarcelo.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
