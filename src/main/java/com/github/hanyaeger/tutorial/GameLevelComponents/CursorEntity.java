package com.github.hanyaeger.tutorial.GameLevelComponents;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import javafx.scene.paint.Color;

public class CursorEntity extends DynamicCircleEntity {
    public CursorEntity(Coordinate2D initialLocation) {
        super(initialLocation);
        setRadius(5);
        setFill(Color.RED);
    }
}
