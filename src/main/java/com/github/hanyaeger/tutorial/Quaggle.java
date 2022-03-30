package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.Scenes.*;

public class Quaggle extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Quaggle");
        setSize(new Size(1092, 819));
    }

    @Override
    public void setupScenes() {
//        Adds a MainMenu scene
        addScene(0, new MainMenu(this));

//        Adds all GameLevels
        addScene(1, new GameLevel(this, 1));
        addScene(7, new LevelFailed(this, 1));
        addScene(8, new LevelCompleted(this, 2));

        addScene(2, new GameLevel(this, 2));
        addScene(9, new LevelFailed(this, 2));
        addScene(10, new LevelCompleted(this, 3));

        addScene(3, new GameLevel(this, 3));
        addScene(11, new LevelFailed(this, 3));
        addScene(12, new LevelCompleted(this, 4));

        addScene(4, new GameLevel(this, 4));
        addScene(13, new LevelFailed(this, 4));
        addScene(14, new LevelCompleted(this, 5));

        addScene(5, new GameLevel(this, 5));
        addScene(15, new LevelFailed(this, 5));
        addScene(16, new LevelCompleted(this, 6));

        addScene(6, new GameOver(this));
    }
}
