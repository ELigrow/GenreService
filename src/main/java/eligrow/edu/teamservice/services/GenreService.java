
package eligrow.edu.teamservice.services;

import eligrow.edu.teamservice.controllers.Genre;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GenreService {
    private static Log log = LogFactory.getLog(GenreService.class);

    private List<Genre> genres = new ArrayList<>(
        Arrays.asList(
                new Genre("Action-Adventure", 5),
                new Genre("Sci-Fi", 4),
                new Genre("Comedy", 3),
                new Genre("Indie", 2),
                new Genre("Romance", 1)
        )
    );


    public List<Genre> getAllGenres() {
        log.info("Returned all genres");
        return genres;
    }

    public Genre getGenre(String id){
        log.info("Returning genre " + id);
        return genres.stream()
                .filter(t -> t.getName().contains(id)).findFirst().get();
    }

    public void addGenre(Genre genre){
        log.info("Adding genre: " + genre.getName());
        genres.add(genre);
    }

    public void updateGenre(Genre genre, String id) {
        log.info("Updating genre: " + id);
        for(int i=0;i < genres.size() ;i++) {
            Genre t = genres.get(i);
            if (t.getName().equals(id)) {
                genres.set(i,genre);
                return;
            }
        }
    }

    public void deleteTeam(String id) {
        log.info("Deleted genre: " + id);
        genres.removeIf(t -> t.getName().equals(id));
    }
}
