package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.RectanglePeg;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public class PowerupCirclePeg extends CirclePeg {
    public PowerupCirclePeg(Coordinate2D initialLocation, Size size, String text) {
        super(text, initialLocation, size);
    }

    @Override
    public void onCollision(Collider collider) {

    }
}
