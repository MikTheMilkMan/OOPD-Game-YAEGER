package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.MouseButtonReleasedListener;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import com.github.hanyaeger.tutorial.GameLevelComponents.Ball;
import com.github.hanyaeger.tutorial.GameLevelComponents.BallCannon.BallCannon;
import com.github.hanyaeger.tutorial.GameLevelComponents.CursorEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.HighScoreText;
import com.github.hanyaeger.tutorial.GameLevelComponents.PegTileMap;
import com.github.hanyaeger.tutorial.GameLevelComponents.Levels;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.CurrentScoreText;
import javafx.scene.input.MouseButton;


public class GameLevel extends DynamicScene implements TileMapContainer, MouseMovedListener, MouseButtonReleasedListener, Levels {
    private final Quaggle quaggle;

    private CursorEntity cursor = new CursorEntity(new Coordinate2D(0, 0));
    protected BallCannon cannon;
    public Ball ball;

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
        addEntity(cursor);

        //TextEntity that shows the current Score
        addEntity(new CurrentScoreText(new Coordinate2D(0, 40), "Current Score"));

        //TextEntity that shows the current Highscore
        addEntity(new HighScoreText(new Coordinate2D(700, 40), "Highscore"));

        cannon = new BallCannon(new Coordinate2D(getWidth() / 2, 50), this, cursor);
        cannon.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(cannon);

//        addEntity(new Ball(new Coordinate2D(300, 300), this, cursor));
    }

    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {
        cursor.setAnchorLocation(coordinate2D);
    }

    @Override
    public void onMouseButtonReleased(MouseButton mouseButton, Coordinate2D coordinate2D) {
        var angle = cannon.angleTo(cursor);
        var distance = cannon.distanceTo(cursor) / 25;
        ball = new Ball(new Coordinate2D(getWidth() / 2, 100), this, cursor);

        //if we have time left, put these variable changing things in class Ball
        ball.setDirection(angle);
        ball.setSpeed(distance);
        ball.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        //end of note

        addEntity(ball);
    }
}
