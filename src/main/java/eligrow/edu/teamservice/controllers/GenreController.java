package eligrow.edu.teamservice.controllers;

import eligrow.edu.teamservice.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GenreController {
    @Autowired
    private GenreService genreservice;

    @RequestMapping("/genres")
    public List<Genre> getAllGenres(){
        return genreservice.getAllGenres();
    }

    @RequestMapping("/genre/{id}")
    public Genre getGenre(@PathVariable String id){
        return genreservice.getGenre(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/genre")
    public void addGenre(@RequestBody Genre genre){
        genreservice.addGenre(genre);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/genre/{id}")
    public void addGenre(@RequestBody String id){
        genreservice.deleteTeam(id);
    }
}
