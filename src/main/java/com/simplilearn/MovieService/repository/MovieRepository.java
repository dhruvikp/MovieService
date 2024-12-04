package com.simplilearn.MovieService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.MovieService.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
