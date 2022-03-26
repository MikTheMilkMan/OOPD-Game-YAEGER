package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public class BonusCirclePeg extends CirclePeg {
    private GameLevel gameLevel;
    public String spriteImagePath;
    public int entityID;

    public BonusCirclePeg(Coordinate2D initialLocation, String spriteImagePath, int entityID, GameLevel gameLevel) {
        super(initialLocation, spriteImagePath, entityID, gameLevel);
        this.spriteImagePath = spriteImagePath;
        this.entityID = entityID;
        this.gameLevel = gameLevel;
    }

    @Override
    public void onCollision(Collider collider) {

    }
}
