package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.Peg;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public abstract class RectanglePeg extends SpriteEntity implements Peg {
    public static GameLevel pegGameLevel;

    protected RectanglePeg(String text, Coordinate2D initialLocation, Size size) {
        super(text, initialLocation, size);
    }
}
