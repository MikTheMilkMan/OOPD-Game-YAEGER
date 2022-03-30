package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Buttons.QuitButton;
import com.github.hanyaeger.tutorial.Buttons.TitleMenuButton;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.Texts.HeaderText;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GameDone extends StaticScene {
    private final Quaggle quaggle;

    public GameDone(Quaggle quaggle){
        this.quaggle = quaggle;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/MainMenuBackground.png");
        setBackgroundAudio("audio/FullGameCompleted.mp3");
        setBackgroundAudioVolume(0.1);
    }

    @Override
    public void setupEntities() {
        //Headertext
        addEntity(new HeaderText(new Coordinate2D(getWidth() / 2, (getHeight() / 8) * 2), "Congratulations!"));

        //Subtext1 for header, "1" is added to the name in case more subtexts get added
        var gameOverSubtext1 = new TextEntity(new Coordinate2D(getWidth() / 2, (getHeight() / 8) * 3), "You've beaten every level!");
        gameOverSubtext1.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        gameOverSubtext1.setFont(Font.font("Comic Sans MS", 40));
        addEntity(gameOverSubtext1);

        //Button to go to the title menu
        addEntity(new TitleMenuButton(new Coordinate2D(getWidth() / 2, (getHeight() / 5) * 3), quaggle));

        //Button to quit the game
        addEntity(new QuitButton(new Coordinate2D(getWidth() / 2, (getHeight() / 5) * 4), quaggle));
    }
}
