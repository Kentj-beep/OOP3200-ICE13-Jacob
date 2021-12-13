package ca.durhamcollege.oop3200ice13jacob;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application {

    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Hello World");

        // Step 1 - Create one or more controls
        Label imageLabel = new Label("Bear!");

        Button clickMeButton = new Button("Click me");
        clickMeButton.setStyle("-fx-font-family: Arial");

        FileInputStream imagePath = new FileInputStream("src/main/java/ca/durhamcollege/oop3200ice13jacob/bear.PNG");

        // Step 1 (images) - load image
        Image bear = new Image(imagePath);

        // Step 2 (images) - setup image view
        ImageView animalImageView = new ImageView(bear);
        animalImageView.setFitWidth(200);
        animalImageView.setPreserveRatio(true);


        FileInputStream fishPath = new FileInputStream("src/main/java/ca/durhamcollege/oop3200ice13jacob/KyleFish.png");
        Image fish = new Image(fishPath);
//        ImageView fishImageView = new ImageView(fish);

        // Step 1.1 - configure controls
//        Font font = Font.font("Consolas", FontWeight.BOLD, 20);
//        clickMeButton.setFont(font);

        class ButtonClickHandler implements EventHandler<ActionEvent>
        {
            @Override
            public void handle(ActionEvent event)
            {
                imageLabel.setText("Fish!");
                animalImageView.setImage(fish);
            }
        }

        clickMeButton.setOnAction(new ButtonClickHandler());

        // Step 1.2 - For button controls (or other event-types) - set the event
//        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
////                System.out.println("ClickMe Button Clicked!");
//
//                imageLabel.setText("Fish!");
//                animalImageView.setImage(fish);
//            }
//        });

        // Step 2 - Create a container

        HBox hbox = new HBox(10, imageLabel);
//        hbox.setAlignment(Pos.CENTER);
        hbox.setStyle("-fx-alignment: center;");
//        hbox.setStyle("-fx-alignment: center");


        HBox hbox2 = new HBox(10, animalImageView);
//        hbox2.setAlignment(Pos.CENTER);
//        hbox2.setStyle("-fx-border-color: black");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(6, 8);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10));

        gridPane.add(hbox, 0, 0);
        gridPane.add(hbox2, 0, 1);
//        gridPane.add(bearImageView, 0, 2);
        gridPane.add(clickMeButton, 2, 2);

        gridPane.setStyle("-fx-border-color: black; -fx-font-size: 20; -fx-font-family: Consolas;");

        // Step 3 - Add layout container to scene
        Scene sceneICE = new Scene(gridPane, WIDTH, HEIGHT);

        // Step 4 - Add scene to stage

        stage.setScene(sceneICE);

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}