package com.devmarcelo.dsmovie.repositories;

import com.devmarcelo.dsmovie.entities.Movie;
import com.devmarcelo.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
