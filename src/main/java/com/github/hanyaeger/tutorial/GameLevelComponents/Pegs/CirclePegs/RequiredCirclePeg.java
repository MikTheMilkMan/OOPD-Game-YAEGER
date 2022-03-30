package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import javafx.scene.paint.Color;

public class RequiredCirclePeg extends CirclePeg {
    public RequiredCirclePeg(Coordinate2D initialLocation, Size size) {
        super(initialLocation, size);
        setFill(Color.ORANGE);
    }

    public void onCollision(Collider collider) {
        remove();

        if(!isHit) {
            isHit = true;
            gameLevel.requiredPegsleft--;
            gameLevel.currentScore += pegScore;
            gameLevel.ball.addToScoreWithBall(pegScore);
            System.out.println(gameLevel.requiredPegsleft);
        }
    }
}
