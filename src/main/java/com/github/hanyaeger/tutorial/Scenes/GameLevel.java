package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.HighScoreText;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.CurrentScoreText;


public class GameLevel extends DynamicScene implements TileMapContainer {
    private Quaggle quaggle;
    private int currentScore = 0;

    private int[][] Level1;
    private int[][] Level2;
    private int[][] Level3;
    private int[][] Level4;
    private int[][] Level5;

    public GameLevel(Quaggle quaggle){
        this.quaggle = quaggle;
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
        
    }
}
