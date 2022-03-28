package com.github.hanyaeger.tutorial.GameLevelComponents;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.YaegerEntity;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.*;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.*;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public class PegTileMap extends TileMap {
    private final GameLevel gameLevel;
    private final int[][] levelMap;

    public PegTileMap(int[][] levelMap, GameLevel gameLevel) {
        super(new Coordinate2D(100, 100), new Size(700, 500));
        this.levelMap = levelMap;
        this.gameLevel = gameLevel;
    }

    @Override
    public void setupEntities() {
        addEntity(1, BonusCirclePeg.class, "sprites/BonusCirclePeg.png");
        addEntity(2, PowerupCirclePeg.class, "sprites/PowerupCirclePeg.png");
        addEntity(3, RegularCirclePeg.class, "sprites/RegularCirclePeg.png");
        addEntity(4, RequiredCirclePeg.class, "sprites/RequiredCirclePeg.png");
        addEntity(5, BonusRectanglePeg.class, "sprites/BonusRectanglePeg.png");
        addEntity(6, PowerupRectanglePeg.class, "sprites/PowerupRectanglePeg.png");
        addEntity(7, RegularRectanglePeg.class, "sprites/RegularRectanglePeg.png");
        addEntity(8, RequiredRectanglePeg.class, "sprites/RequiredRectanglePeg.png");
    }

    @Override
    public int[][] defineMap() {
        for (YaegerEntity y : this) {
            if (y instanceof RectanglePeg || y instanceof CirclePeg) {
                RectanglePeg.pegGameLevel = gameLevel;
                CirclePeg.pegGameLevel = gameLevel;
                break;
            }
        }
        return levelMap;
    }
}