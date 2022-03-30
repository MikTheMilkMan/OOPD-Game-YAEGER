package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.RectanglePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import javafx.scene.paint.Color;

public class BonusRectanglePeg extends RectanglePeg {
    public BonusRectanglePeg(Coordinate2D initialLocation, Size size) {
        super(initialLocation, size);
        setFill(Color.HOTPINK);
    }

    public void onCollision(Collider collider) {
        remove();

        if(!isHit){
            isHit = true;
            gameLevel.currentScore += pegScore * 3;
            gameLevel.ball.addToScoreWithBall(pegScore * 3);
        }
    }
}
