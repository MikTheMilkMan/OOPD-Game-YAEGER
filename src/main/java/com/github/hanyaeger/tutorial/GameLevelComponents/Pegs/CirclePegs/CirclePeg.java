package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.CircleEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.Peg;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public abstract class CirclePeg extends CircleEntity implements Peg {
    public static GameLevel gameLevel;
    private Coordinate2D location;
    boolean isHit = false;

    protected CirclePeg(Coordinate2D initialLocation, Size size) {
        super(initialLocation);
        this.location = initialLocation;

        setRadius(10);
    }

    public void onCollision(Collider collider) {
        remove();
    }
}


