package com.github.hanyaeger.tutorial.GameLevelComponents;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public class Ball extends DynamicCircleEntity implements Collider, Newtonian, SceneBorderTouchingWatcher {
    private GameLevel gameLevel;

    protected Ball(Coordinate2D initialLocation, GameLevel gameLevel) {
        super(initialLocation);
        this.gameLevel = gameLevel;
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {

    }
}
