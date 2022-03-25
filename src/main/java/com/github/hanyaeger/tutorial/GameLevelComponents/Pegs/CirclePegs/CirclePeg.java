package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.Peg;

public abstract class CirclePeg extends DynamicCircleEntity implements Peg {
    protected CirclePeg(Coordinate2D initialLocation) {
        super(initialLocation);
    }
}
