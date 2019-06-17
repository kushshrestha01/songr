package com.shrestha.code401springboot.firstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String songDetails(Model m) {
        Iterable<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "songs";
    }

    @PostMapping("/addsong")
    public RedirectView songAdd(@RequestParam String title, @RequestParam int length, @RequestParam Integer trackNumber, @RequestParam String album) {

        Album songWithSameAlbum = albumRepository.findByTitle(album).get(0);

        Song add = new Song(title, length, trackNumber, songWithSameAlbum);
        songRepository.save(add);
        songWithSameAlbum.songs.add(add);
        albumRepository.save(songWithSameAlbum);

        return new RedirectView("/songs");

    }

//    @RequestMapping(value="albumDetail/{id}")
}
