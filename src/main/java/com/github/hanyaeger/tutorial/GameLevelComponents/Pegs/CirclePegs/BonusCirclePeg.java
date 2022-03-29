package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs.CirclePegs;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import javafx.scene.paint.Color;

public class BonusCirclePeg extends CirclePeg {
    public BonusCirclePeg(Coordinate2D initialLocation, Size size) {
        super(initialLocation, size);
        setFill(Color.HOTPINK);
    }
}
