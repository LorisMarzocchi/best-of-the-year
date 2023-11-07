package org.lessons.bestoftheyear.controller;


import org.lessons.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class indexController {
    @GetMapping("home")
    public String index(Model model) {
        String name = "Loris";
        model.addAttribute("nome",name);
        List<Movie> bestMovies = getBestMovies(); //per oggetti
//        String moviesString = String.join(", ", getBestMovies());
        String songsString = String.join(", ", getBestSongs());
//        model.addAttribute("movies", moviesString);
        model.addAttribute("movies", bestMovies); //per oggetti
        model.addAttribute("songs", songsString);
        return "home";
    }
//    @GetMapping("movies")
//    public String movies(Model model){
//        List<String> bestMovies = getBestMovies();
//        String moviesString = String.join(" , ", bestMovies);
//        model.addAttribute("movies",moviesString);
//        return "movies";
//    }
    @GetMapping("movies")
    public String movies(Model model) {
        List<Movie> bestMovies = getBestMovies();
        model.addAttribute("movies", bestMovies);
        return "movies";
        //per oggetti
    }

    @GetMapping("songs")
    public String songs(Model model){
        List<String> bestSongs = getBestSongs();
        String songsString = String.join(" , ", bestSongs);
        model.addAttribute("songs", songsString);
        return "songs";
    }
    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Il Padrino", "Descrizione Il Padrino", 175, "https://picsum.photos/id/237/200/300"));
        movies.add(new Movie("Shawshank Redemption", "Descrizione Shawshank Redemption", 142, "https://picsum.photos/id/237/200/300"));
        movies.add(new Movie("Forrest Gump", "Descrizione Forrest Gump", 142,"https://picsum.photos/id/237/200/300"));
        movies.add(new Movie("Il Cavaliere Oscuro", "Descrizione Il Cavaliere Oscuro", 152, "https://picsum.photos/id/237/200/300"));
        return movies;
    }
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

    // Metodo privato per recuperare le migliori canzoni
    private List<String> getBestSongs(){
        List<String> songs = new ArrayList<>();
        songs.add("Bohemian Rhapsody - Queen");
        songs.add("Imagine - John Lennon");
        songs.add("Like a Rolling Stone - Bob Dylan");
        songs.add("Billie Jean - Michael Jackson");
        return songs;
    }



}
