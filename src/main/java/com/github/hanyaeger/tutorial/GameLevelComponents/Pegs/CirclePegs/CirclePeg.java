package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.Peg;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public abstract class CirclePeg extends DynamicCircleEntity implements Peg {
    private GameLevel gameLevel;
    public String spriteImagePath;
    public int entityID;

    protected CirclePeg(Coordinate2D initialLocation, String spriteImagePath, int entityID, GameLevel gameLevel) {
        super(initialLocation);
        this.spriteImagePath = spriteImagePath;
        this.entityID = entityID;
        this.gameLevel = gameLevel;
    }

    @Override
    public void onCollision(Collider collider) {

    }
}
