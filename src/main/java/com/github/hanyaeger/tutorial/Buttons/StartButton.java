package com.github.hanyaeger.tutorial.Buttons;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.Quaggle;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StartButton extends Button {
    private final  Quaggle quaggle;

    public StartButton(Coordinate2D initialLocation, Quaggle quaggle) {
        super(initialLocation, quaggle, "Start Game");
        this.quaggle = quaggle;

        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setFill(Color.PINK);
        setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30));
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        quaggle.setActiveScene(0);
    }
}
