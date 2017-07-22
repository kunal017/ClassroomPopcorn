package com.ClassroomPopcorn.main.functions;

import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class header {

    public static BorderPane header(){
        BorderPane headerlayout = new BorderPane();
        headerlayout.setPadding(new Insets(20,30,0,30));

        Label label = new Label("Welcome to Classroom Popcorn");
        label.setFont(new Font("Cambria", 32));
        label.setTextFill(Color.web("#ededed"));
        headerlayout.setLeft(label);

        HBox headerVB = new HBox();
        headerVB.setPadding(new Insets(10,10,0,0));
        headerVB.setSpacing(-10);

        TextField name = new TextField();
        name.setPromptText("Movie name");
        name.setPrefColumnCount(15);

        Button quickSearch = GlyphsDude.createIconButton(FontAwesomeIcon.SEARCH);
        Tooltip text = new Tooltip("Quick Search");
        new hackTooltipStartTiming(text);
        quickSearch.setTooltip(text);

        headerVB.getChildren().addAll(name,quickSearch);

        headerlayout.setRight(headerVB);

        return  headerlayout;
    }
}
