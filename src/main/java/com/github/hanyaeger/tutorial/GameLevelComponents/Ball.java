package com.github.hanyaeger.tutorial.GameLevelComponents;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public class Ball extends DynamicCircleEntity implements Collided, Newtonian, SceneBorderTouchingWatcher {
    private GameLevel gameLevel;
    private CursorEntity cursor;

    public Ball(Coordinate2D initialLocation, GameLevel gameLevel, CursorEntity cursor) {
        super(initialLocation);
        setRadius(10);
        this.gameLevel = gameLevel;
        this.cursor = cursor;

        setGravityDirection(0);
        setFrictionConstant(0.004);
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        var angle = angleTo(getLocationInScene());
        var speed = getSpeed();

        if (sceneBorder == SceneBorder.BOTTOM) {
            invertSpeedInDirection(angle);
        } else if (sceneBorder == SceneBorder.TOP) {
            invertSpeedInDirection(angle - 180);
        } else if (sceneBorder == SceneBorder.LEFT) {
            invertSpeedInDirection(angle - Direction.RIGHT.getValue());
        } else if (sceneBorder == SceneBorder.RIGHT) {
            invertSpeedInDirection(angle + Direction.RIGHT.getValue());
        }
        setSpeed(speed);
    }

    @Override
    public void onCollision(Collider collider) {
    }
}
