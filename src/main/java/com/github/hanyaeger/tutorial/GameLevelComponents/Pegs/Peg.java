package com.github.hanyaeger.tutorial.GameLevelComponents.Pegs;

import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;

public interface Peg extends Collided, Collider {
    int pegScore = 100;
    void onCollision(Collider collider);
}
