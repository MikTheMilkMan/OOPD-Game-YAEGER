package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;

public class RegularRectanglePeg extends RectanglePeg{
    public String spriteImagePath;
    public int entityID;

    protected RegularRectanglePeg(Coordinate2D initialLocation, String spriteImagePath, int entityID) {
        super(initialLocation, spriteImagePath, entityID);
        this.spriteImagePath = spriteImagePath;
        this.entityID = entityID;
    }

    @Override
    public void onCollision(Collider collider) {

    }
}
