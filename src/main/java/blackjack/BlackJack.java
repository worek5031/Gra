package blackjack;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BlackJack extends Application {

    private Image imageback = new Image("file:src/main/resources/Sukno.jpg");
    private Image card = new Image("file:src/main/resources/AsPik.png");
    private Image roni = new Image("file:src/main/resources/Ronaldo.jpg");
    private FlowPane cards = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(600, 600, true, true, true, true);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_RIGHT);
        grid.setPadding(new Insets(0, 0, 0, 0));
        grid.setHgap(5.5);
        grid.setVgap(5.5);


        grid.setBackground(background);

        ImageView img = new ImageView(card);
        img.setFitHeight(160);
        img.setFitWidth(100);
        ImageView ron = new ImageView(roni);
        ron.setFitWidth(100);
        ron.setFitHeight(160);


        cards.getChildren().addAll(img, ron);

        grid.add(cards, 0, 0, 1, 1);

        Scene scene = new Scene(grid, 600, 600,Color.BLACK);

        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

