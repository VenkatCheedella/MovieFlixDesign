package org.egen.ares.controllers;

import java.util.ArrayList;
import java.util.List;

import org.egen.ares.movieflix.DataStore;
import org.egen.ares.movieflix.IMovie;
import org.egen.ares.movieflix.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies")
public class MovieController implements IMovieController{
	
	@Autowired
	private DataStore dataStore;
	
	@RequestMapping(value = "{id}" , method= RequestMethod.GET, produces = "application/json")
	public List<IMovie> findAllMovies(){
		return new ArrayList<IMovie>();
	}
	
	@RequestMapping(method= RequestMethod.GET, produces = "application/json")
	public List<IMovie> findMovie(@PathVariable("id")String id){
		List<IMovie> movieList = new ArrayList<IMovie>();
		/*
		 *  Need to implement this part
		 */
		return movieList;
	}
	
	@RequestMapping(method= RequestMethod.POST, produces = "application/json")
	public IMovie createMovie(@RequestBody String movie){
		return (IMovie)new Movie();
	}
	
	@RequestMapping(value = "{id}", method= RequestMethod.POST, produces = "application/json")
	public IMovie updateMovie(@RequestBody String movie){
		return (IMovie)new Movie();
	}
	
	@RequestMapping(value = "{id}", method= RequestMethod.GET, produces = "application/json")
	public IMovie deleteMovie(@PathVariable("id")String id){
		return (IMovie)new Movie();
	}
}
