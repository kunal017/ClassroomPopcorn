package com.ClassroomPopcorn.main.windows.movie;

import com.ClassroomPopcorn.main.windows.home.main;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class movieOnline {

    public void movieOnline(String movieName, int yearOfRelease, String genre, double IMDB, int likes, int downloads, String description, String director, String cast, String movieLink, String trailerLink, String movieImageURL){
        Stage movieWindow = new Stage();
        movieWindow.setTitle("Enjoy Live Streaming !!");

        WebView webview = new WebView();
        webview.getEngine().load( movieLink );

        ScrollPane details = new ScrollPane();
        details.setFitToWidth(true);

        Scene scene = new Scene(details);
        scene.getStylesheets().add(main.class.getResource("../../resources/css/main.css").toExternalForm());
        movieWindow.setScene(scene);
        movieWindow.setMaximized(true);
        movieWindow.show();
        movieWindow.getIcons().add(new Image(getClass().getResourceAsStream("../../resources/images/ClassroomPopcorn.png")));

        BorderPane mainMovie = new BorderPane(webview);
        movieWindow.widthProperty().addListener(e-> webview.setPrefWidth(movieWindow.getWidth()));
        movieWindow.setMinWidth(800);
        movieWindow.setMinHeight(600);
        webview.setPrefHeight(0.9*movieWindow.getHeight());

        details.setContent(mainMovie);
        movieWindow.setOnCloseRequest(e-> webview.getEngine().load(null));
    }
}
