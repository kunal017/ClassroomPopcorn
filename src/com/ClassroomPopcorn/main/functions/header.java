package com.ClassroomPopcorn.main.functions;

import com.ClassroomPopcorn.main.windows.login.userLogin;
import com.ClassroomPopcorn.main.windows.signUp.userSignUp;

import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class header {

    public static BorderPane header(){
        BorderPane headerlayout = new BorderPane();
        headerlayout.setPadding(new Insets(20,30,0,30));
        headerlayout.setStyle("-fx-background-color: #1d1d1d;");

        Label label = new Label("Welcome to Classroom Popcorn");
        label.setFont(new Font("Cambria", 32));
        label.setTextFill(Color.web("#ededed"));
        headerlayout.setLeft(label);

        HBox headerVB = new HBox(10);
        headerVB.setPadding(new Insets(6,10,0,0));
//        headerVB.setSpacing(-10);

        Label username = GlyphsDude.createIconLabel( FontAwesomeIcon.USER,
                "User",
                "16",
                "18",
                ContentDisplay.LEFT );
        username.setFont(new Font("Cambria", 20));
        username.setTextFill(Color.web("#ededed"));

        Label login = GlyphsDude.createIconLabel( FontAwesomeIcon.SIGN_IN,
                "Login |",
                "16",
                "18",
                ContentDisplay.LEFT );
        login.setFont(new Font("Cambria", 20));
        login.setTextFill(Color.web("#ededed"));

        Label register = GlyphsDude.createIconLabel( FontAwesomeIcon.USER_PLUS,
                "Register",
                "16",
                "18",
                ContentDisplay.LEFT );
        register.setFont(new Font("Cambria", 20));
        register.setTextFill(Color.web("#ededed"));

        Label logout = GlyphsDude.createIconLabel( FontAwesomeIcon.SIGN_OUT,
                "Log Out",
                "16",
                "18",
                ContentDisplay.LEFT );
        logout.setFont(new Font("Cambria", 20));
        logout.setTextFill(Color.web("#ededed"));

        login.setOnMouseClicked(e->{
            userLogin ob = new userLogin();
            String name = ob.userLogin();

            if (!name.equals("")){
                username.setText(name);

                headerVB.getChildren().clear();
                headerVB.getChildren().addAll(username,logout);
            }
        });

        register.setOnMouseClicked(e->{
            userSignUp ob = new userSignUp();
            String name = ob.userSignUp();

            if (!name.equals("")){
                username.setText(name);

                headerVB.getChildren().clear();
                headerVB.getChildren().addAll(username,logout);
            }
        });

        logout.setOnMouseClicked(e-> {
            headerVB.getChildren().clear();
            headerVB.getChildren().addAll(login,register);
        });

        //If user not logged in
        if (!false){
            headerVB.getChildren().clear();
            headerVB.getChildren().addAll(login,register);
        }

        headerlayout.setRight(headerVB);

        return  headerlayout;
    }
}
