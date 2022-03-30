package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import javafx.scene.paint.Color;

public class PowerupCirclePeg extends CirclePeg {
    public PowerupCirclePeg(Coordinate2D initialLocation, Size size) {
        super(initialLocation, size);
        setFill(Color.GREEN);
    }

    public void onCollision(Collider collider) {
        if(!isHit){
            super.onCollision(collider);
            isHit = true;
            gameLevel.currentScore += pegScore;
            gameLevel.ball.addToScoreWithBall(pegScore);
            gameLevel.powerupActive = true;
        }
    }
}


