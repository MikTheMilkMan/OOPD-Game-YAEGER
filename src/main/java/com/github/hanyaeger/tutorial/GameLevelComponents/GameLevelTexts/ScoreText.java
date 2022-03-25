package com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicTextEntity;

public abstract class ScoreText extends DynamicTextEntity {
    public ScoreText(Coordinate2D initialLocation, String score) {
        super(initialLocation, score);
    }
}
