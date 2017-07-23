package com.ClassroomPopcorn.main.windows.signUp;

import com.ClassroomPopcorn.main.windows.home.main;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class userSignUp {

    public String userSignUp(){
        final BooleanProperty firstTime = new SimpleBooleanProperty(true); // Variable to store the focus on stage load

        Stage loginStage = new Stage();
        loginStage.setTitle("Classroom Popcorn Signup");
        loginStage.initModality(Modality.APPLICATION_MODAL);

        BorderPane loginPane = new BorderPane();
        loginPane.setPadding(new Insets(50,20,20,20));

        HBox loginHeader = new HBox();

        loginHeader.setAlignment(Pos.BASELINE_CENTER);
        Label header = new Label("Log In");
        header.setFont(new Font("Cambria", 25));
        header.setTextFill(Color.web("#fff"));
        loginHeader.getChildren().add(header);

        loginPane.setTop(loginHeader);

        VBox vb = new VBox(15);
        vb.setPadding(new Insets(50,20,-20,20));

        TextField username = new TextField();
        username.setPromptText("username or email address");
        username.setStyle("-fx-border-radius: 100");
        username.focusedProperty().addListener((observable,  oldValue,  newValue) -> {
            if(newValue && firstTime.get()){
                loginPane.requestFocus(); // Delegate the focus to container
                firstTime.setValue(false); // Variable value changed for future references
            }
        });

        PasswordField password = new PasswordField();
        password.setPromptText("password");
        password.setStyle("-fx-border-radius: 100");

        vb.getChildren().addAll(username,password);

        loginPane.setCenter(vb);

        HBox loginRow = new HBox();
        Button loginButtton = new Button("Login");
        loginButtton.setFont(new Font("Cambria", 18));
        loginButtton.setStyle("-fx-focus-color: transparent;-fx-background-color: #6ac045;");
        loginButtton.setTextFill(Color.web("#fff"));
        loginRow.getChildren().addAll(loginButtton);
        loginRow.setAlignment(Pos.BASELINE_CENTER);

        loginPane.setBottom(loginRow);

        Scene loginScene = new Scene(loginPane,400,300);

        loginScene.getStylesheets().add(main.class.getResource("../../resources/css/main.css").toExternalForm());
        loginStage.getIcons().add(new Image(getClass().getResourceAsStream("../../resources/images/ClassroomPopcorn.png")));

        loginStage.setScene(loginScene);
        loginStage.setResizable(false);
        loginStage.showAndWait();

        if (true)
            return "Shubham Madheysia";
        else return "";
    }

}
