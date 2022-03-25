package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Buttons.StartButton;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.Buttons.QuitButton;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MainMenu extends StaticScene {
    private final Quaggle quaggle;

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
        //Text in the Main Menu showing the name of the game
        var mainMenuText = new TextEntity(new Coordinate2D(getWidth() / 2, getHeight() / 4), "Quaggle");
        mainMenuText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        mainMenuText.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 80));
        addEntity(mainMenuText);

        //Button in the Main Menu which allows you to start the game
        addEntity(new StartButton(new Coordinate2D(getWidth() / 2, getHeight() / 2), quaggle, "Start"));

        //Button in the Main Menu which allows you to quit the game
        var quitButton = new QuitButton(new Coordinate2D(getWidth() / 2, (getHeight() / 4) * 3), quaggle, "Quit");
        quitButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        quitButton.setFill(Color.PINK);
        quitButton.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30));
        addEntity(quitButton);
    }
}

