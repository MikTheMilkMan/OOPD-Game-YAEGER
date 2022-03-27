package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.Peg;

public abstract class CirclePeg extends SpriteEntity implements Peg {
    protected CirclePeg(String text, Coordinate2D initialLocation, Size size) {
        super(text, initialLocation, size);
    }

    @Override
    public void onCollision(Collider collider) {
    }
}
