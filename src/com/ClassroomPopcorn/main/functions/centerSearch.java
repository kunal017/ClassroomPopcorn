package com.ClassroomPopcorn.main.functions;

import com.ClassroomPopcorn.database.getMovies.movieDetails;
import com.ClassroomPopcorn.main.windows.home.main;


import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class centerSearch {

    public static BorderPane centerSearch(){
        final BooleanProperty firstTime = new SimpleBooleanProperty(true); // Variable to store the focus on stage load

        BorderPane searchLayout = new BorderPane();
        searchLayout.setPadding(new Insets(70,0,0,0));
        searchLayout.setStyle("-fx-background-color: #171717;");

        //=================================================================================
        VBox searchVB = new VBox(15);
        searchVB.setAlignment(Pos.TOP_CENTER);

        Label searchLabel = new Label("Search Term: ");
        searchLabel.setTextFill(Color.web("#fff"));
        searchLabel.setFont(new Font("Cambria", 25));
        searchLabel.setTextFill(Color.web("#5a5a5a"));

        //=================================================================================
        HBox searchRow = new HBox(25);
        searchRow.setAlignment(Pos.TOP_CENTER);

        TextField searchBox = new TextField();
        searchBox.setPromptText("By movie name, cast, director, etc.");
        searchBox.setStyle("-fx-focus-color: transparent;");
        searchBox.setPrefColumnCount(35);
        searchBox.setPrefHeight(35);
        searchBox.focusedProperty().addListener((observable,  oldValue,  newValue) -> {
            if(newValue && firstTime.get()){
                searchLayout.requestFocus(); // Delegate the focus to container
                firstTime.setValue(false); // Variable value changed for future references
            }
        });

        Button searchButton = new Button("Search");
        searchButton.setStyle("-fx-focus-color: transparent;");
        searchButton.setFont(new Font("Cambria", 18));
        searchButton.setStyle("-fx-background-color: #6ac045;");
        searchButton.setTextFill(Color.web("#fff"));

        main.scene.getAccelerators().put(
                new KeyCodeCombination(KeyCode.ENTER),
                () -> searchButton.fire()
        );

        searchRow.getChildren().addAll(searchBox,searchButton);

        //=================================================================================
        HBox filterRow = new HBox(25);
        filterRow.setAlignment(Pos.TOP_CENTER);

        VBox genreCollection = new VBox(10);
        Label genreLabel = new Label("Genre: ");
        genreLabel.setFont(new Font("Cambria", 20));
        genreLabel.setTextFill(Color.web("#5a5a5a"));
        ComboBox genreComboBox = new ComboBox();
        genreComboBox.getItems().addAll(
                "All",
                "Absurdist/surreal/whimsical",
                "Action",
                "Adventure",
                "Comedy",
                "Crime",
                "Drama",
                "Fantasy",
                "Historical",
                "Historical fiction",
                "Horror",
                "Magical realism",
                "Mystery",
                "Paranoid",
                "Philosophical",
                "Political",
                "Romance",
                "Saga",
                "Satire",
                "Science fiction",
                "Slice of Life",
                "Speculative",
                "Thriller",
                "Urban",
                "Western"
        );
        genreComboBox.getSelectionModel().selectFirst();
        genreCollection.getChildren().addAll(genreLabel,genreComboBox);

        VBox ratingCollection = new VBox(10);
        Label ratingLabel = new Label("Rating: ");
        ratingLabel.setFont(new Font("Cambria", 20));
        ratingLabel.setTextFill(Color.web("#5a5a5a"));
        ComboBox ratingComboBox = new ComboBox();
        ratingComboBox.getItems().addAll(
                "All",
                "9+",
                "8+",
                "7+",
                "6+",
                "5+",
                "4+",
                "3+",
                "2+",
                "1+"
        );
        ratingComboBox.getSelectionModel().selectFirst();
        ratingCollection.getChildren().addAll(ratingLabel,ratingComboBox);

        VBox orderCollection = new VBox(10);
        Label orderLabel = new Label("order By: ");
        orderLabel.setFont(new Font("Cambria", 20));
        orderLabel.setTextFill(Color.web("#5a5a5a"));
        ComboBox orderComboBox = new ComboBox();
        orderComboBox.getItems().addAll(
                "Latest",
                "Oldest",
                "Likes",
                "Alphabetical",
                "Downloads"
        );
        orderComboBox.getSelectionModel().selectFirst();
        orderCollection.getChildren().addAll(orderLabel,orderComboBox);

        filterRow.getChildren().addAll(genreCollection,ratingCollection,orderCollection);

        //=================================================================================
        searchVB.getChildren().addAll(searchLabel, searchRow, filterRow);
        searchVB.setPadding(new Insets(0,0,50,0));

        final BorderPane searchResult = new BorderPane(movieDetails.movieDetails("ORDER BY yearOfRelease desc"));
        searchButton.setOnAction(e->{

            String condition;
            String genre = genreComboBox.getValue().toString();
            genre = genre.equals("All") ? "" : genre;

            String rate = ratingComboBox.getValue().toString();
            rate = rate.charAt(0)=='A' ? "1" :  rate.charAt(0)+"";

            if (genre.equals(""))
                condition="WHERE IMDB>"+rate;
            else
                condition="WHERE IMDB>"+rate+" AND genre LIKE '%"+genre+"%'";

            if (!searchBox.getText().isEmpty())
                condition = condition+" AND movieName LIKE '%"+searchBox.getText()+"%'";

            String orderBy = orderComboBox.getValue().toString();
            if (orderBy.equals("Latest"))
                condition = condition + " ORDER BY yearOfRelease desc";
            else if (orderBy.equals("Oldest"))
                condition = condition + " ORDER BY yearOfRelease asc";
            else if (orderBy.equals("Likes"))
                condition = condition + " ORDER BY likes desc";
            else if (orderBy.equals("Alphabetical"))
                condition = condition + " ORDER BY movieName desc";
            else if (orderBy.equals("Downloads"))
                condition = condition + " ORDER BY downloads desc";

            searchResult.getChildren().clear();
            searchResult.setCenter(movieDetails.movieDetails(condition));

            searchBox.requestFocus(); // Delegate the focus to container
        });
        searchResult.setStyle("-fx-background-color: #1d1d1d;");
        searchResult.setPadding(new Insets(0,100,20,100));

        searchLayout.setTop(searchVB);
        searchLayout.setBottom(searchResult);

        return searchLayout;
    }
}
