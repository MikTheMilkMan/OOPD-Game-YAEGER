package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Buttons.QuitButton;
import com.github.hanyaeger.tutorial.Buttons.TitleMenuButton;
import com.github.hanyaeger.tutorial.Quaggle;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GameOver extends StaticScene {
    private final Quaggle quaggle;

    public GameOver(Quaggle quaggle){
        this.quaggle = quaggle;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/MainMenuBackground.png");

    }

    @Override
    public void setupEntities() {
        var gameOverText = new TextEntity(new Coordinate2D(getWidth() / 2, (getHeight() / 8) * 2), "Congratulations!\nYou've beaten every level!");
        gameOverText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        gameOverText.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 65));
        addEntity(gameOverText);

//        var titleMenuButton = new TitleMenuButton(new Coordinate2D(getWidth() / 2, (getHeight() / 5) * 3), quaggle, "TitleMenu");
//        titleMenuButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
//        titleMenuButton.setFill(Color.PINK);
//        titleMenuButton.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30));
//        addEntity(titleMenuButton);
//
//        var quitButton = new QuitButton(new Coordinate2D(getWidth() / 2, (getHeight() / 5) * 4), quaggle, "Quit");
//        quitButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
//        quitButton.setFill(Color.PINK);
//        quitButton.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 30));
//        addEntity(quitButton);
    }
}
