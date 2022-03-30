package com.github.hanyaeger.tutorial.GameLevelComponents.Powerups;

import com.github.hanyaeger.tutorial.GameLevelComponents.Ball;

public class DoubleBouncy {
    public DoubleBouncy(Ball ball){
        ball.setFrictionConstant(0.004);
    }
}
