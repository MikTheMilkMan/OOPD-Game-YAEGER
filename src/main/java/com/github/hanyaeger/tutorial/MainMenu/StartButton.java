package com.github.hanyaeger.tutorial.MainMenu;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.tutorial.Button;
import com.github.hanyaeger.tutorial.Quaggle;
import javafx.scene.input.MouseButton;

public class StartButton extends Button {
    private Quaggle quaggle;

    public StartButton(Coordinate2D initialLocation, Quaggle quaggle, String caption, int boundscene) {
        super(initialLocation, quaggle, caption, boundscene);
        this.quaggle = quaggle;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        quaggle.setActiveScene(1);
    }

    @Override
    public void onMouseEntered() {

    }

    @Override
    public void onMouseExited() {

    }


}
