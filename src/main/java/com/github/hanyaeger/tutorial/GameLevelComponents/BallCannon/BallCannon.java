package com.github.hanyaeger.tutorial.GameLevelComponents.BallCannon;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.CursorEntity;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public class BallCannon extends DynamicCompositeEntity {
    private GameLevel gameLevel;
    private Coordinate2D attachedLoction;
    private CursorEntity cursor;

    public BallCannonShaft cannonShaft;
    private BallCannonBase cannonBase;

    public BallCannon(Coordinate2D attachedLocation, GameLevel gameLevel, CursorEntity cursor){
        super(attachedLocation);
        this.gameLevel = gameLevel;
        this.attachedLoction = attachedLocation;
        this.cursor = cursor;
    }

    @Override
    protected void setupEntities() {
        cannonBase = new BallCannonBase(new Coordinate2D(getWidth() / 2, 70));
        addEntity(cannonBase);

        cannonShaft = new BallCannonShaft(new Coordinate2D(getWidth() / 2 + cannonBase.getRadius(), 50 + (cannonBase.getRadius() * 1.5)), this, cursor);
        cannonShaft.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(cannonShaft);
    }
}
