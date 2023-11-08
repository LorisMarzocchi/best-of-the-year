package org.lessons.bestoftheyear.controller;

import org.lessons.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/songs")
public class songController {
    @GetMapping
    public String songs(Model model){
        List<Song> bestSongs = getBestSongs();
        model.addAttribute("songs", bestSongs);
        return "song-list";
    }
    @GetMapping("/{id}")
    public String songDetail(@PathVariable("id") String songId, Model model) {
        Song song = getSongById(songId);
        model.addAttribute("song", song);
        return "song-details";
    }
    private List<Song> getBestSongs(){
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("1", "Bohemian Rhapsody", "Qeen"));
        songs.add(new Song("2", "Imagine", "John Lennon"));
        songs.add(new Song("3", "Like a Rolling Stone", "Bob Dylan"));
        songs.add(new Song("4", "Billie Jean ", "Michael Jackson"));
        return songs;
    }
    private Song getSongById(String id) {

        for (Song song : getBestSongs()) {
            if (song.getId().equals(id)) {
                return song;
            }
        }
        return null;
    }
}
