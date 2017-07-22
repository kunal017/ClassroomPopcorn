package com.ClassroomPopcorn.main.windows.main;

import com.ClassroomPopcorn.main.functions.header;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class main extends Application {
    public static Stage window;
    public BorderPane layout;
    public static Scene scene;

    public static void main(String args[])
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("Classroom Popcorn");

        BorderPane topLayout = header.header();

        layout = new BorderPane();
        layout.setTop(topLayout);

        scene = new Scene(layout,600,500);
        window.setScene(scene);

        scene.getStylesheets().add(main.class.getResource("../../resources/css/main.css").toExternalForm());
        window.getIcons().add(new Image(getClass().getResourceAsStream("../../resources/images/ClassroomPopcorn.png")));

        window.show();
        window.setOnCloseRequest(e->{System.exit(0);});

    }
}