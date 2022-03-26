package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicRectangleEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.Peg;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public abstract class RectanglePeg extends DynamicRectangleEntity implements Peg {
    private GameLevel gameLevel;
    public String spriteImagePath;
    public int entityID;

    protected RectanglePeg(Coordinate2D initialLocation, String spriteImagePath, int entityID, GameLevel gameLevel) {
        super(initialLocation);
        this.spriteImagePath = spriteImagePath;
        this.entityID = entityID;
        this.gameLevel = gameLevel;
    }
}
