package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import com.github.hanyaeger.tutorial.GameLevelComponents.BallCannon.BallCannon;
import com.github.hanyaeger.tutorial.GameLevelComponents.CursorEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.HighScoreText;
import com.github.hanyaeger.tutorial.GameLevelComponents.PegTileMap;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.CurrentScoreText;


public class GameLevel extends DynamicScene implements TileMapContainer, MouseMovedListener {
    private final Quaggle quaggle;
    private CursorEntity cursor;

    private final int[][] testLevel = {
            {0, 0},
            {0, 0}
    };

    private final int[][] Level1 = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0},
            {0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 3, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0},
            {3, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, 3, 0, 1},
            {0, 0, 2, 4, 0, 0, 1, 0, 0, 0, 0, 0, 0, 3, 0, 4, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 1, 0, 3, 0},
            {2, 3, 1, 0, 0, 2, 0, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 1, 4},
    };

    private final int[][] Level2 = {
            {2, 2},
            {2, 2}
    };

    private final int[][] Level3 = {
            {3, 3},
            {3, 3}
    };
    private final int[][] Level4 = {
            {4, 4},
            {4, 4}
    };

    private final int[][] Level5 = {
            {5, 5},
            {5, 5}
    };



    public int[][] currentLevel;
    public int currentScore = 0;


    public GameLevel(Quaggle quaggle, int whichLevel) {
        this.quaggle = quaggle;
        if (whichLevel == 1) {
            currentLevel = Level1;
        } else if (whichLevel == 2) {
            currentLevel = Level2;
        } else if (whichLevel == 3) {
            currentLevel = Level3;
        } else if (whichLevel == 4) {
            currentLevel = Level4;
        } else if (whichLevel == 5) {
            currentLevel = Level5;
        } else {
            currentLevel = testLevel;
        }
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new PegTileMap(testLevel, this));
    }

    @Override
    public void setupScene() {
    }

    @Override
    public void setupEntities() {
        cursor = new CursorEntity(new Coordinate2D(0, 0));
        addEntity(cursor);

        //TextEntity that shows the current Score
        addEntity(new CurrentScoreText(new Coordinate2D(0, 40), "Current Score"));

        //TextEntity that shows the current Highscore
        addEntity(new HighScoreText(new Coordinate2D(700, 40), "Highscore"));

//        addEntity(new BallCannon(new Coordinate2D(getWidth() / 2, 100), new Coordinate2D(getWidth() / 2, 120), this, "sprites/BallCannon.png"));


        var cannon = new BallCannon(new Coordinate2D(getWidth() / 2, 50), this, cursor);
        cannon.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(cannon);
    }

    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {
        cursor.setAnchorLocation(coordinate2D);
    }
}
