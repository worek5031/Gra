package Checkers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Warcaby extends Application {

    private final Image backgroundimg = new Image("file:src/main/resources/Chessboard.jpg");
    private Image counter = new Image("file:src/main/resources/counter.jpg");
    private FlowPane counters = new FlowPane();

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundsize = new BackgroundSize(600, 600, true, true, true, false);
        BackgroundImage backgroundimage = new BackgroundImage(backgroundimg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        Background background = new Background(backgroundimage);


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(0, 0, 0, 0));
        grid.setVgap(5);
        grid.setHgap(5);
        grid.setBackground(background);

        ImageView chequer = new ImageView(counter);
        Scene scene = new Scene(grid, 600, 600, Color.WHITE);

        counters.getChildren().add(chequer);

        primaryStage.setTitle("Warcaby");
        primaryStage.setScene(scene);
        primaryStage.show();

            }
}
