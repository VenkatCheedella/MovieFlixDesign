/**
 * @author venkat cheedella
 */

package org.egen.ares.controllers;

import java.util.List;

import org.egen.ares.movieflix.IMovie;


public interface IMovieController {
	
	public List<IMovie> findAllMovies();
	public List<IMovie> findMovie(String id);
	public IMovie createMovie(String movie);
	public IMovie updateMovie(String movie);
	public IMovie deleteMovie(String id);
}
