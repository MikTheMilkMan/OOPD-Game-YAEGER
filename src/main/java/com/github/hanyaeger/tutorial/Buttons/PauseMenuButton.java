package com.github.hanyaeger.tutorial.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.Quaggle;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;

public class PauseMenuButton extends Button {
    public PauseMenuButton(Coordinate2D initialLocation, Quaggle quaggle, String caption){
        super(initialLocation, quaggle, caption);
    }

    @Override
    public void onMouseEntered() {
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setCursor(Cursor.DEFAULT);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }
}
