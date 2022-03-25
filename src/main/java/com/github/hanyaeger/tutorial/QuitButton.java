package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;

public class QuitButton extends Button {
    private Quaggle quaggle;

    public QuitButton(Coordinate2D initialLocation, Quaggle quaggle, String caption) {
        super(initialLocation, quaggle, caption);
        this.quaggle = quaggle;
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
        quaggle.quit();
    }
}
