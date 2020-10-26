package Checkers;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Checkers extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 720, 720, Color.BLACK);

        Rectangle r0 = new Rectangle(0, 0, 90, 90);
        r0.setFill(Color.WHITE);
        Rectangle r1 = new Rectangle(180, 0, 90, 90);
        r1.setFill(Color.WHITE);
        Rectangle r2 = new Rectangle(360, 0, 90, 90);
        r2.setFill(Color.WHITE);
        Rectangle r3 = new Rectangle(540, 0, 90, 90);
        r3.setFill(Color.WHITE);
        Rectangle r4 = new Rectangle(90, 90, 90, 90);
        r4.setFill(Color.WHITE);
        Rectangle r5 = new Rectangle(270, 90, 90, 90);
        r5.setFill(Color.WHITE);
        Rectangle r6 = new Rectangle(450, 90, 90, 90);
        r6.setFill(Color.WHITE);
        Rectangle r7 = new Rectangle(630, 90, 90, 90);
        r7.setFill(Color.WHITE);
        Rectangle r8 = new Rectangle(0, 180, 90, 90);
        r8.setFill(Color.WHITE);
        Rectangle r9 = new Rectangle(180, 180, 90, 90);
        r9.setFill(Color.WHITE);
        Rectangle r10 = new Rectangle(360, 180, 90, 90);
        r10.setFill(Color.WHITE);
        Rectangle r11 = new Rectangle(540, 180,  90, 90);
        r11.setFill(Color.WHITE);
        Rectangle r12 = new Rectangle(90, 270, 90, 90);
        r12.setFill(Color.WHITE);
        Rectangle r13 = new Rectangle(270, 270, 90, 90);
        r13.setFill(Color.WHITE);
        Rectangle r14 = new Rectangle(450, 270, 90, 90);
        r14.setFill(Color.WHITE);
        Rectangle r15 = new Rectangle(630, 270, 90, 90);
        r15.setFill(Color.WHITE);
        Rectangle r16 = new Rectangle(0, 360, 90, 90);
        r16.setFill(Color.WHITE);
        Rectangle r17 = new Rectangle(180, 360, 90, 90);
        r17.setFill(Color.WHITE);
        Rectangle r18 = new Rectangle(360, 360, 90, 90);
        r18.setFill(Color.WHITE);
        Rectangle r19 = new Rectangle(540, 360, 90, 90);
        r19.setFill(Color.WHITE);
        Rectangle r20 = new Rectangle(90, 450, 90, 90);
        r20.setFill(Color.WHITE);
        Rectangle r21 = new Rectangle(270, 450, 90, 90);
        r21.setFill(Color.WHITE);
        Rectangle r22 = new Rectangle(450, 450,  90, 90);
        r22.setFill(Color.WHITE);
        Rectangle r23 = new Rectangle(630, 450,  90, 90);
        r23.setFill(Color.WHITE);
        Rectangle r24 = new Rectangle(0, 540,  90, 90);
        r24.setFill(Color.WHITE);
        Rectangle r25 = new Rectangle(180, 540,  90, 90);
        r25.setFill(Color.WHITE);
        Rectangle r26 = new Rectangle(360, 540,  90, 90);
        r26.setFill(Color.WHITE);
        Rectangle r27 = new Rectangle(540, 540, 90, 90);
        r27.setFill(Color.WHITE);
        Rectangle r28 = new Rectangle(90, 630, 90, 90);
        r28.setFill(Color.WHITE);
        Rectangle r29 = new Rectangle(270, 630, 90, 90);
        r29.setFill(Color.WHITE);
        Rectangle r30 = new Rectangle(450, 630, 90, 90);
        r30.setFill(Color.WHITE);
        Rectangle r31 = new Rectangle(630,630, 90, 90);
        r31.setFill(Color.WHITE);


        root.getChildren().addAll(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r30);

        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
