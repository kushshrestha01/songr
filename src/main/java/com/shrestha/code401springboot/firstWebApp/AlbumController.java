package com.shrestha.code401springboot.firstWebApp;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;


    @GetMapping("/albums")
    public String albumDetails(Model m) {
        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "album";
    }

    @PostMapping("/addalbum")
    public RedirectView albumAdd(@RequestParam String artistName, String imageUrl, int length, int songCount, String title) {
        Album add = new Album(title, artistName, songCount, length, imageUrl);
        albumRepository.save(add);
        return new RedirectView("/albums");
    }

}
