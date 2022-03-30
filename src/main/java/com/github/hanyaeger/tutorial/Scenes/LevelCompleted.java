package com.github.hanyaeger.tutorial.Scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Buttons.NextLevelButton;
import com.github.hanyaeger.tutorial.Quaggle;
import com.github.hanyaeger.tutorial.Texts.HeaderText;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class LevelCompleted extends StaticScene {
    private final Quaggle quaggle;
    private final int nextLevel;


    /**
     * @param quaggle
     * @param nextLevel
     */
    public LevelCompleted(Quaggle quaggle, int nextLevel){
        this.quaggle = quaggle;
        this.nextLevel = nextLevel;
    }

    /**
     *
     */
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/GameLevelCompleted.mp3");
        setBackgroundAudioVolume(0.1);
    }

    @Override
    public void setupEntities() {
        var completedText = new TextEntity(new Coordinate2D( getWidth() / 2, getHeight() / 3), "Congratulations! You've Beaten this Level!");
        completedText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        completedText.setFont(Font.font("Comic Sans MS", FontWeight.EXTRA_BOLD, 40));
        addEntity(completedText);

        var button1 = new NextLevelButton(new Coordinate2D(getWidth() / 2, getHeight() / 2), quaggle, "Next Level", nextLevel);
        button1.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        button1.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        addEntity(button1);
    }
}
