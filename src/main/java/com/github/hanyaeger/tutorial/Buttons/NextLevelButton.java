package com.github.hanyaeger.tutorial.Buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.Quaggle;
import javafx.scene.input.MouseButton;

public class NextLevelButton extends Button {
    int level;
    Quaggle quaggle;
    public NextLevelButton(Coordinate2D initialLocation, Quaggle quaggle, String caption, int level) {
        super(initialLocation, quaggle, caption);
        this.quaggle = quaggle;
        this.level = level;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        quaggle.setActiveScene(level);
    }
}
