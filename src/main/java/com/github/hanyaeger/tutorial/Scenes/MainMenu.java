package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Buttons.StartButton;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.Buttons.QuitButton;

import com.github.hanyaeger.tutorial.Texts.HeaderText;


public class MainMenu extends StaticScene {
    private final Quaggle quaggle;

    public MainMenu(Quaggle quaggle){
        this.quaggle = quaggle;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/MainMenuBackground.png");
        setBackgroundAudio("audio/clown_music.mp3");
        setBackgroundAudioVolume(0.1);
    }

    @Override
    public void setupEntities() {
        //Text in the Main Menu showing the name of the game
        addEntity(new HeaderText(new Coordinate2D(getWidth() / 2, getHeight() / 4), "Quaggle"));

        //Button in the Main Menu which allows you to start the game
        addEntity(new StartButton(new Coordinate2D(getWidth() / 2, getHeight() / 2), quaggle));

        //Button in the Main Menu which allows you to quit the game
        addEntity(new QuitButton(new Coordinate2D(getWidth() / 2, (getHeight() / 4) * 3), quaggle));
    }
}

