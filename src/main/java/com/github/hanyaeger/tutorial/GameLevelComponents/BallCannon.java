package com.github.hanyaeger.tutorial.GameLevelComponents;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;
import javafx.scene.Node;

import java.util.Optional;

public class BallCannon extends SpriteEntity implements MouseMovedListener {
    private GameLevel gameLevel;

    public BallCannon(Coordinate2D initialLocation, GameLevel gameLevel, String spriteImgPath){
        super(spriteImgPath, initialLocation);
        this.gameLevel = gameLevel;
    }

    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {

    }

    @Override
    public Optional<? extends Node> getNode() {
        return Optional.empty();
    }
}
