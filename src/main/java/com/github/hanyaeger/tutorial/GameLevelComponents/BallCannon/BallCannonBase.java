package com.github.hanyaeger.tutorial.GameLevelComponents.BallCannon;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.CircleEntity;

public class BallCannonBase extends CircleEntity {
    protected BallCannonBase(Coordinate2D initialLocation) {
        super(initialLocation);
        setRadius(40);
    }
}
