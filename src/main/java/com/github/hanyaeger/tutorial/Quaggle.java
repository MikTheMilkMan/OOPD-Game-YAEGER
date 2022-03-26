package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;
import com.github.hanyaeger.tutorial.Scenes.GameOver;
import com.github.hanyaeger.tutorial.Scenes.MainMenu;

public class Quaggle extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Quaggle");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {
//        addScene(0, new MainMenu(this));
//        addScene(1, new GameLevel(this));
//        addScene(2, new GameOver(this));

    }
}
