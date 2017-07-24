package com.ClassroomPopcorn.main.windows.movie;

import com.ClassroomPopcorn.main.windows.home.main;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class movieOnline {

    public void movieOnline(String movieName, int yearOfRelease, String genre, double IMDB, int likes, int downloads, String description, String director, String cast, String movieLink, String trailerLink, String movieImageURL){
        Stage movieWindow = new Stage();
        movieWindow.setTitle("Enjoy Live Streaming !!");

        ScrollPane details = new ScrollPane();
        details.setFitToWidth(true);

        WebView webview = new WebView();
        webview.getEngine().load( movieLink );

        WebView trailerview = new WebView();
        trailerview.getEngine().load( trailerLink );
        trailerview.setPrefSize(512,288);

        VBox verticalStack = new VBox(20);
        verticalStack.setStyle("-fx-background-color: #323232;");
        verticalStack.setFocusTraversable(true);

        BorderPane mainMovie = new BorderPane(webview);

        BorderPane movieDetails = new BorderPane();
        movieDetails.setLeft(trailerview);




        verticalStack.getChildren().addAll(mainMovie, movieDetails);
        details.setContent(verticalStack);

        Scene scene = new Scene(details);
        scene.getStylesheets().add(movieOnline.class.getResource("../../resources/css/main.css").toExternalForm());
        movieWindow.setScene(scene);
        movieWindow.setMaximized(true);
        movieWindow.show();
        movieWindow.widthProperty().addListener(e-> webview.setPrefWidth(movieWindow.getWidth()));
        movieWindow.setMinWidth(800);
        movieWindow.setMinHeight(600);
        webview.setPrefHeight(0.9*movieWindow.getHeight());
        movieWindow.getIcons().add(new Image(getClass().getResourceAsStream("../../resources/images/ClassroomPopcorn.png")));

        movieWindow.setOnCloseRequest(e-> {
            webview.getEngine().load(null);
            trailerview.getEngine().load(null);
        });
    }
}
