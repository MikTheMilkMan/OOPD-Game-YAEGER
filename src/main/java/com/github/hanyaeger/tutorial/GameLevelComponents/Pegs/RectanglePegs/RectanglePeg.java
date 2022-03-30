package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.Peg;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public abstract class RectanglePeg extends RectangleEntity implements Peg {
    public static GameLevel gameLevel;
    private Coordinate2D location;
    boolean isHit = false;

    protected RectanglePeg(Coordinate2D initialLocation, Size size) {
        super(initialLocation);
        this.location = initialLocation;

        setHeight(20);
        setWidth(40);
    }

    public void onCollision(Collider collider) {
        remove();
    }
}
