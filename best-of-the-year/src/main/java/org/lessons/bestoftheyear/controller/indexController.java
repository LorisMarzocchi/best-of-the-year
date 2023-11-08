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
//        List<Movie> bestMovies = getBestMovies(); //per oggetti
////        String moviesString = String.join(", ", getBestMovies());
//        String songsString = String.join(", ", getBestSongs());
////        model.addAttribute("movies", moviesString);
//        model.addAttribute("movies", bestMovies); //per oggetti
//        model.addAttribute("songs", songsString);
        return "home";
    }

//    private List<String> getBestMovies() {
//        return List.of("Il Padrino", "Shawshank Redemption", "Forrest Gump", "Il Cavaliere Oscuro");
//    }






}
