package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs;

import com.github.hanyaeger.api.entities.Collided;

public interface Peg extends Collided {
    int pointsForPeg = 100;
    int entityID = 0;
    String spriteImagePath = null;
}
