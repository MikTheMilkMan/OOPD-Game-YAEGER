package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs;

import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.tutorial.Scenes.GameLevel;

public interface Peg extends Collided {
    int pointsForPeg = 100;
    String spriteImagePath = null;
}
