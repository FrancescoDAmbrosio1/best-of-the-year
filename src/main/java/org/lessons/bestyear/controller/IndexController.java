package org.lessons.bestyear.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.bestyear.model.Movie;
import org.lessons.bestyear.model.Song;
import org.lessons.bestyear.model.Utente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

	@GetMapping("/")
	public String bestYear(Model model) {
		
		Utente user1 = new Utente();
		user1.setName("Francesco");
		
		model.addAttribute("user", user1.getName());
		
		return "utenti";
	}
	
	@GetMapping("/movies")
	public String bestMovies(Model model) {
		List<Movie> movieList= getBestMovies();
		Movie movie1 = new Movie();
		movie1.setId(1L);
		movie1.setTitle("L'alba dei viventi morti");
		movie1.setCategory("FantaHorror");
		
		Movie movie2 = new Movie();
		movie2.setId(2L);
		movie2.setTitle("Titanic");
		movie2.setCategory("Storico");
		
		Movie movie3 = new Movie();
		movie3.setId(3L);
		movie3.setTitle("Bamboccioni");
		movie3.setCategory("Comico");
		
		movieList.add(movie1);
		movieList.add(movie2);
		movieList.add(movie3);
		
		model.addAttribute("bestMoviesList", movieList);
		return "movies";
	}
	
	@GetMapping("/songs")
	public String bestSongs(Model model) {
		
		List<Song> songList= getBestSongs();
		Song song1 = new Song();
		song1.setId(1L);
		song1.setTitle("La macarena");
		song1.setSinger("Pippo");
		
		Song song2 = new Song();
		song2.setId(2L);
		song2.setTitle("Tiburon");
		song2.setSinger("Topolino");
		
		Song song3 = new Song();
		song3.setId(2L);
		song3.setTitle("Maracaibo");
		song3.setSinger("Pluto");
		
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		
		model.addAttribute("bestSongsList", songList);
		
		return "songs";
	}
	
	@GetMapping("/movies/{id}")
	public String ricercaId(@PathVariable("id") Long id, Model model) {
		Movie m = 
		for(Movie m : getBestMovies()) {
			if(m.getId().equals(id)) {
				return m;
			} else {
				return null;
			}
		}
		Movie movieRicercata = m;
		model.addAttribute("movie", m);
		
		return "ricercaMovieId";
	}
	
	private List<Movie> getBestMovies() {
		
		List<Movie> bestMoviesList = new ArrayList<Movie>();
		
		return bestMoviesList;
	}
	
	private List<Song> getBestSongs() {
		
		List<Song> bestSongsList = new ArrayList<Song>();
		
		return bestSongsList;
	}
}
