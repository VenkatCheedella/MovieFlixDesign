package org.egen.ares.movieflix;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	private String Id;
	private String title;
	private int year;
	private Date releasedDate;
	private int runtime;
	private List<Genre> genre;
	private String director;
	private String writer;
	private List<String> actors;
	private String plot;
	private String language;
	private Country country;
	private String awards;
	private String poster;
	private int metaScore;
	private double imdbRating;
	private Long imdbVotes;
	private MediaType mediaType;	
}
