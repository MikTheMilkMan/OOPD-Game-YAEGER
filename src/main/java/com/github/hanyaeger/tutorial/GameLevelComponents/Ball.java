package com.github.hanyaeger.tutorial.GameLevelComponents;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.BonusCirclePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.PowerupCirclePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.RegularCirclePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs.RequiredCirclePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.BonusRectanglePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.PowerupRectanglePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.RegularRectanglePeg;
import com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs.RequiredRectanglePeg;
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
        setFrictionConstant(0.008);
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        var angle = angleTo(getLocationInScene());
        var speed = getSpeed();

        if (sceneBorder == SceneBorder.BOTTOM) {
            if(gameLevel.powerupActive && gameLevel.whichPowerup == 3){
                gameLevel.addPowerupBall(new Coordinate2D(getLocationInScene().getX(), 100), getSpeed(), getDirection());
                gameLevel.powerupActive = false;
            }

            remove();
        } else if (sceneBorder == SceneBorder.TOP) {
            invertSpeedInDirection(angle - 180);
        } else if (sceneBorder == SceneBorder.LEFT) {
            invertSpeedInDirection(angle - Direction.RIGHT.getValue());
        } else if (sceneBorder == SceneBorder.RIGHT) {
            invertSpeedInDirection(angle + Direction.RIGHT.getValue());
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

        if((lowerLeftBall[0] >= upperLeftBallCollider[0] && lowerLeftBall[0] <= upperRightBallCollider[0]) || (lowerRightBall[0] >= upperLeftBallCollider[0] && lowerRightBall[0] <= upperRightBallCollider[0])){
            if(lowerLeftBall[1] < collider.getBoundingBox().getMaxY()){
                invertSpeedInDirection(angle);

            } else if (lowerLeftBall[1] > collider.getBoundingBox().getCenterY()){
                invertSpeedInDirection(angle - 180);
            }
        }

        setSpeed(speed);

        if(collider instanceof BonusRectanglePeg || collider instanceof BonusCirclePeg) {
            gameLevel.currentScore += 300 * pegsHit;
            scoreWithBall += 300 * pegsHit;
        } else if (collider instanceof PowerupRectanglePeg || collider instanceof PowerupCirclePeg){
            gameLevel.currentScore += 100 * pegsHit;
            scoreWithBall += 100 * pegsHit;
            gameLevel.powerupActive = true;
        } else if (collider instanceof RegularRectanglePeg || collider instanceof RegularCirclePeg) {
            gameLevel.currentScore += 100 * pegsHit;
            scoreWithBall += 100 * pegsHit;
        } else if (collider instanceof RequiredRectanglePeg || collider instanceof RequiredCirclePeg){
            gameLevel.currentScore += 100 * pegsHit;
            scoreWithBall += 100 * pegsHit;
        }

        gameLevel.currentScoreText.setText("Current score : " + gameLevel.currentScore);

        if(scoreWithBall >= 6500 && !extraBallGiven) {
            gameLevel.remainingBalls++;
            extraBallGiven = true;
        }

    }

}