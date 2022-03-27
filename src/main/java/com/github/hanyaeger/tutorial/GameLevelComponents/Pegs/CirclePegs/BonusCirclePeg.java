package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;

public class BonusCirclePeg extends CirclePeg {
    public BonusCirclePeg(Coordinate2D initialLocation, Size size, String text) {
        super(text, initialLocation, size);
    }

    @Override
    public void onCollision(Collider collider) {
    }
}
