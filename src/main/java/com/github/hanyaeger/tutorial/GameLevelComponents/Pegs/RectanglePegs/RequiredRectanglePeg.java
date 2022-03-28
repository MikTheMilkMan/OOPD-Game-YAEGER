package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public class RequiredRectanglePeg extends RectanglePeg {
    public RequiredRectanglePeg(Coordinate2D initialLocation, Size size, String text) {
        super(text, initialLocation, size);
    }

    @Override
    public void onCollision(Collider collider) {
        pegGameLevel.currentScore += (pointsForPeg * 3);
    }
}
