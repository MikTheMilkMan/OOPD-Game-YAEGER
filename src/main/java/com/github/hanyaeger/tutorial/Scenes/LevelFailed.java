package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Buttons.NextLevelButton;
import com.github.hanyaeger.tutorial.Buttons.RetryButton;
import com.github.hanyaeger.tutorial.Quaggle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LevelFailed extends StaticScene {
    private final Quaggle quaggle;
    private final int lastLevel;

    public LevelFailed(Quaggle quaggle, int lastLevel){
        this.quaggle = quaggle;
        this.lastLevel = lastLevel;
    }

    @Override
    public void setupScene() {

    }

    @Override
    public void setupEntities() {
        var failedText = new TextEntity(new Coordinate2D( getWidth() / 2, getHeight() / 3), "What a shame...");
        failedText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        failedText.setFont(Font.font("Comic Sans MS", FontWeight.EXTRA_BOLD, 40));
        addEntity(failedText);

        var retryButton = new RetryButton(new Coordinate2D(getWidth() / 2, getHeight() / 2), quaggle, "Retry Level", lastLevel);
        retryButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        retryButton.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        addEntity(retryButton);
    }
}
