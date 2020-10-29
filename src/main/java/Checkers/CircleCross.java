package Checkers;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javax.swing.*;

public class CircleCross extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.WHITE);

        GridPane gridPane = new GridPane();
        GridPane.setColumnIndex(null, );

        Rectangle r1 = new Rectangle(200, 0, 10, 600);
        r1.setFill(Color.BLACK);
        Rectangle r2 = new Rectangle(400, 0, 10, 600);
        r2.setFill(Color.BLACK);
        Rectangle r3 = new Rectangle(0, 200, 600, 10);
        r3.setFill(Color.BLACK);
        Rectangle r4 = new Rectangle(0, 400, 600, 10);
        r4.setFill(Color.BLACK);

        root.getChildren().addAll(r1, r2, r3, r4);

        primaryStage.setTitle("CircleCross");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
