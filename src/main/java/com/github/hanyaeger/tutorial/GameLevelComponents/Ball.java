package com.github.hanyaeger.tutorial.GameLevelComponents;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.Peg;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;
import javafx.scene.Scene;


public class Ball extends DynamicCircleEntity implements Collided, Collider, Newtonian, SceneBorderTouchingWatcher {
    public GameLevel gameLevel;
    private CursorEntity cursor;
    private int pegsHit = 0;
    private int scoreWithBall = 0;
    private boolean extraBallGiven = false;

    public Ball(Coordinate2D initialLocation, GameLevel gameLevel, CursorEntity cursor) {
        super(initialLocation);
        setRadius(14);
        this.gameLevel = gameLevel;
        this.cursor = cursor;

        setGravityDirection(0);
        setGravityConstant(0.05);
        setFrictionConstant(0.002);
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        var angle = angleTo(getLocationInScene());
        var speed = getSpeed();

        if (sceneBorder.equals(SceneBorder.BOTTOM)) {
            if (gameLevel.powerupActive && gameLevel.whichPowerup == 3) {
                gameLevel.addPowerupBall(new Coordinate2D(getLocationInScene().getX(), 100), getSpeed(), getDirection());
                gameLevel.powerupActive = false;
            }
            gameLevel.ballsOnScreen--;
            remove();
        } else if (sceneBorder.equals(SceneBorder.TOP)) {
            invertSpeedInDirection(180);
        } else if (sceneBorder.equals(SceneBorder.LEFT)) {
            invertSpeedInDirection(Direction.LEFT.getValue());
        } else if (sceneBorder.equals(SceneBorder.RIGHT)) {
            invertSpeedInDirection(Direction.RIGHT.getValue());
        }
        setSpeed(speed);
    }

    @Override
    public void onCollision(Collider collider) {
        pegsHit++;

        var speed = getSpeed();
        var angle = angleTo(getLocationInScene());

        //0 = x,  1 = y
        double[] lowerLeftBall = {getBoundingBox().getMinX(), getBoundingBox().getMaxY()};
        double[] lowerRightBall = {getBoundingBox().getMaxX(), getBoundingBox().getMaxY()};

        double[] upperLeftBallCollider = {collider.getBoundingBox().getMinX(), collider.getBoundingBox().getMinY()};
        double[] upperRightBallCollider = {collider.getBoundingBox().getMaxX(), collider.getBoundingBox().getMinY()};

        if ((lowerLeftBall[0] >= upperLeftBallCollider[0] && lowerLeftBall[0] <= upperRightBallCollider[0]) || (lowerRightBall[0] >= upperLeftBallCollider[0] && lowerRightBall[0] <= upperRightBallCollider[0])) {
            if (lowerLeftBall[1] < collider.getBoundingBox().getMaxY()) {
                invertSpeedInDirection(angle);

            } else if (lowerLeftBall[1] > collider.getBoundingBox().getCenterY()) {
                invertSpeedInDirection(angle - 180);
            }
        }

        setSpeed(speed);

        if (collider instanceof Peg) {
            Peg p = (Peg) collider;
            p.onCollision(this);
        }

        gameLevel.currentScoreText.setText("Current score : " + gameLevel.currentScore);

        if (scoreWithBall >= 6500 && !extraBallGiven) {
            gameLevel.remainingBalls++;
            extraBallGiven = true;
        }
    }




    public void addToScoreWithBall(int score) {
        scoreWithBall += score;
    }
}