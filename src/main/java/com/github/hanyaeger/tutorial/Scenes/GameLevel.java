package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.HighScoreText;
import com.github.hanyaeger.tutorial.GameLevelComponents.PegTileMap;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.*;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.Peg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.*;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.CurrentScoreText;
import javafx.stage.PopupWindow;


public class GameLevel extends DynamicScene implements TileMapContainer {
    private final Quaggle quaggle;

    private final int[][] testLevel = {
            {1, 1},
            {2, 2},
            {5, 5},
            {6, 6}
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
        }
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new PegTileMap(testLevel));
//        addTileMap(new PegTileMap(Level2));
    }

    @Override
    public void setupScene() {
    }

    @Override
    public void setupEntities() {
        //TextEntity that shows the current Score
        addEntity(new CurrentScoreText(new Coordinate2D(0, 40), "Current Score"));

        //TextEntity that shows the current Highscore
        addEntity(new HighScoreText(new Coordinate2D(700, 40), "Highscore"));
    }
}
