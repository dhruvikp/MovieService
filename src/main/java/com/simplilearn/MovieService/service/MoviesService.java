package com.simplilearn.MovieService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.MovieService.entity.Movie;
import com.simplilearn.MovieService.repository.MovieRepository;

@Service
public class MoviesService {

	@Autowired
	MovieRepository movieRepository;

	public List<Movie> getAllMovies() {
		List<Movie> movies = new ArrayList<>();
		movieRepository.findAll().forEach(movie -> movies.add(movie));
		return movies;
	}

	public void saveMovie(Movie movie) {
		movieRepository.save(movie);
	}

	public void delete(int id) {
		movieRepository.deleteById(id);
	}

}

