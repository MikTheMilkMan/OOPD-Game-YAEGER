package com.github.hanyaeger.tutorial.GameLevelComponents.BallCannon;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.userinput.MouseButtonReleasedListener;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import com.github.hanyaeger.tutorial.GameLevelComponents.Ball;
import com.github.hanyaeger.tutorial.GameLevelComponents.CursorEntity;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;

public class BallCannon extends DynamicCompositeEntity implements MouseButtonReleasedListener, MouseMovedListener {
    private GameLevel gameLevel;
    private Coordinate2D attachedLoction;
    private BallCannonShaft cannonShaft;
    private BallCannonBase cannonBase;
    private CursorEntity cursor;

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

    @Override
    public void onMouseButtonReleased(MouseButton mouseButton, Coordinate2D coordinate2D) {
        addEntity(new Ball(new Coordinate2D(getWidth() / 2, 100), gameLevel));
    }

    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {

    }
}
