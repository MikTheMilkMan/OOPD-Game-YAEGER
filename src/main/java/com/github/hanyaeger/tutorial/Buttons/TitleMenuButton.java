package com.github.hanyaeger.tutorial.Buttons;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.Quaggle;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleMenuButton extends Button{
    private Quaggle quaggle;

    public TitleMenuButton(Coordinate2D initialLocation, Quaggle quaggle) {
        super(initialLocation, quaggle, "Return to Menu");
        this.quaggle = quaggle;

        setFill(Color.PINK);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30));
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        quaggle.setActiveScene(1);
    }
}
