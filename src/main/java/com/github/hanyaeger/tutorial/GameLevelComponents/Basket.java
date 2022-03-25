package com.github.hanyaeger.tutorial.GameLevelComponents;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.core.entities.motion.MotionApplier;
import javafx.scene.Node;

import java.util.Optional;

public class Basket implements SceneBorderTouchingWatcher{
    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {

    }

    @Override
    public void setMotionApplier(MotionApplier motionApplier) {

    }

    @Override
    public MotionApplier getMotionApplier() {
        return null;
    }

    @Override
    public void setAnchorLocationX(double v) {

    }

    @Override
    public void setAnchorLocationY(double v) {

    }

    @Override
    public void setAnchorLocation(Coordinate2D coordinate2D) {

    }

    @Override
    public Coordinate2D getAnchorLocation() {
        return null;
    }

    @Override
    public void transferCoordinatesToNode() {

    }

    @Override
    public void setAnchorPoint(AnchorPoint anchorPoint) {

    }

    @Override
    public AnchorPoint getAnchorPoint() {
        return null;
    }

    @Override
    public Optional<? extends Node> getNode() {
        return Optional.empty();
    }
}
