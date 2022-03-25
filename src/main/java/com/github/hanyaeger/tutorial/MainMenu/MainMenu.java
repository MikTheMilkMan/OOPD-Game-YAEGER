package com.github.hanyaeger.tutorial.MainMenu;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.QuitButton;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MainMenu extends StaticScene {
    private Quaggle quaggle;

    public MainMenu(Quaggle quaggle){
        this.quaggle = quaggle;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/clown_music.mp3");

        //DELETE THIS WHEN TURNING IN PROJECT
        setBackgroundAudioVolume(0.1);
        //PLEASE DO NOT FORGET TO DELETE THIS WHEN TURNING IN PROJECT
        //I BEG OF YOU
        //P L E A S E
        //thanks

        setBackgroundImage("backgrounds/MainMenuBackground.png");
    }

    @Override
    public void setupEntities() {
        var mainMenuText = new TextEntity(new Coordinate2D(getWidth() / 2, getHeight() / 4), "Quaggle");
        mainMenuText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        mainMenuText.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 80));
        addEntity(mainMenuText);

        addEntity(new StartButton(new Coordinate2D(getWidth() / 2, getHeight() / 2), quaggle, "Start"));
        addEntity(new QuitButton(new Coordinate2D(getWidth() / 2, (getHeight() / 4) * 3), quaggle, "Quit"));

    }
}

