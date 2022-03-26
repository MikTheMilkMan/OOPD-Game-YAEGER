package com.github.hanyaeger.tutorial.Texts;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HeaderText extends TextEntity {
    public HeaderText(Coordinate2D initialLocation, String text) {
        super(initialLocation, text);
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 80));
    }


}
