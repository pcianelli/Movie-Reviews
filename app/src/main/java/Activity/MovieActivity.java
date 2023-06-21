package Activity;

import Types.Movie;
import Types.Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Exception.MovieNotFoundException;

public class MovieActivity {

    Map<Movie, List<Review>> movieReviewMap;

    public MovieActivity() {
        this.movieReviewMap = new HashMap<>();
    }

    public void addMovie(String title, String director, String ID){
        movieReviewMap.put(new Movie(title, director, ID), new ArrayList<>());
    }

    public void addMovieReview(String title, String director, String ID, String review){

        Review review1 = new Review(review);

        List<Review> reviewList = new ArrayList<>();
        reviewList.add(review1);

        Movie movie = new Movie(title, director, ID);

        if(movieReviewMap.containsKey(movie)) {
            List<Review> reviewList2 = movieReviewMap.get(movie);
            reviewList2.add(review1);
        }
        else {
            movieReviewMap.put(movie, reviewList);
        }
    }

    public Movie lookUpMovieByTitle(String title) throws MovieNotFoundException {
        Movie movie = null;
        for(Map.Entry<Movie, List<Review>> entry: movieReviewMap.entrySet()){
            if(entry.getKey().getTitle().equals(title)){
                movie = entry.getKey();
            }
        }
        if(movie != null) {
            return movie;
        }
        else {
            throw new MovieNotFoundException();
        }
    }
}
