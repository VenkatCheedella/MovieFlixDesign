package org.egen.ares.movieflix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component(value="datastore")
public class DataStore implements IDataStore{
	
	private static Map<String, Movie> movies;
	private static Map<String, List<String>> nameToMoviesMap;

	static{
		movies = new HashMap<String, Movie>();
		nameToMoviesMap = new HashMap<String, List<String>>();
	}

	public List<Movie> getAllMovies() {
		List<Movie> existingMovies = new ArrayList<Movie>(movies.values());
		return existingMovies;
	}

	public Movie getMovie(String id) {
		return movies.get(id);
		
	}

	public Movie updateMvie(Movie movie) {					
		return null;
	}

	public Movie deleteMovie(Movie movie) {		
		return null;
	}

	public Movie createMovie(Movie movie) {		
		return null;
	}

}
