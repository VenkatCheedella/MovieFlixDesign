package org.egen.ares.movieflix;

import java.util.List;

public interface IDataStore {
	public List<Movie> getAllMovies();
	public Movie getMovie(String id);
	public Movie updateMvie(Movie movie);
	public Movie deleteMovie(Movie movie);
	public Movie createMovie(Movie movie);
}
