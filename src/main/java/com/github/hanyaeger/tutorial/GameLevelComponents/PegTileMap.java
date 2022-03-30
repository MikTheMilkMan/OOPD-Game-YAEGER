package com.github.hanyaeger.tutorial.GameLevelComponents;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.YaegerEntity;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.*;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.*;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PegTileMap extends TileMap implements Collider, Collided {
    private final GameLevel gameLevel;
    private final int[][] levelMap;

    public PegTileMap(int[][] levelMap, GameLevel gameLevel) {
        super(new Coordinate2D(100, 100), new Size(gameLevel.getWidth() - 100, gameLevel.getHeight() - 200));
        this.levelMap = levelMap;
        this.gameLevel = gameLevel;
    }

    @Override
    public void setupEntities() {
        addEntity(1, BonusCirclePeg.class);
        addEntity(2, PowerupCirclePeg.class);
        addEntity(3, RegularCirclePeg.class);
        addEntity(4, RequiredCirclePeg.class);
        addEntity(5, BonusRectanglePeg.class);
        addEntity(6, PowerupRectanglePeg.class);
        addEntity(7, RegularRectanglePeg.class);
        addEntity(8, RequiredRectanglePeg.class);

        RectanglePeg.gameLevel = gameLevel;
        CirclePeg.gameLevel = gameLevel;
    }

    @Override
    public int[][] defineMap() {
        return levelMap;
    }

    @Override
    public void onCollision(Collider collider) {

    }

    public void removeTileMapEntity(int location1){
        List<YaegerEntity> yel = this.get();
        YaegerEntity toBeRemoved = yel.get(location1);
        remove(toBeRemoved);
    }

    @Override
    public Optional<? extends Node> getNode() {
        return Optional.empty();
    }
}