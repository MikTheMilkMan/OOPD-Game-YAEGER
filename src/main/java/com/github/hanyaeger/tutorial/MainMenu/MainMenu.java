package com.github.hanyaeger.tutorial.MainMenu;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Quaggle;
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
        setBackgroundAudioVolume(0.1);
        setBackgroundImage("backgrounds/MainMenuBackground.png");
    }

    @Override
    public void setupEntities() {
        var mainMenuText = new TextEntity(new Coordinate2D(getWidth() / 2, getHeight() / 4), "Quaggle");
        mainMenuText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        mainMenuText.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 80));
        addEntity(mainMenuText);

        addEntity(new StartButton(new Coordinate2D(getWidth() / 2, getHeight() / 2), quaggle, "Start", 0));
    }
}

