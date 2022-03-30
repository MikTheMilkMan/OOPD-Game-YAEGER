package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Buttons.NextLevelButton;
import com.github.hanyaeger.tutorial.Quaggle;

public class LevelCompleted extends StaticScene {
    private final Quaggle quaggle;
    private int nextLevel;

    public LevelCompleted(Quaggle quaggle, int nextLevel){
        this.quaggle = quaggle;
        this.nextLevel = nextLevel;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/GameLevelCompleted.mp3");
        setBackgroundAudioVolume(0.1);
    }

    @Override
    public void setupEntities() {
        var button1 = new NextLevelButton(new Coordinate2D(getWidth() / 3, getHeight() / 2), quaggle, "Next Level", nextLevel);
        button1.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(button1);
    }
}
