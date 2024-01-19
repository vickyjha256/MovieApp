package project.movieapp.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/route/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping // Getting Data of all the movies.
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbid}")
    public ResponseEntity<Optional<Movie>> getMovie(@PathVariable String imdbid){
        return new ResponseEntity<Optional<Movie>>(movieService.getMovie(imdbid), HttpStatus.OK);
    }
}
