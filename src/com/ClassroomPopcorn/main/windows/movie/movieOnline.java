package com.ClassroomPopcorn.main.windows.movie;

import com.ClassroomPopcorn.database.getMovies.recommendedMoviesDetail;

import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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
        movieDetails.setPadding(new Insets(0,0,50,0));
        movieDetails.setLeft(new BorderPane(trailerview));

        VBox info = new VBox(10);
        info.setAlignment(Pos.TOP_LEFT);

        Label name = new Label(movieName);
        name.setPadding(new Insets(0,0,20,20));
        name.setFont(new Font("Cambria", 25));
        name.setTextFill(Color.web("#fff"));

        Label year = new Label("Year of Release:"+yearOfRelease);
        year.setPadding(new Insets(0,0,0,20));
        year.setFont(new Font("Cambria", 20));
        year.setTextFill(Color.web("#fff"));

        Label genres = new Label(genre);
        genres.setPadding(new Insets(-5,0,0,20));
        genres.setFont(new Font("Cambria", 20));
        genres.setTextFill(Color.web("#fff"));

        Label imdb = new Label("IMDB: "+IMDB);
        imdb.setPadding(new Insets(0,0,0,20));
        imdb.setFont(new Font("Cambria", 20));
        imdb.setTextFill(Color.web("#fff"));

        Label like = GlyphsDude.createIconLabel( FontAwesomeIcon.HEART,
                "Likes: "+ likes,
                "16",
                "18",
                ContentDisplay.LEFT );
        like.setPadding(new Insets(0,0,0,20));
        like.setFont(new Font("Cambria", 20));
        like.setTextFill(Color.web("#fff"));

        Label download = GlyphsDude.createIconLabel( FontAwesomeIcon.DOWNLOAD,
                "Downloads: "+downloads,
                "16",
                "18",
                ContentDisplay.LEFT );
        download.setPadding(new Insets(0,0,0,20));
        download.setFont(new Font("Cambria", 20));
        download.setTextFill(Color.web("#fff"));

        info.getChildren().addAll(name, year, genres, imdb, like, download);

        movieDetails.setCenter(info);

        movieDetails.setRight(recommendedMoviesDetail.movies("1"));

        HBox hbBottom = new HBox(50);
        hbBottom.setPadding(new Insets(30,0,0,0));

        Label synopsis = new Label("Synopsis: \n\n "+description);
        synopsis.setPadding(new Insets(0,0,0,20));
        synopsis.setFont(new Font("Cambria", 16));
        synopsis.setTextFill(Color.web("#fff"));
        synopsis.setWrapText(true);
        synopsis.widthProperty().addListener(e->synopsis.setPrefWidth(0.6*movieWindow.getWidth()));

        VBox vb = new VBox(10);

        Label directorLabel = new Label("Director");
        directorLabel.setPadding(new Insets(0,0,0,20));
        directorLabel.setFont(new Font("Cambria", 18));
        directorLabel.setTextFill(Color.web("#a1a1a1"));
        directorLabel.setStyle("-fx-border-color: black;-fx-border-width: 0 0 1 0;-fx-underline: true;-fx-padding: 0 0 -1 0;");

        Label directorName = GlyphsDude.createIconLabel( FontAwesomeIcon.USER,
                director,
                "18",
                "18",
                ContentDisplay.LEFT );
        directorName.setPadding(new Insets(0,0,10,20));
        directorName.setFont(new Font("Cambria", 18));
        directorName.setTextFill(Color.web("#a1a1a1"));

        Label castLabel = new Label("Casts");
        castLabel.setPadding(new Insets(0,0,0,20));
        castLabel.setFont(new Font("Cambria", 18));
        castLabel.setTextFill(Color.web("#a1a1a1"));
        castLabel.setStyle("-fx-border-color: black;-fx-border-width: 0 0 1 0;-fx-underline: true;-fx-padding: 0 0 -1 0;");

        vb.getChildren().addAll(directorLabel,directorName,castLabel);

        String[] casts = cast.split(" / ");
        for (int i=0; i<casts.length;++i) {
            String castInloop = casts[i];
            Label castName = GlyphsDude.createIconLabel( FontAwesomeIcon.USER,
                    castInloop+"",
                    "18",
                    "18",
                    ContentDisplay.LEFT );
            castName.setPadding(new Insets(0,0,0,20));
            castName.setFont(new Font("Cambria", 18));
            castName.setTextFill(Color.web("#a1a1a1"));
            vb.getChildren().addAll(castName);
        }

        hbBottom.getChildren().addAll(synopsis,vb);
        movieDetails.setBottom(hbBottom);

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
