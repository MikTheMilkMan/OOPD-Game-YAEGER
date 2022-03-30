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
import com.github.hanyaeger.tutorial.GameLevelComponents.Powerups.DoubleBouncy;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.CurrentScoreText;
import javafx.scene.input.MouseButton;

public class GameLevel extends DynamicScene implements TileMapContainer, MouseMovedListener, MouseButtonReleasedListener, Levels {
    public final Quaggle quaggle;
    private CursorEntity cursor = new CursorEntity(new Coordinate2D(0, 0));

    public BallCannon cannon;
    public Ball ball;
    public CurrentScoreText currentScoreText;
    public RemainingBallsText remainingBallsText;
    public PegTileMap pegTileMap;

    public int whichLevel;
    public int[][] currentLevelLayout;
    public int requiredPegsRemaining;
    public int whichPowerup;
    public boolean powerupActive = false;

    public int currentScore = 0;
    public int remainingBalls = 5;
    public int ballsOnScreen = 0;

    public GameLevel(Quaggle quaggle, int whichLevel) {
        this.quaggle = quaggle;
        this.whichLevel = whichLevel;

        if (whichLevel == 1) {
            currentLevelLayout = Level1;
            whichPowerup = 1;
            requiredPegsRemaining = level1AmountOfRequiredPegs;
        } else if (whichLevel == 2) {
            currentLevelLayout = Level2;
            whichPowerup = 2;
            requiredPegsRemaining = level2AmountOfRequiredPegs;
        } else if (whichLevel == 3) {
            currentLevelLayout = Level3;
            whichPowerup = 3;
            requiredPegsRemaining = level3AmountOfRequiredPegs;
        } else if (whichLevel == 4) {
            currentLevelLayout = Level4;
            whichPowerup = 1;
            requiredPegsRemaining = level4AmountOfRequiredPegs;
        } else if (whichLevel == 5) {
            currentLevelLayout = Level5;
            whichPowerup = 2;
            requiredPegsRemaining = level5AmountOfRequiredPegs;
        } else {
            currentLevelLayout = testLevel;
            whichPowerup = 1;
            requiredPegsRemaining = testLevelAmountOfRequiredPegs;
        }
    }

    @Override
    public void setupTileMaps() {
        pegTileMap = new PegTileMap(Level1, this);
        addTileMap(pegTileMap);
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/MainMenuBackground.png");
        setBackgroundAudio("audio/LeukLiedje.mp3");
        setBackgroundAudioVolume(0.1);
    }

    @Override
    public void setupEntities() {
        addEntity(cursor);

        currentScoreText = new CurrentScoreText(new Coordinate2D(0, 40), "Current Score: " + currentScore);
        addEntity(currentScoreText);

        remainingBallsText = new RemainingBallsText(new Coordinate2D(0, 80), "Balls Remaining: " + remainingBalls);
        addEntity(remainingBallsText);

        cannon = new BallCannon(new Coordinate2D(getWidth() / 2, 50), this, cursor);
        cannon.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(cannon);
    }

    @Override
    public void onMouseMoved(Coordinate2D coordinate2D) {
        cursor.setAnchorLocation(coordinate2D);
        levelDone();
    }

    @Override
    public void onMouseButtonReleased(MouseButton mouseButton, Coordinate2D coordinate2D) {
        if (remainingBalls > 0 && ballsOnScreen == 0) {
            remainingBalls--;
            remainingBallsText.setText("Balls Remaining: " + remainingBalls);

            var angle = cannon.angleTo(cursor);
            var distance = cannon.distanceTo(cursor) / 25;
            if (distance > 10) {
                distance = 10;
            }
            ball = new Ball(new Coordinate2D(getWidth() / 2, 100), this);

            if (powerupActive) {
                if (whichPowerup == 1) {
                    new DoubleBouncy(ball);
                    powerupActive = false;
                } else if (whichPowerup == 2) {
                    remainingBalls++;
                }
            }

            ball.setDirection(angle);
            ball.setSpeed(distance);
            ball.setAnchorPoint(AnchorPoint.CENTER_CENTER);

            ballsOnScreen++;
            addEntity(ball);
        }
    }

    public void addPowerupBall(Coordinate2D coordinate2D, double speed, double direction) {
        var tempBall = new Ball(coordinate2D, this);
        tempBall.setDirection(direction);
        tempBall.setSpeed(speed);
        tempBall.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        ballsOnScreen++;
        addEntity(tempBall);
    }

    public void levelDone() {
        if (requiredPegsRemaining == 0 && ballsOnScreen == 0) {
            if (whichLevel == 1) {
                quaggle.setActiveScene(8);
            } else if (whichLevel == 2) {
                quaggle.setActiveScene(10);
            } else if (whichLevel == 3) {
                quaggle.setActiveScene(12);
            } else if (whichLevel == 4) {
                quaggle.setActiveScene(14);
            } else if (whichLevel == 5) {
                quaggle.setActiveScene(16);
            }
        } else if (requiredPegsRemaining > 0 && remainingBalls == 0 && ballsOnScreen == 0) {
            if (whichLevel == 1) {
                quaggle.setActiveScene(7);
            } else if (whichLevel == 2) {
                quaggle.setActiveScene(9);
            } else if (whichLevel == 3) {
                quaggle.setActiveScene(11);
            } else if (whichLevel == 4) {
                quaggle.setActiveScene(13);
            } else if (whichLevel == 5) {
                quaggle.setActiveScene(15);
            }

        }
    }
}
