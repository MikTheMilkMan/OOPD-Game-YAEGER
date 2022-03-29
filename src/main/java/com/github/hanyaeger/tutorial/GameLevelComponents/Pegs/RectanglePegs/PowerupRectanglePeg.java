package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;
import javafx.scene.paint.Color;

public class PowerupRectanglePeg extends RectanglePeg {
    public PowerupRectanglePeg(Coordinate2D initialLocation, Size size) {
        super(initialLocation, size);
        setFill(Color.GREEN);
    }


}
