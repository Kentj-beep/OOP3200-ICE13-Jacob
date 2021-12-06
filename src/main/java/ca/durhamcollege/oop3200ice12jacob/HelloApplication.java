package ca.durhamcollege.oop3200ice12jacob;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();

//        stage.setOpacity(0.5);
//        stage.setWidth(300.0);
//        stage.setHeight(200.0);
//
//        stage.setMaxWidth(600.0);
//        stage.setMaxHeight(400.0);
//
//        stage.setMinWidth(300);
//        stage.setMinHeight(200);

        // Step 1 - Create one or more controls
        Label helloLabel = new Label("Hello World!");

        Label goodbyeLabel = new Label("Good Bye!");

        Button clickMeButton = new Button("Click me");

        // Step 1.1 - configure controls
        Font font = Font.font("Consolas", FontWeight.BOLD, 20);
        clickMeButton.setFont(font);

        // Step 1.2 - For button controls (or other event-types) - set the event
        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("ClickMe Button Clicked!");

                helloLabel.setText("Clicked!");
            }
        });

        // Step 2 - Create a container
//        HBox hbox = new HBox(helloLabel, clickMeButton);
//
//        VBox vbox = new VBox(helloLabel, clickMeButton);

        GridPane gridPane = new GridPane();

        gridPane.add(helloLabel, 1, 0);
        gridPane.add(goodbyeLabel, 1, 1);
        gridPane.add(clickMeButton, 2, 2);

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