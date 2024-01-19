package project.movieapp.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){ // It finds all movies data.
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovie(String imdbid){ // It finds specific movie data by id.
        return movieRepository.findByImdbId(imdbid);
    }
}
