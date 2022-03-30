package com.github.hanyaeger.tutorial.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.Quaggle;
import javafx.scene.input.MouseButton;

public class RetryButton extends Button {
    private final  Quaggle quaggle;
    private final  int lastLevel;
    public RetryButton(Coordinate2D initialLocation, Quaggle quaggle, String caption, int lastLevel) {
        super(initialLocation, quaggle, caption);
        this.quaggle = quaggle;
        this.lastLevel = lastLevel;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        quaggle.setActiveScene(lastLevel);
    }
}
