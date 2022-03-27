package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public class PowerupRectanglePeg extends RectanglePeg {
    private GameLevel gameLevel;
    public String spriteImagePath;
    public int entityID;

    protected PowerupRectanglePeg(Coordinate2D initialLocation, String spriteImagePath, int entityID, GameLevel gameLevel) {
        super(initialLocation, spriteImagePath, entityID, gameLevel);
        this.spriteImagePath = spriteImagePath;
        this.entityID = entityID;
        this.gameLevel = gameLevel;
    }

    @Override
    public void onCollision(Collider collider) {
        gameLevel.currentScore += pointsForPeg;
    }
}
