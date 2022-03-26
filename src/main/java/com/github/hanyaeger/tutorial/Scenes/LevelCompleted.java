package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Quaggle;

public class LevelCompleted extends StaticScene {
    private final Quaggle quaggle;

    public LevelCompleted(Quaggle quaggle){
        this.quaggle = quaggle;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/GameLevelCompleted.mp3");
    }

    @Override
    public void setupEntities() {

    }
}
