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
        //Adds a MainMenu scene
        addScene(0, new MainMenu(this));

        //Adds all GameLevels
        addScene(1, new GameLevel(this, 1));
        addScene(2, new GameLevel(this, 2));
        addScene(3, new GameLevel(this, 3));
        addScene(4, new GameLevel(this, 4));
        addScene(5, new GameLevel(this, 5));

        //Adds a GameOver scene
        addScene(6, new GameOver(this));
    }
}
