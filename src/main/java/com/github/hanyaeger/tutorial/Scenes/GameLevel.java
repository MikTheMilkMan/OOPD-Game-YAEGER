package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts.CurrentScoreText;

public class GameLevel extends DynamicScene {
    private Quaggle quaggle;
    private int currentScore = 0;

    public GameLevel(Quaggle quaggle){
        this.quaggle = quaggle;
    }

    @Override
    public void setupScene() {

    }

    @Override
    public void setupEntities() {
        //TextEntity that shows the current score
        addEntity(new CurrentScoreText(new Coordinate2D(0, 40), "current score"));
    }


}
