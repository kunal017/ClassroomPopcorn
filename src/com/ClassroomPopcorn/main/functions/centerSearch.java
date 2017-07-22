package com.ClassroomPopcorn.main.functions;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class centerSearch {

    public static BorderPane centerSearch(){
        BorderPane searchLayout = new BorderPane();
        searchLayout.setPadding(new Insets(70,20,40,20));
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
//        searchBox.setStyle("-fx-background-color: #282828;");
        searchBox.setPrefColumnCount(35);
        searchBox.setPrefHeight(35);

        Button searchButton = new Button("Search");
        searchButton.setFont(new Font("Cambria", 18));
        searchButton.setStyle("-fx-background-color: #6ac045;");
        searchButton.setTextFill(Color.web("#fff"));

        searchRow.getChildren().addAll(searchBox,searchButton);

        //=================================================================================
        HBox filterRow = new HBox(25);
        filterRow.setAlignment(Pos.TOP_CENTER);

        VBox genreCollection = new VBox(10);
        Label genreLabel = new Label("Genre: ");
        genreLabel.setFont(new Font("Cambria", 20));
        genreLabel.setTextFill(Color.web("#5a5a5a"));
        ComboBox genreComboBox = new ComboBox();
//        genreComboBox.setStyle("-fx-background-color: #282828;");
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
//        ratingComboBox.setStyle("-fx-background-color: #282828;");
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
//        orderComboBox.setStyle("-fx-background-color: #282828;");
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

        searchLayout.setCenter(searchVB);

        return searchLayout;
    }
}
