package com.ClassroomPopcorn.main.functions;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import com.ClassroomPopcorn.database.getMovies.movieDetails;

import java.sql.ResultSet;
import java.sql.SQLException;


public class mapMovieDetails {

    public static BorderPane mapMovieDetails(String keyword, String genreFilter, String ratingFilter, String orderFilter){
        BorderPane movies = new BorderPane();

        try {
            ResultSet searchResult = movieDetails.movieDetails(keyword,genreFilter,ratingFilter,orderFilter);
            searchResult.next();
            String ids = searchResult.getString("movieName");
            Label searchLength = new Label(ids+" movies found from DB");

            movies.setCenter(searchLength);
        }catch (SQLException sql) {
            sql.printStackTrace();
        } finally {

        }

        return movies;
    }
}
