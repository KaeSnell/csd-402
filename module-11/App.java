/**
 * Mikaela Snell
 * August 8th, 2025
 * M11 Assignment: JavaFX Features
 * This is a demonstration of JavaFX features BorderPane and ScrollPane.
 * With code inspiration taken from:
 * Using JavaFX UI Controls: Scroll Pane | JavaFX 2 Tutorials and Documentation. 
 * https://docs.oracle.com/javafx/2/ui_controls/scrollpane.htm 
 * And JavaFX Borderpane Layout by Tutorialspoint. 
 * https://www.tutorialspoint.com/javafx/layout_borderpane.htm 
 * @author snell
 */


package com.mycompany;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane; 
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Create BorderPane example
        BorderPane bPane = new BorderPane();
        bPane.setTop(new TextField("Top Pane -- The photo in the center pane can be moved by clicking and dragging or by using the bars --"));
        bPane.setBottom(new TextField("Bottom Pane"));
        
        // BorderPane's background style can be set to black
        bPane.setStyle("-fx-background-color: black;");
        
        bPane.setLeft(new TextField("Left Pane"));
        bPane.setRight(new TextField("Right Pane"));

        // Create ScrollPane for center, fill center with an image, let the user scroll or pan through the image
        // The image has to be saved in src/main/resources -> com.mycompany in order to work. 
        Image space = new Image(getClass().getResourceAsStream("SpacePhoto.jpg"));
        ScrollPane sp = new ScrollPane(new ImageView(space));
        sp.setPrefSize(300, 150);
        sp.setPannable(true);
        bPane.setCenter(sp);

        // Scene and stage setup
        Scene scene = new Scene(bPane, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BorderPane and ScrollPane Demo");
        primaryStage.show();
    }

    public static void main(String[] args) { 
        launch(args);
    }
}