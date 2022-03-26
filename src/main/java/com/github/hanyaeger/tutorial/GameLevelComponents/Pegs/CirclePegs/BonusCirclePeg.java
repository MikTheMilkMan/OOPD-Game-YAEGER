package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;

public class BonusCirclePeg extends CirclePeg{
    public String spriteImagePath;
    public int entityID;

    public BonusCirclePeg(Coordinate2D initialLocation, String spriteImagePath, int entityID) {
        super(initialLocation, spriteImagePath, entityID);
        this.spriteImagePath = spriteImagePath;
        this.entityID = entityID;
    }

    @Override
    public void onCollision(Collider collider) {

    }
}
