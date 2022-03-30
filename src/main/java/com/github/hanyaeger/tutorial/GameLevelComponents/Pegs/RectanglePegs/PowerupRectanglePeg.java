package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;
import javafx.scene.paint.Color;

public class PowerupRectanglePeg extends RectanglePeg {
    public PowerupRectanglePeg(Coordinate2D initialLocation, Size size) {
        super(initialLocation, size);
        setFill(Color.GREEN);
    }

    public void onCollision(Collider collider) {
        super.onCollision(collider);
        if(!isHit){
            isHit = true;
            gameLevel.currentScore += pegScore;
            gameLevel.ball.addToScoreWithBall(pegScore);
            gameLevel.powerupActive = true;
        }
    }
}
