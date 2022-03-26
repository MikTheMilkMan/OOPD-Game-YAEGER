package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicRectangleEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.Peg;

public abstract class RectanglePeg extends DynamicRectangleEntity implements Peg {
    public String spriteImagePath;
    public int entityID;

    protected RectanglePeg(Coordinate2D initialLocation, String spriteImagePath, int entityID) {
        super(initialLocation);
        this.spriteImagePath = spriteImagePath;
        this.entityID = entityID;
    }
}
