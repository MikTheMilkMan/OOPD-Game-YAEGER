package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.HighScoreText;
import com.github.hanyaeger.tutorial.GameLevelComponents.PegTileMap;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.BonusCirclePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.CirclePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.PowerupCirclePeg;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.CurrentScoreText;


public class GameLevel extends DynamicScene implements TileMapContainer {
    private final Quaggle quaggle;
    private final int[][] Level1 = {
            {1, 1},
            {1, 1}
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

    private BonusCirclePeg tileMapEntityBonusCircle = new BonusCirclePeg(new Coordinate2D(-100, -100), "sprites/BonusCirclePeg.png", 9999, this);
    private PowerupCirclePeg tileMapEntityPowerupCircle = new PowerupCirclePeg(new Coordinate2D(-100, -100), "sprites/PowerupCirclePeg.png", 99999, this);

    private CirclePeg[] circlePegs = {tileMapEntityBonusCircle, tileMapEntityPowerupCircle};

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
    public void setupScene() {

    }

    @Override
    public void setupEntities() {
        //TextEntity that shows the current Score
        addEntity(new CurrentScoreText(new Coordinate2D(0, 40), "Current Score"));

        //TextEntity that shows the current Highscore
        addEntity(new HighScoreText(new Coordinate2D(700, 40), "Highscore"));
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new PegTileMap(currentLevel, circlePegs));
    }
}
