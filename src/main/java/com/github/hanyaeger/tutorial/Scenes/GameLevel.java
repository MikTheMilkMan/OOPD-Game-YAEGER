package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.api.userinput.MouseButtonReleasedListener;
import com.github.hanyaeger.api.userinput.MouseMovedListener;
import com.github.hanyaeger.tutorial.GameLevelComponents.Ball;
import com.github.hanyaeger.tutorial.GameLevelComponents.BallCannon.BallCannon;
import com.github.hanyaeger.tutorial.GameLevelComponents.CursorEntity;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.RemainingBallsText;
import com.github.hanyaeger.tutorial.GameLevelComponents.PegTileMap;
import com.github.hanyaeger.tutorial.GameLevelComponents.Levels;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.RectanglePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Powerups.DoubleBouncy;
import com.github.hanyaeger.tutorial.GameLevelComponents.Powerups.OrangeBegone;
import com.github.hanyaeger.tutorial.GameLevelComponents.Powerups.Powerup;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.CurrentScoreText;
import javafx.scene.input.MouseButton;

import java.util.Random;

import static java.lang.Math.ceil;
import static java.lang.Math.random;

public class GameLevel extends DynamicScene implements TileMapContainer, MouseMovedListener, MouseButtonReleasedListener, Levels {
    private final Quaggle quaggle;
    private CursorEntity cursor = new CursorEntity(new Coordinate2D(0, 0));

    public BallCannon cannon;
    public Ball ball;

    public PegTileMap pegTileMap;
    public int[][] currentLevel;
    public int currentScore = 0;
    public int remainingBalls = 5;
    public CurrentScoreText currentScoreText;
    public RemainingBallsText remainingBallsText;
    public int whichPowerup;
    public boolean powerupActive = false;

    public GameLevel(Quaggle quaggle, int whichLevel) {
        this.quaggle = quaggle;
        if (whichLevel == 1) {
            currentLevel = Level1;
            whichPowerup = 3;
        } else if (whichLevel == 2) {
            currentLevel = Level2;
            whichPowerup = 2;
        } else if (whichLevel == 3) {
            currentLevel = Level3;
            whichPowerup = 3;
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
        pegTileMap = new PegTileMap(Level1, this);
        addTileMap(pegTileMap);
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/LeukLiedje.mp3");
        setBackgroundAudioVolume(0.1);
    }

    @Override
    public void setupEntities() {
        addEntity(cursor);

        //TextEntity that shows the current Score
        currentScoreText = new CurrentScoreText(new Coordinate2D(0, 40), "Current Score: " + currentScore);
        //setSize bigger
        addEntity(currentScoreText);

        remainingBallsText = new RemainingBallsText(new Coordinate2D(0, 80), "Balls Remaining: " + remainingBalls);
        //setSize bigger
        addEntity(remainingBallsText);

        cannon = new BallCannon(new Coordinate2D(getWidth() / 2, 50), this, cursor);
        cannon.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(cannon);
    }

    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {
        cursor.setAnchorLocation(coordinate2D);
    }

    @Override
    public void onMouseButtonReleased(MouseButton mouseButton, Coordinate2D coordinate2D) {
        if(remainingBalls > 0) {
            remainingBalls--;
            remainingBallsText.setText("Balls Remaining: " + remainingBalls);

            var angle = cannon.angleTo(cursor);
            var distance = cannon.distanceTo(cursor) / 25;
            if(distance > 25){
                distance = 25;
            }
            ball = new Ball(new Coordinate2D(getWidth() / 2, 100), this, cursor);

            if(powerupActive) {
                if (whichPowerup == 1) {
                    new DoubleBouncy(ball);
                    powerupActive = false;
                } else if (whichPowerup == 2) {
                    remainingBalls++;
                }
            }

            //if we have time left, put these variable changing things in class Ball
            ball.setDirection(angle);
            ball.setSpeed(distance);
            ball.setAnchorPoint(AnchorPoint.CENTER_CENTER);
            //end of note

            addEntity(ball);
        }
    }

    public void addPowerupBall(Coordinate2D coordinate2D, double speed, double direction){
        var tempBall = new Ball(coordinate2D, this, cursor);
        tempBall.setDirection(direction);
        tempBall.setSpeed(speed);
        tempBall.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(tempBall);
    }
}
