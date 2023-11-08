package org.lessons.bestoftheyear.controller;

import org.lessons.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/movies")
public class movieController {

    @GetMapping
    public String movies(Model model) {
        List<Movie> bestMovies = getBestMovies();
        model.addAttribute("movies", bestMovies);
        return "movie-list";
        //per oggetti
    }

    @GetMapping("/{id}")
    public String movieDetail(@PathVariable("id") String movieId, Model model) {
        Movie movie = getMovieById(movieId);
        model.addAttribute("movie", movie);
        return "movie-details";
    }

    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("1", "Il Padrino", "Descrizione Il Padrino", 175));
        movies.add(new Movie("2", "Shawshank Redemption", "Descrizione Shawshank Redemption", 142));
        movies.add(new Movie("3", "Forrest Gump", "Descrizione Forrest Gump", 142));
        movies.add(new Movie("4", "Il Cavaliere Oscuro", "Descrizione Il Cavaliere Oscuro", 152));
        return movies;
    }

    private Movie getMovieById(String id) {

        for (Movie movie : getBestMovies()) {
            if (movie.getId().equals(id)) {
                return movie;
            }
        }
        return null;
    }

    //    @GetMapping("movies")
//    public String movies(Model model){
//        List<String> bestMovies = getBestMovies();
//        String moviesString = String.join(" , ", bestMovies);
//        model.addAttribute("movies",moviesString);
//        return "movies";
    //PER STRINGHE
//    }
    // Metodo privato per recuperare i migliori film
//    private List<String> getBestMovies() {
//        List<String> movies = new ArrayList<>();
//        movies.add("Il Padrino");
//        movies.add("Shawshank Redemption");
//        movies.add("Forrest Gump");
//        movies.add("Il Cavaliere Oscuro");
//        return movies;
//    }
//    private List<String> getBestMovies() {
//        return List.of("Il Padrino", "Shawshank Redemption", "Forrest Gump", "Il Cavaliere Oscuro");
//    }
}
