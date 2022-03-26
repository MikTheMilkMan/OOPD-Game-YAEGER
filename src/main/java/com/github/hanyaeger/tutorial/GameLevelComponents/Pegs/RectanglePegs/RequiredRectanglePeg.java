package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;

public class RequiredRectanglePeg extends RectanglePeg{
    public String spriteImagePath;
    public int entityID;

    protected RequiredRectanglePeg(Coordinate2D initialLocation, String spriteImagePath, int entityID) {
        super(initialLocation, spriteImagePath, entityID);
        this.spriteImagePath = spriteImagePath;
        this.entityID = entityID;
    }

    @Override
    public void onCollision(Collider collider) {

    }
}
