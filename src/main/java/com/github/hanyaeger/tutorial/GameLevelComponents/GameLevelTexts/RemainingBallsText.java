package com.github.hanyaeger.tutorial.GameLevelComponents.GameLevelTexts;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicTextEntity;

public class RemainingBallsText extends DynamicTextEntity {
    public RemainingBallsText(Coordinate2D initialLocation, String remainingBalls) {
        super(initialLocation, remainingBalls);
    }
}
