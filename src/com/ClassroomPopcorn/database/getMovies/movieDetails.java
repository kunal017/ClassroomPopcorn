package com.ClassroomPopcorn.database.getMovies;

import com.ClassroomPopcorn.database.utils.DBUtils;
import com.ClassroomPopcorn.main.functions.movieTemplate;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class movieDetails {

    public static StackPane movieDetails(String condition){

        StackPane movieResults = new StackPane();
        VBox verticalTemplates = new VBox(10);
        verticalTemplates.setPadding(new Insets(30,0,0,0));

        Connection conn = null;
        PreparedStatement stmtt = null;
        ResultSet rs = null;

        String query = DBUtils.prepareSelectQuery("", "classroompopcorn.moviedetail", "", condition+"");

        try {
            conn = DBUtils.getConnection();
            stmtt = conn.prepareStatement(query);
            rs = stmtt.executeQuery();
            rs.last();
            int size = rs.getRow();
            rs.beforeFirst();

            String movieResultString;
            if (size==1)
                movieResultString = "1 movie found on Database search";
            else if (size>1)
                movieResultString = size+" movies found on Database search";
            else
                movieResultString = "No results found in Database";

            Label name = new Label(movieResultString);
            name.setFont(new Font("Cambria", 20));
            name.setTextFill(Color.web("#6ac045"));
            name.setAlignment(Pos.TOP_CENTER);

            verticalTemplates.getChildren().add(name);

            while (rs.next()){
                String movieName = rs.getString("movieName");
                int yearOfRelease = rs.getInt("yearOfRelease");
                String genre = rs.getString("genre");
                double IMDB = rs.getDouble("IMDB");
                int likes = rs.getInt("likes");
                int downloads = rs.getInt("downloads");
                String description = rs.getString("description");
                String director = rs.getString("director");
                String cast = rs.getString("cast");
                String movieLink = rs.getString("movieLink");
                String trailerLink = rs.getString("trailerLink");
                String movieImageURL = rs.getString("ImageURL");

                BorderPane appendTemplate = movieTemplate.movieTemplate(movieName, yearOfRelease, genre, IMDB, likes, downloads, description, director, cast, movieLink, trailerLink, movieImageURL);

                verticalTemplates.getChildren().add(appendTemplate);
            }
            movieResults.getChildren().add(verticalTemplates);
        } catch (SQLException sql) {
            sql.printStackTrace();
        } finally {
            DBUtils.closeAll(rs,stmtt,conn);
        }
        return movieResults;
    }
}