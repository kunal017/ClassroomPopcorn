package com.ClassroomPopcorn.main.functions;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class movieTemplate {

    public static BorderPane movieTemplate(String movieName, String movieImageURL, int yearOfRelease, String genre, double IMDB, int downloads){
        BorderPane movies = new BorderPane();
        movies.setPadding(new Insets(10,10,10,30));
        movies.setStyle("-fx-border-color: black");

        Image img = new Image(movieImageURL);
        ImageView imgView = new ImageView(img);
        imgView.setFitHeight(200);
        imgView.setPreserveRatio(true);
        movies.setLeft(imgView);

        VBox details = new VBox(10);

        Label name = new Label(movieName);
        name.setPadding(new Insets(0,0,30,20));
        name.setFont(new Font("Cambria", 25));
        name.setTextFill(Color.web("#fff"));

        Label year = new Label(yearOfRelease+"");
        year.setPadding(new Insets(0,0,0,20));
        year.setFont(new Font("Cambria", 20));
        year.setTextFill(Color.web("#fff"));

        Label genres = new Label(genre);
        genres.setPadding(new Insets(0,0,0,20));
        genres.setFont(new Font("Cambria", 20));
        genres.setTextFill(Color.web("#fff"));

        Label imdb = new Label(IMDB+"");
        imdb.setPadding(new Insets(0,0,0,20));
        imdb.setFont(new Font("Cambria", 20));
        imdb.setTextFill(Color.web("#fff"));

        Label download = new Label(downloads+"");
        download.setPadding(new Insets(0,0,0,20));
        download.setFont(new Font("Cambria", 20));
        download.setTextFill(Color.web("#fff"));

        details.getChildren().addAll(name,year,genres,imdb,download);

        movies.setCenter(details);

        return movies;
    }
}
